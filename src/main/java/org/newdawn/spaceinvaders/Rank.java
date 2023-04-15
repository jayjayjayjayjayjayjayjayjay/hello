package org.newdawn.spaceinvaders;

import org.newdawn.spaceinvaders.Frame.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Rank extends JFrame {

    private JButton BackButton;
    private JLabel scoreLabel;
    public Rank() {
        super("Rank");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame 닫히면 프로그램 종료
        setSize(800, 600);
        setLocationRelativeTo(null); // 창을 화면 중앙에 배치

        // get hold the content of the frame and set up the resolution of the game
        setContentPane(new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                Image backgroundImage = new ImageIcon("src/main/resources/background/mainPageBackground0.png").getImage();
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        });

        scoreLabel = new JLabel();

        setIgnoreRepaint(false);

        // 버튼 추가
        BackButton = new JButton("Back");
        // 버튼 서식
        BackButton.setOpaque(false);
        BackButton.setContentAreaFilled(false); // 배경
        BackButton.setBorderPainted(false); // 배경
        BackButton.setForeground(Color.WHITE); // 글자색
        BackButton.setFocusPainted(false); // 테두리
        BackButton.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 20)); // 폰트
        BackButton.setBounds(350, 275, 100, 50);

        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame mainFrame = new MainFrame();
                setVisible(false);
            }
        });


        // JPanel 초기화
        JPanel panel = new JPanel();
        add(panel);

        // scoreLabel 초기화
        scoreLabel = new JLabel();
        scoreLabel.setForeground(Color.BLACK); // 기본 글씨 색을 검은색으로 설정합니다.
        panel.add(scoreLabel);

        // Rank 창을 화면에 표시합니다.
        setVisible(true);



        getContentPane().setLayout(new GridLayout(1, 1));
        getContentPane().add(BackButton, BorderLayout.SOUTH);

        // finally make the window visible
//         pack();
//         setResizable(false);
        setVisible(true);

    }
    public void displayScore(int timer, int alienkill) {
        // 점수를 GUI에 표시하는 코드를 여기에 작성합니다.
        scoreLabel.setText("Time: " + timer + ", Alien Kills: " + alienkill);
    }
}
