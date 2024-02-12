package src.main.java.io.streams;

import java.io.Console;

public class ConsoleMain {
    public static void main(String[] args) {
        Console c = System.console();
        if(c == null){
            System.err.println("Console is null");
            System.exit(1);
        }
        String username = c.readLine("Enter your username: ");
        char[] password = c.readPassword("Enter your password: ");

        System.out.println(username);
        System.out.println(password);
    }
}
