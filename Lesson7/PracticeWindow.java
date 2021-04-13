package JavaHomeWork.Lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticeWindow extends JFrame {
    private final int WIN_HEIGHT = 150;
    private final int WIN_WIDTH = 250;

    private MainWindow mainWindow;

    private JButton closeAllBtn;
    private JButton returnToMainBtn;



    PracticeWindow(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        practiceWindowSetup(mainWindow);
        returnToMain();
        closeAll();

    }


    private void practiceWindowSetup(MainWindow mainWindow) {
        setSize(WIN_WIDTH, WIN_HEIGHT);


        Rectangle mainWindowParams = mainWindow.getBounds();
        int posWindowX = (int) mainWindowParams.getCenterX() - WIN_WIDTH / 2;
        int posWindowY = (int) mainWindowParams.getCenterY() - WIN_HEIGHT / 2;

        setLocation(posWindowX,posWindowY);
        setTitle("Practice Window");
        setResizable(true);
        setLayout(new GridLayout(2,1));

    }

    private void closeAll() {
        closeAllBtn = new JButton("Close All");
        closeAllBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(closeAllBtn);
    }

    private void returnToMain() {
        returnToMainBtn = new JButton("Return to Main Window");
        returnToMainBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainWindow.setVisible(true);
            }
        });
        add(returnToMainBtn);

    }

}

