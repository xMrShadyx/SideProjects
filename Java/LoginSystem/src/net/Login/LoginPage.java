package net.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import net.Register.RegisterPage;
import net.HashDataBase.AccountStorage.Accounts;

public class LoginPage extends JFrame implements ActionListener {
    public RegisterPage newAccount;
    public Accounts accountInfo;

    public JButton loginButton;
    public JButton registerButton;

    public JTextField userNameField;
    public JTextField passwordField;

    public JLabel userNameLabel;
    public JLabel passwordLabel;
    public JLabel decoratedTitleLabel;
    public JLabel exitOnClickLabel;


    public LoginPage() {
        super("Login System");
        setSize(300, 150);
//        setBackground(new Color(0, 92, 148));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setResizable(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setUndecorated(true);

        newAccount = new RegisterPage();
        accountInfo = new Accounts();
        accountInfo.getFreeAcc();

        exitOnClickLabel = new JLabel("X");
        exitOnClickLabel.setForeground(Color.BLACK);
        exitOnClickLabel.setBounds(50,50, 20, 20);
        add(exitOnClickLabel);

        decoratedTitleLabel = new JLabel();
        decoratedTitleLabel.setBounds(0,0,300,20);
        decoratedTitleLabel.setOpaque(true);
        decoratedTitleLabel.setBackground(new Color(3, 61, 55));
        add(decoratedTitleLabel);


        userNameLabel = new JLabel("Username: ", SwingConstants.CENTER);
        userNameLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        userNameLabel.setBounds(10, 40, 120, 20);
        add(userNameLabel);

        passwordLabel = new JLabel("Password: ", SwingConstants.CENTER);
        passwordLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        passwordLabel.setBounds(10, 70, 120, 20);
        add(passwordLabel);

        userNameField = new JTextField("");
        userNameField.setFont(new Font("Serif", Font.PLAIN, 15));
        userNameField.setForeground(Color.GRAY);
        userNameField.setBounds(120, 40, 120, 20);
        add(userNameField);

        passwordField = new JTextField("");
        passwordField.setFont(new Font("Serif", Font.PLAIN, 15));
        passwordField.setForeground(Color.GRAY);
        passwordField.setBounds(120, 70, 120, 20);
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        loginButton.setFont(new Font("Serif", Font.PLAIN, 10));
        loginButton.setBounds(50, 100, 80, 20);
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(1,2,3));
        add(loginButton);

        registerButton = new JButton("Register");
        registerButton.addActionListener(this);
        registerButton.setFont(new Font("Serif", Font.PLAIN, 10));
        registerButton.setBounds(150, 100, 80, 20);
        add(registerButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            newAccount.setVisible(true);
            setVisible(false);
            dispose();
        } else if (e.getSource() == loginButton) {
            String userName = userNameField.getText();
            String passWord = passwordField.getText();
            if (accountInfo.doesExist(userName)) {
                if (accountInfo.returnPassword(userName).equals(passWord)) {
                    JOptionPane.showMessageDialog(null, "Welcome");
                } else {
                    JOptionPane.showMessageDialog(null,"Wrong Username/Password");
                }
            } else {
                JOptionPane.showMessageDialog(null,"Account doesn't exist.");
            }
        }
    }
}

