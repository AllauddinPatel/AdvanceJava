package filehandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileHandlingDemo {
    public static void main(String[] args) {
//for Write file
        File file = new File("C:\\Users\\admin\\IdeaProjects\\Test\\src\\filehandling\\text.txt");
        FileOutputStream fileOutputStream=null;
        FileInputStream fileInputStream=null;


        try {
            fileOutputStream = new FileOutputStream(file);
            String str  ="Welcome to our codekul ";
            byte[] arr= str.getBytes();
            fileOutputStream.write(arr);//for string
            fileOutputStream.write(89);//for int
            System.out.println("File Write Successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//for read file
        try {
            fileInputStream = new FileInputStream(file);
            int i=fileInputStream.read();
            System.out.println(i);// for reading integer value
            while (i>0){
                System.out.print((char ) i);//reading in character
                i=fileInputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
