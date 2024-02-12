package src.main.java.io.streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        //inputFromConsoleAndPrint();
        sumOfDoubleValuesFromFile("files/alpha-numeric-data.txt");
    }

    private static void sumOfDoubleValuesFromFile(String fileName) {
        try(Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(fileName)))) {
            double sum = 0.0;
            while (scanner.hasNext()){
                if(scanner.hasNextDouble()){
                    sum += scanner.nextDouble();
                }
                else
                    scanner.next();
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void inputFromConsoleAndPrint() {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
