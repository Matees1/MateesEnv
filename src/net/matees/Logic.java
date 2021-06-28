package net.matees;

import net.matees.console.ConsoleColors;
import net.matees.user.model.User;

import java.util.Scanner;

import static net.matees.console.CommandLine.cmdLine;

public class Logic {

    private static boolean started = false;

    public static void start(User user) {
        //Startup logic
        started = true;
        //Starts the kernel loop
        loop(user);
    }

    public static void stop() {
        //When the kernel stops
        started = false;
    }

    public static void loop(User user) {
        while (started == true) {
            //While running logic
            Scanner inputScan = new Scanner(System.in);
            cmdLine(user);
            String input = inputScan.next();
        }

        //If the loop ends, started would be false, so therefore the
        //kernel has stopped
        stop();
    }
}
