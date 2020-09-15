package com.iyang.learn.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Yang on 2020/9/15 23:29
 */

public class EncodeOomFileOne {

    public static void main(String[] args) throws IOException {

        File file = new File("E:\\heapdump(2)_pd");
        FileInputStream fileInputStreamReader = new FileInputStream(file);
        byte[] bytes = new byte[(int)file.length()];
        fileInputStreamReader.read(bytes);
        String encodedBase64 = java.util.Base64.getEncoder().encodeToString(bytes);


    }

}
