package org.newdawn.spaceinvaders.Frame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class GameFrame extends JFrame {
    private JButton pauseButton;
    public GameFrame() {
        // create a frame to contain our game
        super("Space Invaders 102");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame 닫히면 프로그램 종료
        setSize(800, 600);
        setLocationRelativeTo(null); // 창을 화면 중앙에 배치

        // get hold the content of the frame and set up the resolution of the game
        JPanel panel = (JPanel) getContentPane();
        panel.setPreferredSize(new Dimension(800,600));
        panel.setLayout(null);

        // Tell AWT not to bother repainting our canvas since we're
        // going to do that our self in accelerated mode
        setIgnoreRepaint(true);
        getContentPane().setLayout(null);
        pauseButton = new JButton("||");
        pauseButton.setOpaque(true);
        pauseButton.setBackground(Color.BLACK);
        pauseButton.setForeground(Color.WHITE);
        pauseButton.setFocusPainted(false);
        pauseButton.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 12));
        pauseButton.setBounds(380, 10, 43, 30);
        getContentPane().add(pauseButton);

        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PauseFrame pauseFrame = new PauseFrame();
                setVisible(false);
            }
        });

        // finally make the window visible
//        pack();
//        setResizable(false);
        setVisible(true);


    }

}
