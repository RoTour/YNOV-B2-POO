package com.novyapp.exceptions;

import com.novyapp.exceptions.model.Storage;
import com.novyapp.exceptions.model.User;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        for (int i=0; i<11; i++){
            User user = new User();
            user.name = "Jean" + i;
            try {
                storage.add(user);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
