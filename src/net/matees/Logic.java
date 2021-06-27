package net.matees;

import net.matees.user.model.User;

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
        Scanner usernameScanner = new Scanner(System.in);
        System.out.printf("Please enter your username in: ");
        String username = usernameScanner.next();

        
    }
}
