package net.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import net.Register.RegisterPage;

public class LoginPage extends JFrame implements ActionListener {
    public RegisterPage newAccount;

    public JButton loginButton;
    public JButton registerButton;

    public JTextField userNameField;
    public JTextField passwordField;

    public JLabel userNameLabel;
    public JLabel passwordLabel;

    public LoginPage() {
        super("Login System");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        newAccount = new RegisterPage();

        userNameLabel = new JLabel("Username: ", SwingConstants.CENTER);
        userNameLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        userNameLabel.setBounds(10, 10, 120, 20);
        add(userNameLabel);

        passwordLabel = new JLabel("Password: ", SwingConstants.CENTER);
        passwordLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        passwordLabel.setBounds(10, 40, 120, 20);
        add(passwordLabel);

        userNameField = new JTextField("");
        userNameField.setFont(new Font("Serif", Font.PLAIN, 10));
        userNameField.setForeground(Color.GRAY);
        userNameField.setBounds(120, 10, 120, 20);
        add(userNameField);

        passwordField = new JTextField("");
        passwordField.setFont(new Font("Serif", Font.PLAIN, 10));
        passwordField.setForeground(Color.GRAY);
        passwordField.setBounds(120, 40, 120, 20);
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Serif", Font.PLAIN, 10));
        loginButton.setBounds(50, 70, 80, 20);
        add(loginButton);

        registerButton = new JButton("Register");
        registerButton.addActionListener(this);
        registerButton.setFont(new Font("Serif", Font.PLAIN, 10));
        registerButton.setBounds(150, 70, 80, 20);
        add(registerButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            newAccount.setVisible(true);
            setVisible(false);
            dispose();

        }
    }
}

