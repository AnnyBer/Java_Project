package Lesson7;

import javax.swing.*;
import java.awt.*;

public class GameSetting extends JFrame {

    private static final int WindowWidth = 550;
    private static final int WindowHeight = 550;

    GameSetting(){
        setSize(WindowWidth, WindowHeight);
        setIconImage();
        setTitle("Tic Tac Toe - Настройки новой игры.");
    }

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("xo1.png")));
    }
}
