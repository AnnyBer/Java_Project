package Lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {

    private static final int WindowWidth = 550;
    private static final int WindowHeight = 550;
    private static final int WindowPosition_X = 500;
    private static final int WindowPosition_Y = 170;
    private GameSetting gameSetting;


    GameWindow(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(WindowWidth, WindowHeight);
    setLocation(WindowPosition_X, WindowPosition_Y);
    setTitle("Tic Tac Toe");
    setIconImage();
    setResizable(false);

    gameSetting = new GameSetting();

    JButton buttonStart = new JButton("New Game");
    buttonStart.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        gameSetting.setVisible(true);
        }
    });
    JButton buttonExit = new JButton("Exit Game");
    buttonExit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(1, 2));
    buttonPanel.add(buttonStart);
    buttonPanel.add(buttonExit);
    add(buttonPanel, BorderLayout.SOUTH);

    setVisible(true);
    }



    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("xo1.png")));
    }


}
