package com.example.app1;

import java.util.ArrayList;

public class DataUser {
    private static ArrayList<User> userList = new ArrayList<User>();

    public static void addUser (User u){
        userList.add(u);
    }

    public static ArrayList<User> getUsers (){
            return userList;
    }
}
