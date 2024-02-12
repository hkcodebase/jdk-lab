package src.main.java.io.streams;

import java.io.*;

public class CharStreamsMain {
    public static void main(String[] args) {

        readFromFile();
        outputToFile();

    }

    private static void readFromFile() {
        try(FileReader fileReader = new FileReader("files/data.txt")) {
            int ch ;
            while ((ch = fileReader.read()) != -1){
                System.out.print(ch);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void outputToFile() {
        String str = "here is output \n text";
        try(FileWriter fileWriter = new FileWriter("files/outdata.txt")) {
           for(char ch : str.toCharArray()){
               fileWriter.write(ch);
           }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
