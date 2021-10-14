package com.NumberGuesser.UI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
class RoundedBorder implements Border {

    private int radius;


    RoundedBorder(int radius) {
        this.radius = radius;
    }


    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }


    public boolean isBorderOpaque() {
        return true;
    }


    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
    }
}

public class LeftSideMenu extends JFrame{
    public JPanel leftJPanel;

    public JTextField enterMinRangeField;
    public JTextField enterMaxRangeField;

    public JLabel minNumberLabel;
    public JLabel maxNumberLabel;

    public JButton setMinMaxRangeButton;
    public JButton hideLeftJPanel;

    public LeftSideMenu() {
        leftJPanel = new JPanel();
        leftJPanel.setBounds(0,0,120,213);
        leftJPanel.setBackground(Color.LIGHT_GRAY);
        leftJPanel.setLayout(null);


        minNumberLabel = new JLabel("Set Min. Number");
        minNumberLabel.setBounds(10,10,100,20);
        leftJPanel.add(minNumberLabel);

        maxNumberLabel = new JLabel("Set Max. Number");
        maxNumberLabel.setBounds(10,50,100,20);
        leftJPanel.add(maxNumberLabel);

        enterMinRangeField = new JTextField();
        enterMinRangeField.setBounds(10,30,100,20);
        leftJPanel.add(enterMinRangeField);

        enterMaxRangeField = new JTextField("");
        enterMaxRangeField.setBounds(10,70,100,20);
        leftJPanel.add(enterMaxRangeField);

        setMinMaxRangeButton = new JButton("Set");
        setMinMaxRangeButton.setBounds(25,100,60,20);
//        setMinMaxRangeButton.setBorder(new RoundedBorder(20));
//        setMinMaxRangeButton.setBackground(Color.BLACK);
        leftJPanel.add(setMinMaxRangeButton);

        hideLeftJPanel = new JButton("\u2190" + " Hide");
        hideLeftJPanel.setBounds(20,191,80,20);
        leftJPanel.add(hideLeftJPanel);
    }
}
