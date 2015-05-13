/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalyzeScreen;

import MainScreen.MainFrame;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 *
 * @author Jacob
 */
public class AnalyzeScreenBackground extends JPanel {

    Image bg1;

    public AnalyzeScreenBackground(Image img) {
       setOpaque(false);
        bg1 = img.getScaledInstance(MainFrame.getScreenSize().width, MainFrame.getScreenSize().height, Image.SCALE_DEFAULT);
        
    }
    
    
    

     // paints the background image from img folder
    @Override
    protected void paintComponent(Graphics g) {
        
  
        g.drawImage(bg1, 0, 0, this);
       super.paintComponent(g) ;
        
    }

  
}
