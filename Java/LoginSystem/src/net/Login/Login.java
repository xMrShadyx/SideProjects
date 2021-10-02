package net.Login;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    public JButton loginButton;
    public JButton registerButton;

    public JTextField userNameField;
    public JTextField passwordField;

    public JLabel userNameLabel;
    public JLabel passwordLabel;

    public Login() {
        super("Login System");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        userNameLabel = new JLabel("Username: ", SwingConstants.CENTER);
        userNameLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        userNameLabel.setBounds(10, 10, 120, 20);
        add(userNameLabel);

        passwordLabel = new JLabel("Password: ", SwingConstants.CENTER);
        passwordLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        passwordLabel.setBounds(10, 40, 120, 20);
        add(passwordLabel);

        userNameField = new JTextField("Enter Username");
        userNameField.setFont(new Font("Serif", Font.PLAIN, 10));
        userNameField.setForeground(Color.GRAY);
        userNameField.setBounds(120, 10, 120, 20);
        add(userNameField);

        passwordField = new JTextField("Enter Password");
        passwordField.setFont(new Font("Serif", Font.PLAIN, 10));
        passwordField.setForeground(Color.GRAY);
        passwordField.setBounds(120, 40, 120, 20);
        add(passwordField);

        loginButton = new JButton("net/Login");
        loginButton.setFont(new Font("Serif", Font.PLAIN, 10));
        loginButton.setBounds(50, 70, 80, 20);
        add(loginButton);

        registerButton = new JButton("Register");
        registerButton.setFont(new Font("Serif", Font.PLAIN, 10));
        registerButton.setBounds(150, 70, 80, 20);
        add(registerButton);


    }
}

