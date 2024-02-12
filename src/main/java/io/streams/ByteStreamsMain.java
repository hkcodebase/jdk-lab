package src.main.java.io.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Bytestream Classes read byte by byte from stream (File, Object, System or Data)
 */
public class ByteStreamsMain {
    public static void main(String[] args) {
        readFromFile();
        writeToFile();
    }

    private static void readFromFile() {
        try(FileInputStream fileInputStream = new FileInputStream("files/data.txt")) {
            int ch ;
            while ((ch = fileInputStream.read()) != -1){
                System.out.print((char)ch);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void writeToFile() {
        String str = "here is output \n text";
        try(FileOutputStream fileOutputStream = new FileOutputStream("files/outdata.txt")) {
           for(char ch : str.toCharArray()){
               fileOutputStream.write(ch);
           }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
