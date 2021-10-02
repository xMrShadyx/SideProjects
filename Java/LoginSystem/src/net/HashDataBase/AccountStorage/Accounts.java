package net.HashDataBase.AccountStorage;

import java.util.Hashtable;


public class Accounts {
    private Hashtable<String, String> accounts = new Hashtable<String, String>();

    public void setAccount(String userName, String password) {
        accounts.put(userName, password);
        System.out.println("Account was successfully created:\nUsername: " + userName + "\nPassword: " + password);
    }



}
