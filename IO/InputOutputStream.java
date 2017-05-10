package LearnJava.IO;

import java.io.*;

/**
 * Created by qimingzhang on 2017/5/8.
 */
public class InputOutputStream {
    public static void main(String[] args) {
        File file = new File("src/LearnJava/IO/test.txt");
        try {
            InputStream is = new FileInputStream(file);
            Reader reader = new InputStreamReader(is);
            char [] byteArray= new char[(int)file.length()];
            int size= reader.read(byteArray);
            System.out.println( "大小:"+size +";内容:" +new String(byteArray));
            is.close();
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void read(InputStream stream){
        try {
            int read = stream.read();
            if (read == -1){
                System.out.println("stream is closed");
            } else{
                byte byteRead = (byte) read;
                System.out.println(Byte.toString(byteRead));
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
