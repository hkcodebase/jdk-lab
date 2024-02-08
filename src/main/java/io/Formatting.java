package src.main.java.io;

/**
 * print, println and format method
 */
public class Formatting {
    public static void main(String[] args) {
        System.out.print("this is print method text with no new line after finish");
        System.out.print("\n");
        System.out.println("this is println text with new line after finish");
        System.out.format("this is formatted text, string value %s, int value %d, float value %f.%n", "Hemant", 1, 2.2);
        System.out.format("this is formatted text, float value %.2f", 2.2234234);
    }
}
