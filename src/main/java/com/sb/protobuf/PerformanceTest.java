package com.sb.protobuf;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;
import com.sb.json.JPerson;
import com.sb.models.Person;

public class PerformanceTest {
    public static void main(String[] args) {

        // Json
        JPerson person = new JPerson();
        person.setName("Sam");
        person.setAge(10);

        ObjectMapper mapper = new ObjectMapper();

        Runnable json = () -> {
            try {
                byte[] bytes = mapper.writeValueAsBytes(person);
                System.out.println(bytes.length);
                JPerson person1 = mapper.readValue(bytes, JPerson.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        // protobuf

        Person sam = Person.newBuilder().setName("Sam").setAge(10).build();
        Runnable proto = () -> {
            try {
                byte[] bytes = sam.toByteArray();
                System.out.println(bytes.length);
                Person sam1 = Person.parseFrom(bytes);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 1; i++) {
            runPerformanceTest(json, "JSON");
            runPerformanceTest(proto, "PROTO");
        }

    }

    private  static void runPerformanceTest(Runnable runnable, String method) {
        long time1 = System.currentTimeMillis();

        for (int i = 0; i < 1; i++) {
            runnable.run();
        }

        long time2 = System.currentTimeMillis();

        System.out.println(method+ " : "+(time2 - time1) + " ms");
    }
}
