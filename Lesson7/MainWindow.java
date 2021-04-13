package JavaHomeWork.Lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private final int WIN_WIDTH = 500;
    private final int WIN_HEIGHT = 555;
    private final int WIN_POS_X = 450;
    private final int WIN_POS_Y = 150;

    private Settings settingsWindow;
    private GameMap gameMap;
    private PracticeWindow practiceWindow;



    MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(WIN_POS_X, WIN_POS_Y);
        setResizable(false);
        setTitle("Game");

        settingsWindow = new Settings(this);
        gameMap = new GameMap();
        practiceWindow = new PracticeWindow(this);

        JButton btnStartGame = new JButton("New Game");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWindow.setVisible(true);
            }
        });

        JButton btnExitGame = new JButton("Exit Game");
        btnExitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JButton btnPracticeWindow = new JButton("Practice Window");
        btnPracticeWindow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                practiceWindow.setVisible(true);
            }
        });

        JPanel containerForButton = new JPanel();
        containerForButton.setLayout(new GridLayout(1,3));
        containerForButton.add(btnStartGame);
        containerForButton.add(btnExitGame);
        containerForButton.add(btnPracticeWindow);

        add(containerForButton, BorderLayout.SOUTH);

        add(gameMap);


        //setLayout(new GridLayout(2,3));
        //add(btnStartGame);
        //add(btnExitGame);

        //add(btnStartGame, BorderLayout.NORTH);
        //add(btnExitGame, BorderLayout.SOUTH);


        setVisible(true);
    }

    void startGameWithUserSettings(int gameMode, int mapSizeX, int mapSizeY, int winLength) {
        gameMap.startGame(gameMode, mapSizeX, mapSizeY, winLength);
    }
}
