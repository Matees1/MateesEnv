package net.matees.console;

import net.matees.user.model.User;

public class CommandLine {
    public static void cmdLine(User user) {
        System.out.printf(ConsoleColors.CYAN_BOLD + "%s" + ConsoleColors.BLUE_BOLD + ">>  " + ConsoleColors.RESET, user.getName());
    }
}
