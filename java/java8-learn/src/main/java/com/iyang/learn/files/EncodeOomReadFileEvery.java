package com.iyang.learn.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;

/**
 * Created by Yang on 2020/9/15 23:35
 */

public class EncodeOomReadFileEvery {

    public static void main(String[] args) throws IOException {

        File file = new File("E:\\heapdump(2)_pd");
        long length = file.length();
        length *= 2;
        FileInputStream fileInputStreamReader = new FileInputStream(file);
        StringBuilder sb = new StringBuilder(Integer.parseInt(length+""));
        System.out.println(sb.capacity());

        Base64.Encoder encoder = java.util.Base64.getEncoder();
        int bufferSize = 3 * 1024;
        byte [] bytes = new byte[bufferSize];
        int readSize = 0;

        while ((readSize = fileInputStreamReader.read(bytes)) == bufferSize) {
            try {
                sb.append(encoder.encodeToString(bytes));
            } catch (Error e){
                e.printStackTrace();
                sb.append(encoder.encodeToString(bytes));
                System.out.println(sb.capacity());
                return;
            }
        }
        if(readSize > 0){
            bytes = Arrays.copyOf(bytes,readSize);
            sb.append(encoder.encodeToString(bytes));
        }
        System.out.println(sb.length());
        String s =  new String(sb);
        // String s = sb.toString();

    }
}
