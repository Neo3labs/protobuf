package com.sb.protobuf;

import com.sb.model.Credentials;
import com.sb.model.EmailCredentials;
import com.sb.model.PhoneOTP;

public class OneOfDemo {
    public static void main(String[] args) {
        EmailCredentials email = EmailCredentials.newBuilder().setEmail("nobody@gmail.com").setPassword("123456").build();

        PhoneOTP phone = PhoneOTP.newBuilder().setNumber(123456789).setCode(1234).build();

        Credentials credentials = Credentials.newBuilder().setEmailMode(email).build();

        login(credentials);
    }

    private static void login(Credentials credentials) {

        switch (credentials.getModeCase()){
            case EMAILMODE:
                System.out.println(credentials.getEmailMode());
                break;
            case PHONEMODE:
                System.out.println(credentials.getPhoneMode());
                break;
        }

        //System.out.println(credentials.getPhoneMode());
    }
}
