package net.matees;

public class Logic {

    private static boolean started = false;

    public static void start() {
        //Startup logic
        started = true;
        System.out.printf("Welcome, ");
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
}
