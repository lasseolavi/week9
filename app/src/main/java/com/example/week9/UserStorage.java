package com.example.week9;

import android.content.Intent;
import android.view.View;

import java.util.ArrayList;

public class UserStorage {
    private ArrayList<User> Users = new ArrayList<>();
    private static UserStorage userStorage = null;

    private UserStorage(){
    }
    public  static UserStorage getInstance(){
        if (userStorage == null){
            userStorage = new UserStorage();
        }
        return userStorage;
    }
    public ArrayList getUsers(){
        return Users;
    }
    public void addUser(User user){
        Users.add(user);
    }
    public void removeUser(int id){
        Users.remove(id);
    }
}
