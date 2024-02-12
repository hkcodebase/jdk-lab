package src.main.java.io.streams;

import java.io.*;

public class LineIOMain {
    public static void main(String[] args) throws IOException {
        //readFromFile();
        readFromFileV2();
    }

    public static void readFromFile() throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("files/data.txt"));
            outputStream = new PrintWriter(new FileWriter("files/outdata.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.print(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
    public static void readFromFileV2() throws IOException {
        FileReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new FileReader("files/data.txt");
            outputStream = new PrintWriter(new FileWriter("files/outdata.txt"));

            int l;
            while ( (l = inputStream.read()) != -1) {
                outputStream.print((char)l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
