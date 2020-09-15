package com.iyang.learn.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

/**
 * Created by Yang on 2020/9/15 22:54
 */

public class EncoderOomFile {

    public static void main(String[] args) throws IOException {
        /*File file = new File("111");
        FileInputStream fileInputStreamReader = new FileInputStream(file);
        byte[] bytes = new byte[(int)file.length()];
        fileInputStreamReader.read(bytes);*/
        int numberValue = 52428800;
        int allLen = 268435456;
        int startNumber = 0;
        byte [] bytes = new byte[268435456];
        // String allStr = "";
        StringBuffer sb = new StringBuffer();
        while (allLen > startNumber) {
            int endNumber,recordVal = startNumber;
            if(startNumber + numberValue > allLen){
                endNumber = allLen;
                startNumber = allLen;
            } else {
                endNumber = startNumber + numberValue;
                startNumber = endNumber;
            }
            byte [] copyBytes = new byte[endNumber - recordVal];
            System.arraycopy(bytes,recordVal,copyBytes,0,endNumber-recordVal);
            sb.append(Base64.getEncoder().encodeToString(copyBytes));
        }
        System.out.println(sb.toString());
        //System.out.println(allStr);
        // String encodedBase64 = java.util.Base64.getEncoder().encodeToString(bytes);

        // System.out.println(encodedBase64);

    }




}
