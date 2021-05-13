package com.sb.protobuf;

import com.sb.model.Television;
import com.sb.model.Type;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VersionCompatibilityTest {

    public static void main(String[] args) throws IOException {

        Path pathV1 = Paths.get("tv-v1");
        Path pathV2 = Paths.get("tv-v2");

        /*Television televison = Television.newBuilder().setBrand("Sony").setModel(2020).setType(Type.OLED).build();
        Files.write(pathV2, televison.toByteArray());*/
        //

        byte[] bytes = Files.readAllBytes(pathV1);
        System.out.println(
                Television.parseFrom(bytes)
        );

    }
}
