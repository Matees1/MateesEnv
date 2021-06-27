package net.matees.user;

import net.matees.user.model.User;

import java.util.List;

public class Users {
    protected List<User> users;

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
