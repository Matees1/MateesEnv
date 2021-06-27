package net.matees.user.model;

import java.util.HashMap;

/*
    This class is for creating a new user
 */
public class User {
    private String name;
    private String password;
    private boolean superuser;

    private HashMap<String, Boolean> settings = new HashMap<String, Boolean>();

    public User() {

    }

    public User(String name, String password, boolean superuser) {
        this.name = name;
        this.password = password;
        this.superuser = superuser;
        this.settings = settings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSuperuser() {
        return superuser;
    }

    public void setSuperuser(boolean superuser) {
        this.superuser = superuser;
    }

    public HashMap<String, Boolean> getSettings() {
        return settings;
    }

    public void setSettings(HashMap<String, Boolean> settings) {
        this.settings = settings;
    }
}
