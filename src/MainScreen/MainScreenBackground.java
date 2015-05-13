package MainScreen;


import MainScreen.MainScreenButtonHandler;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jacob
 */
public class MainScreenBackground extends JPanel {

    private JButton play = new JButton("PLAY GAME");
    private JButton analyze = new JButton("ANALYZE GAME");
    private JButton quit = new JButton("EXIT");
    private JPanel bGroup = new JPanel();
    Image bg;

    public MainScreenBackground(Image img) {
        setOpaque(false) ;
        bg = img.getScaledInstance(MainFrame.getScreenSize().width, MainFrame.getScreenSize().height, Image.SCALE_DEFAULT);
        // set layout for button panel
        FlowLayout fl = new FlowLayout();
        fl.setAlignment(FlowLayout.CENTER);
        fl.setHgap(100);
        bGroup.setLayout(fl);
        bGroup.setOpaque(false);
        // add buttons to button panel
        add(bGroup);
        bGroup.add(play);
        bGroup.add(Box.createVerticalStrut(10));
        bGroup.add(analyze);
        bGroup.add(Box.createVerticalStrut(10));
        bGroup.add(quit);
       // sets characteristic for PLAY button
        play.setAlignmentX(CENTER_ALIGNMENT);
        play.setFont(new Font("OCR A Extended", Font.BOLD, 20));
        play.setForeground(Color.WHITE);
        play.setContentAreaFilled(false);
        play.setBorderPainted(false) ;
        play.setFocusPainted(false);
        play.addActionListener(new MainScreenButtonHandler());
        play.addMouseListener(new MainScreenButtonHandler());
        // sets characteristics for ANALYZE button 
        analyze.setAlignmentX(CENTER_ALIGNMENT);
        analyze.setFont(new Font("OCR A Extended", Font.BOLD, 20));
        analyze.setForeground(Color.WHITE);
        analyze.setContentAreaFilled(false);
        analyze.setBorderPainted(false) ;
        analyze.setFocusPainted(false);
        analyze.addActionListener(new MainScreenButtonHandler());
        analyze.addMouseListener(new MainScreenButtonHandler());
        // sets characteristics for QUIT button
        quit.setAlignmentX(CENTER_ALIGNMENT);
        quit.setFont(new Font("OCR A Extended", Font.BOLD, 20));
        quit.setForeground(Color.WHITE);
        quit.setContentAreaFilled(false);
        quit.setOpaque(false);
        quit.setFocusPainted(false);
        quit.setBorderPainted(false) ;
       quit.addActionListener(new MainScreenButtonHandler());
       quit.addMouseListener(new MainScreenButtonHandler());
//       
     
    }

    // paints the background image from img folder
    @Override
    protected void paintComponent(Graphics g) {
        
  
        g.drawImage(bg, 0, 0, this);
       super.paintComponent(g) ;
        
    }
}
