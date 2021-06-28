package net.matees;

import net.matees.user.PremadeUsers.Superuser;

import static net.matees.Logic.start;

public class Main {

    public static void main(String[] args) {
        start(new Superuser());
    }
}
