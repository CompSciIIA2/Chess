/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalyzeScreen;

import MainScreen.MainFrame;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author Jacob
 */
public class AnalyzeScreenBackground extends JPanel {
    private static JList<String> movesList = new JList<String>() ;
    private static JButton back = new JButton("BACK") ;
    private static JButton previous  = new JButton("PREVIOUS MOVE") ;
    private static JButton next = new JButton("NEXT MOVE"); 
    private static JButton play  = new JButton("PLAY") ;
    private static JButton pause = new JButton("PAUSE") ;
    private static JPanel board = new JPanel() ;
    private static JPanel button_panel = new JPanel() ;
    private static JPanel button_board_panel = new JPanel() ;
    Image bg1;

    public AnalyzeScreenBackground(Image img) {
     //   setLayout(new BorderLayout());
            setOpaque(false) ;
        bg1 = img.getScaledInstance(MainFrame.getScreenSize().width, MainFrame.getScreenSize().height, Image.SCALE_DEFAULT);
        add(movesList,BorderLayout.WEST) ;
        add(button_board_panel,BorderLayout.CENTER) ;
        button_board_panel.add(button_panel, BorderLayout.SOUTH) ;
            button_panel.setLayout(new GridLayout(4,1,10,10));
                button_panel.add(previous) ;
                button_panel.add(play) ;
                button_panel.add(pause) ;
                button_panel.add(next) ;
        button_board_panel.add(board,BorderLayout.CENTER) ;
    }
    
    
    // paints the background image from img folder
    @Override
    protected void paintComponent(Graphics g) {
        
  
        g.drawImage(bg1, 0, 0, this);
       super.paintComponent(g) ;
        
    }

}
     

