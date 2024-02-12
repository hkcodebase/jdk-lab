package src.main.java.io.streams;

import java.io.*;

public class DataStreamsMain {
    static final String dataFile = "files/invoicedata.txt";
    public static void main(String[] args) throws FileNotFoundException {
        writeDataToFile();
        readDataFromFile();
        
    }

    private static void readDataFromFile() throws FileNotFoundException {
        DataInputStream in = new DataInputStream(new
                BufferedInputStream(new FileInputStream(dataFile)));

        double price;
        int unit;
        String desc;
        double total = 0.0;
        try {
            while (true) {
                price = in.readDouble();
                unit = in.readInt();
                desc = in.readUTF();
                System.out.format("You ordered %d" + " units of %s at $%.2f%n",
                        unit, desc, price);
                total += unit * price;
            }

        } catch (IOException e) {
            System.out.format("Total %.2f",total);
        }
    }

    private static void writeDataToFile() {

        final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
        final int[] units = { 12, 8, 13, 29, 50 };
        final String[] descs = {
               "Java T-shirt",
               "Java Mug",
               "Duke Juggling Dolls",
               "Java Pin",
               "Java Key Chain"
       };

        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream(dataFile)))){
            for (int i = 0; i < prices.length; i ++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
