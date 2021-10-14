import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class TicTacToe extends JFrame implements ActionListener {

    Random newRandom;
    JPanel titlePanel;
    JPanel buttonPanel;
    JLabel resultShowerLabel;
    JButton[] buttons;
    boolean player1_turn;

    TicTacToe() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(650,650);
        getContentPane().setBackground(new Color(50,50,50));
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        resultShowerLabel = new JLabel("Tic-Tac-Toe");
        resultShowerLabel.setBackground(new Color(25,25,25));
        resultShowerLabel.setForeground(new Color(25,255,0));
        resultShowerLabel.setFont(new Font("Ink Free", Font.BOLD, 75));
        resultShowerLabel.setHorizontalAlignment(JLabel.CENTER);
        resultShowerLabel.setOpaque(true);

        titlePanel = new JPanel();
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBounds(0,0,800,100);
        titlePanel.add(resultShowerLabel);
        add(titlePanel, BorderLayout.NORTH);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3,3));
        buttonPanel.setForeground(new Color(150,150,150));
        add(buttonPanel);

        for (int i = 0; i < 9; i++) {
            buttons = new JButton[9];
            buttons[i] = new JButton();
            buttons[i].setFont(new Font("MV Boli", Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);

        }

        firstTurn();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (player1_turn) {
                    if (buttons[i].getText().equals("")) {
                        buttons[i].setForeground(new Color(0, 0, 255));
                        buttons[i].setText("X");
                        player1_turn = false;
                        resultShowerLabel.setText("O's Turn");
                    }
                } else {
                    if (buttons[i].getText().equals("")) {
                        buttons[i].setForeground(new Color(0, 255, 0));
                        buttons[i].setText("O");
                        player1_turn = true;
                        resultShowerLabel.setText("X's Turn");
                    }
                }
            }
        }

    }

    public void firstTurn() {
        newRandom = new Random();
        if (newRandom.nextInt(2) == 0) {
            player1_turn = true;
            resultShowerLabel.setText("X's Turn");
        } else {
            player1_turn = false;
            resultShowerLabel.setText("O's Turn");
        }
    }

    public void checkForWinner() {

    }

    public void xWins(int a, int b, int c) {

    }

    public void oWins(int a, int b, int c) {

    }
}
