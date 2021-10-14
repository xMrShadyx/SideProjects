package com.NumberGuesser.UI;

import javax.swing.*;

public class AppFrame extends JFrame {
    public JTextField enterNumberField;

    public JButton guessTheNumberButton;
    public LeftSideMenu leftPanel;

    public JButton revealLeftMenu;

    public AppFrame() {
        super("Guess The Number");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        leftPanel = new LeftSideMenu();
        leftPanel.leftJPanel.setVisible(true);
        add(leftPanel.leftJPanel);

    }

}
