package com.novyapp.exceptions.model;

public class Storage {
    private final static int SIZE = 10;
    private User[] users = new User[SIZE];
    private int index = 0;

    public void add(User user) throws Exception {
        if (index == SIZE) {
            throw new Exception("Plus de place");
        }
        users[index++] = user;
    }
}
