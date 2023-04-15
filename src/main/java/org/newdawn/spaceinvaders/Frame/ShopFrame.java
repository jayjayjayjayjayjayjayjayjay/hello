package org.newdawn.spaceinvaders.Frame;

import org.newdawn.spaceinvaders.Frame.MainFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class ShopFrame extends JFrame {

    final int itemCount = 3;
    private JButton backButton;
    private JButton[] buyButton;
    private JLabel[] itemIcon;
    private JLabel[] itemName;
    private JTextArea[] itemDesc;

    private int iconSize = 144;
    private int[] iconX = {100, 320, 520};
    private int[] iconNameX = {120, 370, 565};
    private int iconY = 200;
    private int iconNameY = 350;
    private int[] buttonX = {130, 350, 570};
    private int buttonY = 400;
    private String[] iconImage = {"bullet.png", "health.png", "speed.png"};
    private String[] iconName = {"Add Bullets", "Heal", "Speed Up"};
    private String[] iconDesc = {"If the item is used,\nthe number of projectile\ndoubles (can be duplicated)",
                                 "If you use the item,\nyour health is restored\nby half.",
                                 "If the item is used,\nthe player's speed is\nincreased by 1.2 times\n(can be duplicated)."};

    public ShopFrame() {
        super("Shop");
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

        // set layout manager to null
        getContentPane().setLayout(null);

        // item 아이콘
        itemIcon = new JLabel[itemCount];
        for(int i=0; i<itemCount; i++){
            itemIcon[i] = new JLabel();
            itemIcon[i].setBounds(iconX[i], iconY, iconSize, iconSize);
            itemIcon[i].setOpaque(false);
            try {
                itemIcon[i].setIcon(new ImageIcon(ImageIO.read(new File("src/main/resources/itemIcon/" + iconImage[i]))));
            } catch (IOException e){
                e.printStackTrace();
            }
            getContentPane().add(itemIcon[i]);
        }
        // 수정 예정
//        // 설명이 검은색 박스 안에 모두 들어가 아이콘 옆에 붙어 있게 구현
//        itemDesc = new JTextArea[itemCount];
//        for(int i=0; i<itemCount; i++){
//            itemDesc[i] = new JTextArea(iconDesc[i]);
//            itemDesc[i].setEditable(false);
//            itemDesc[i].setOpaque(true);
//            itemDesc[i].setBackground(Color.BLACK);
//            itemDesc[i].setForeground(Color.WHITE);
//            itemDesc[i].setFont(new Font("Arial", Font.PLAIN, 14));
//            if(i!=2)
//                itemDesc[i].setBounds(iconX[i]+iconSize, iconY, iconSize, iconSize);
//            else
//                itemDesc[i].setBounds(iconX[i]-iconSize, iconY, iconSize, iconSize);
//
//            // 마우스 이벤트 처리
//            final int index = i;
//            itemIcon[index].addMouseListener(new MouseAdapter() {
//
//                @Override
//                public void mouseEntered(MouseEvent e) {
//                    itemDesc[index].setVisible(true);
//                }
//
//                @Override
//                public void mouseExited(MouseEvent e) {
//                    itemDesc[index].setVisible(false);
//                }
//            });
////            itemDesc[i].getParent().setComponentZOrder(itemDesc[i], itemDesc[i].getParent().getComponentCount() - 2);
//            getContentPane().add(itemDesc[i]);
//        }

        // item 이름
        itemName = new JLabel[itemCount];
        for(int i=0; i<itemCount; i++){
            itemName[i] = new JLabel(iconName[i]);
            itemName[i].setOpaque(false);
            itemName[i].setForeground(Color.BLACK);
            itemName[i].setFont(new Font("Arial", Font.BOLD, 20));
            itemName[i].setBounds(iconNameX[i], iconNameY, iconSize, 20);
            getContentPane().add(itemName[i]);
        }

        // buy 버튼
        buyButton = new JButton[itemCount];
        for(int i=0; i<itemCount; i++){
            buyButton[i] = new JButton("Buy");
            buyButton[i].setOpaque(true);
            buyButton[i].setBackground(Color.BLACK);
            buyButton[i].setForeground(Color.WHITE);
            buyButton[i].setFocusPainted(false);
            buyButton[i].setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 25));
            buyButton[i].setBounds(buttonX[i], buttonY, 80, 30);
            getContentPane().add(buyButton[i]);
        }

        // back 버튼
        backButton = new JButton("Back");
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false); // 배경
        backButton.setBorderPainted(false); // 배경
        backButton.setForeground(Color.WHITE); // 글자색
        backButton.setFocusPainted(false); // 테두리
        backButton.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 20)); // 폰트
        backButton.setBounds(0, 500, 100, 20); // set position and size
        getContentPane().add(backButton);


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame mainFrame = new MainFrame();
                setVisible(false);
            }
        });

        // finally make the window visible
        setVisible(true);
    }
}

