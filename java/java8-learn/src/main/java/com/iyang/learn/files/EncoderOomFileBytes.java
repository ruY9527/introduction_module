package com.iyang.learn.files;

/**
 * Created by Yang on 2020/9/15 23:16
 */

public class EncoderOomFileBytes {

    public static void main(String[] args) {

        byte [] bytes = new byte[268435456];
        String encodedBase64 = java.util.Base64.getEncoder().encodeToString(bytes);

    }

}
