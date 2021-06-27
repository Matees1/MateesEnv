package net.matees;

import net.matees.Console.ConsoleColors;
import net.matees.user.Users;
import net.matees.user.model.User;

import java.awt.*;
import java.util.Scanner;

public class Logic {

    private static boolean started = false;

    public static void start() {
        //Startup logic
        started = true;
    }

    public static void stop() {
        //When the kernel stops
        started = false;
    }

    public static void loop() {
        while (started == true) {
            //While running logic
        }

        //If the loop ends, started would be false, so therefore the
        //kernel has stopped
        stop();
    }

    public static User loginPrompt() {
        //Username prompt
        Scanner usernameScanner = new Scanner(System.in);
        System.out.printf("Please enter your username in: ");
        String username = usernameScanner.next();

        boolean usernameExists = Users.checkUsernameExists(username);

        //The username is valid
        if (usernameExists) {
            //Password prompt
            Scanner passwordScanner = new Scanner(System.in);
            System.out.printf("Please enter in the password to the user " + ConsoleColors.CYAN + " " + username + ConsoleColors.RESET);
            String password = passwordScanner.next();

            boolean passExists = Users.checkPasswordExists(username, password);

            //If the password is valid for the account
            if (passExists) {
                
            }else{
                System.out.println("\nThe password provided does not match the username " + ConsoleColors.CYAN + username + ConsoleColors.RESET);
            }
        }else{
            System.out.println("\nThe username provided is not valid, please retry.");
            loginPrompt();
        }
    }
}
