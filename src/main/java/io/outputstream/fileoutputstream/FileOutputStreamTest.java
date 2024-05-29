package io.outputstream.fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    public static void main(String[] args) {

        String filePath = "src/main/resources/io/txt/fos1.txt";

        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            fos.write("this is a test message".getBytes());
            fos.close();
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
