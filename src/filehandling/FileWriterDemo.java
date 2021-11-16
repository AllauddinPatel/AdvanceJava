package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("filewriterdemo.txt");
            fileWriter.write("This is File Writer");
            System.out.println("File Write Successfully");
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileReader fileReader=new FileReader("filewriterdemo.txt");
            int i=fileReader.read();
            while (i>0){
                System.out.print((char) i);
                i= fileReader.read();
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
