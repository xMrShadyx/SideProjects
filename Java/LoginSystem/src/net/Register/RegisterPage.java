package net.Register;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import net.Login.LoginPage;


public class RegisterPage extends JFrame implements ActionListener {
    public LoginPage backToLogin;


    public JTextField accountNameField;
    public JTextField passwordOneField;
    public JTextField passwordTwoField;
    public JTextField emailField;

    public JLabel frontInfoLabel;
    public JLabel accountNameLabel;
    public JLabel passwordOneLabel;
    public JLabel passwordTwoLabel;
    public JLabel emailLabel;

    public JButton confirmButton;
    public JButton cancelButton;

    public RegisterPage() {
        super("Register Account");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(false);

        frontInfoLabel = new JLabel("Register new Account:",SwingConstants.CENTER);
        frontInfoLabel.setFont(new Font("Serif", Font.PLAIN, 25));
        frontInfoLabel.setBounds(10, 10, 250, 30);
        add(frontInfoLabel);


        accountNameLabel = new JLabel("Account name:");
        accountNameLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        accountNameLabel.setBounds(35, 50, 120, 20);
        add(accountNameLabel);

        accountNameField = new JTextField("");
        accountNameField.setFont(new Font("Serif", Font.PLAIN, 14));
        accountNameField.setBounds(140, 50, 120, 20);
        add(accountNameField);

        passwordOneLabel = new JLabel("Enter Password:");
        passwordOneLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        passwordOneLabel.setBounds(35, 75, 120, 20);
        add(passwordOneLabel);

        passwordOneField = new JTextField("");
        passwordOneField.setFont(new Font("Serif", Font.PLAIN, 14));
        passwordOneField.setBounds(140, 75, 120, 20);
        add(passwordOneField);

        passwordTwoLabel = new JLabel("Repeat Password:");
        passwordTwoLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        passwordTwoLabel.setBounds(35, 100, 120, 20);
        add(passwordTwoLabel);

        passwordTwoField = new JTextField("");
        passwordTwoField.setFont(new Font("Serif", Font.PLAIN, 14));
        passwordTwoField.setBounds(140, 100, 120, 20);
        add(passwordTwoField);

        emailLabel = new JLabel("Email: ");
        emailLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        emailLabel.setBounds(35, 125, 120, 20);
        add(emailLabel);

        emailField = new JTextField("");
        emailField.setFont(new Font("Serif", Font.PLAIN, 14));
        emailField.setBounds(140, 125, 120, 20);
        add(emailField);

        confirmButton = new JButton("Confirm");
        confirmButton.setFont(new Font("Serif", Font.PLAIN, 14));
        confirmButton.setBounds(82, 170, 120, 20);
        add(confirmButton);

        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(this);
        cancelButton.setFont(new Font("Serif", Font.PLAIN, 14));
        cancelButton.setBounds(82, 195, 120, 20);
        add(cancelButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cancelButton) {
            backToLogin = new LoginPage();
            backToLogin.setVisible(true);
            setVisible(false);
            dispose();

        } else if (e.getSource() == confirmButton) {

        }
    }
}
