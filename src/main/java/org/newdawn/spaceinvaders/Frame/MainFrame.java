package org.newdawn.spaceinvaders.Frame;

import org.newdawn.spaceinvaders.Rank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MainFrame extends JFrame {
    private JButton startButton;
    private JButton myPageButton;
    private JButton shopButton;
    private JButton RankButton;

    public MainFrame() {
        super("Main Page");
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

        setIgnoreRepaint(false);

        // 버튼 추가
        startButton = new JButton("Start");
        // 버튼 서식
        startButton.setOpaque(false);
        startButton.setContentAreaFilled(false); // 배경
        startButton.setBorderPainted(false); // 배경
        startButton.setForeground(Color.WHITE); // 글자색
        startButton.setFocusPainted(false); // 테두리
        startButton.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 20)); // 폰트
        startButton.setBounds(350, 275, 100, 50);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StageFrame stageFrame = new StageFrame();
                setVisible(false);
            }
        });

        myPageButton = new JButton("MyPage");
        // 버튼 서식
        myPageButton.setOpaque(false);
        myPageButton.setContentAreaFilled(false); // 배경
        myPageButton.setBorderPainted(false); // 배경
        myPageButton.setForeground(Color.WHITE); // 글자색
        myPageButton.setFocusPainted(false); // 테두리
        myPageButton.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 20)); // 폰트
        myPageButton.setBounds(350, 275, 100, 50);

        myPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 마이페이지 넘어가는 로직
                MypageFrame mypage = new MypageFrame();
                setVisible(false);
            }
        });

        shopButton = new JButton("Shop");
        // 버튼 서식
        shopButton.setOpaque(false);
        shopButton.setContentAreaFilled(false); // 배경
        shopButton.setBorderPainted(false); // 배경
        shopButton.setForeground(Color.WHITE); // 글자색
        shopButton.setFocusPainted(false); // 테두리
        shopButton.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 20)); // 폰트
        shopButton.setBounds(350, 275, 100, 50);

        getContentPane().setLayout(new GridLayout(1, 1));

        shopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShopFrame shop = new ShopFrame();
                setVisible(false);
            }
        });

        RankButton = new JButton("Rank");
        // 버튼 서식
        RankButton.setOpaque(false);
        RankButton.setContentAreaFilled(false); // 배경
        RankButton.setBorderPainted(false); // 배경
        RankButton.setForeground(Color.WHITE); // 글자색
        RankButton.setFocusPainted(false); // 테두리
        RankButton.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 20)); // 폰트
        RankButton.setBounds(350, 275, 100, 50);

        getContentPane().setLayout(new GridLayout(1, 1));

        getContentPane().add(startButton, BorderLayout.SOUTH);
        getContentPane().add(myPageButton, BorderLayout.SOUTH);
        getContentPane().add(shopButton, BorderLayout.SOUTH);
        getContentPane().add(RankButton, BorderLayout.SOUTH);

        RankButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 마이페이지 넘어가는 로직
                Rank rank = new Rank();
                setVisible(false);
            }
        });
        // finally make the window visible
//         pack();
//         setResizable(false);
        setVisible(true);

    }
}
