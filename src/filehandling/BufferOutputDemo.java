package filehandling;

import java.io.*;

public class BufferOutputDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("BufferDemo.txt");

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String str="Im in Pune";
            byte[] arr= str.getBytes();
            bufferedOutputStream.write(arr);
            System.out.println("File Write Successfully");

            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



        //buffer reader
        try {
            FileInputStream fileInputStream = new FileInputStream("BufferDemo.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i=bufferedInputStream.read();
            while (i>0){
                System.out.print((char) i);
                i = bufferedInputStream.read();
            }
            fileInputStream.close();
            bufferedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
