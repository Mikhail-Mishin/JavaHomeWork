package JavaHomeWork.Lesson7;

import javax.swing.*;
import java.awt.*;

public class GameMap extends JPanel {
    public static final int GAME_MODE_HVH = 0;
    public static final int GAME_MODE_HVA = 1;

    GameMap() {
        setBackground(new Color(0,250,0));
    }

    void startGame(int gameMode, int mapSizeX, int mapSizeY, int winLength) {
        System.out.println("mode = " + gameMode +
                "\nmapSizeX = " + mapSizeX +
                "\nmapSizeY = " + mapSizeY +
                "\nwinLength = " + winLength);
    }

}
