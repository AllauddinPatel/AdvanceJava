package filehandling;

import java.io.*;

public class BufferwriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("bfrwriter.txt");
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write("This is Buffer Writer");
            System.out.println("File Write Successfully");

            buffer.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



        //read buffer writer

        try {
            FileReader fileReader = new FileReader("bfrwriter.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int i =bufferedReader.read();
            while (i>0){
                System.out.print((char) i);
                i = bufferedReader.read();
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
