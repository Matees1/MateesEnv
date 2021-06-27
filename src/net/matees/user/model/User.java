package net.matees.user.model;

import java.util.HashMap;

/*
    This class is for creating a new user
 */
public class User {
    private String username;
    private String password;
    private boolean superuser;

    //Im not sure if im going to remove this in the future, but it might be useful
    //This will be the settings for the user Example:
    //                  "Createfile, true"
    //Createfile is the setting, not sure if I will keep it as a string in the future.
    //Might make it an enum
    private HashMap<String, Boolean> settings = new HashMap<>();

    //Username, Password
    private HashMap<String, String> credentials = new HashMap<>();

    public User() {

    }

    public User(String username, String password, boolean superuser) {
        this.username = username;
        this.password = password;
        this.superuser = superuser;

        this.credentials.put(username, password);
    }

    public User(String username, String password, boolean superuser, HashMap<String, Boolean> settings) {
        this.username = username;
        this.password = password;
        this.superuser = superuser;
        this.settings = settings;

        this.credentials.put(username, password);
    }

    public HashMap<String, String> getCredentials() {
        return credentials;
    }

    public void setCredentials(HashMap<String, String> credentials) {
        this.credentials = credentials;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
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
