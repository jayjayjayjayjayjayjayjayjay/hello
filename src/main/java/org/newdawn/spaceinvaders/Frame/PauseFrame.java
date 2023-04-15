package org.newdawn.spaceinvaders.Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PauseFrame extends JFrame {
    private JButton resumeButton;
    private JButton exitButton;
    private JLabel pause;

    public PauseFrame() {
        // create a frame to contain our game
        super("Pause");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame 닫히면 프로그램 종료
        setSize(800, 600);
        setLocationRelativeTo(null); // 창을 화면 중앙에 배치

        // get hold the content of the frame and set up the resolution of the game
        setContentPane(new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                Image backgroundImage = new ImageIcon("src/main/resources/background/mainPageBackground.jpg").getImage();
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        });

        // Tell AWT not to bother repainting our canvas since we're
        // going to do that our self in accelerated mode
        setIgnoreRepaint(false);

        getContentPane().setLayout(null);

        pause = new JLabel("PAUSE");
        pause.setOpaque(false);
        pause.setForeground(Color.WHITE);
        pause.setFont(new Font("Arial", Font.BOLD, 40));
        pause.setBounds(330, 30, 300, 40);
        getContentPane().add(pause);

        // resume game
        resumeButton = new JButton("Resume Game");
        resumeButton.setOpaque(true);
        resumeButton.setBackground(Color.BLACK);
        resumeButton.setForeground(Color.WHITE);
        resumeButton.setFocusPainted(false);
        resumeButton.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 30)); // 폰트
        resumeButton.setBounds(265, 250, 270, 35); // set position and size
        getContentPane().add(resumeButton);

        resumeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameFrame gameFrame = new GameFrame();
                setVisible(false);
            }
        });

        // exit stageFrame
        exitButton = new JButton("Exit Stage");
        exitButton.setOpaque(true);
        exitButton.setBackground(Color.BLACK);
        exitButton.setForeground(Color.WHITE);
        exitButton.setFocusPainted(false);
        exitButton.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 30)); // 폰트
        exitButton.setBounds(265, 370, 270, 35); // set position and size
        getContentPane().add(exitButton);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StageFrame stageFrame = new StageFrame();
                setVisible(false);
            }
        });

        // finally make the window visible
//        pack();
//        setResizable(false);
        setVisible(true);

    }

}
