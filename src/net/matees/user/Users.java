package net.matees.user;

import net.matees.user.model.User;

import java.util.HashMap;
import java.util.List;

public class Users {
    protected static List<User> users;

    //This will check if the username provided is an actuall username of a user
    public static boolean checkUsernameExists(String username) {
        for (User user : users) {
            if (user.getName() == username) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkPasswordExists(String username, String password) {
        for (User user : users) {
            if (user.getPassword() == password) {
                return true;
            }
        }
        return false;
    }

    public User getSpecificUser(User user) {
        return user;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public void addUser(User user) {
        users.add(user);
    }
}
