package com.eshopping.util;

import com.eshopping.enums.ExceptionEnums;
import com.eshopping.exception.ResourceNotFoundException;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by AnKh on 2017/3/5.
 */
//// TODO: 2017/3/7 也不知道对不对 还要测试
public class PictureToByte {

    public static byte[] getBytesFromImage(File file){
        if(file == null) throw new ResourceNotFoundException(ExceptionEnums.PARAM_LACK.getStateInfo());

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1000);
            byte[] bytes = new byte[1000];
            int n;
            while((n = fileInputStream.read(bytes)) != -1)
                byteArrayOutputStream.write(bytes,0,n);
            fileInputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        }catch (Exception e){

        }
        return null;
    }

}
