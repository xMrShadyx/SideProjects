package net.HashDataBase.AccountStorage;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Hashtable;


public class Accounts {
    private Hashtable<String, String> accounts = new Hashtable<String, String>();

    public void setAccount(String userName, String password) {
        accounts.put(userName, password);
        JOptionPane.showMessageDialog(null, "Account " + userName +
                "was successfully created", "Account creation", JOptionPane.INFORMATION_MESSAGE);
    }

    public boolean doesExist(String userName) {
        return accounts.containsKey(userName);
    }

    public String returnPassword(String userName) {
        String password = "";
        if (accounts.containsKey(userName)) {
            password = accounts.get(userName);
        }
        return password;
    }

    public void getFreeAcc() {
        accounts.put("root", "root");
    }

}
