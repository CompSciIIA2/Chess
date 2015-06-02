/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalyzeScreen;

import MainScreen.MainFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ScrollBarUI;
import javax.swing.plaf.basic.BasicScrollBarUI;

/**
 *
 * @author Jacob
 */
public class AnalyzeScreenBackground extends JPanel {

    private static JList<String> movesList = new JList<String>();
    private static JButton back = new JButton("BACK");
    private static JButton add = new JButton("ADD");
    private static JButton edit = new JButton("EDIT");
    private static JButton delete = new JButton("DELETE");
    private static JButton pause = new JButton("PAUSE");
    private static JPanel board = new JPanel();
    private static JPanel button_panel = new JPanel();
    private static JPanel button_list_panel = new JPanel();
    private static JScrollPane scroll = new JScrollPane(movesList) ;
    Image bg1;

    public AnalyzeScreenBackground(Image img) {
        
       bg1 = img.getScaledInstance(MainFrame.getScreenSize().width, MainFrame.getScreenSize().height, Image.SCALE_DEFAULT);
        setLayout(new BorderLayout());
        setOpaque(false) ;
       
        scroll.getViewport().setOpaque(false);
        scroll.setOpaque(false);
        scroll.setPreferredSize(MainFrame.getScreenSize());
        scroll.setBorder(new EmptyBorder(50,50,50,50));
        UIManager.put("ScrollBar.foreground", new Color(200,1,1)) ;

        SwingUtilities.updateComponentTreeUI(scroll.getVerticalScrollBar()) ;
    
        
         button_list_panel.setOpaque(false);
    //    button_panel.setOpaque(false);
        button_panel.setBackground(new Color(100,0,0,0));
         movesList.setForeground(new Color(50,200,200)) ;
         movesList.setOpaque(false);
         movesList.setBackground(new Color(0,0,0,0));
         movesList.setBorder(null);
         movesList.setFont(new Font("Arial", Font.BOLD, 20)) ;
     
        
        
      
        button_list_panel.setLayout(new GridLayout(2, 1, 30, 30));
        BoxLayout bl = new BoxLayout(button_panel, BoxLayout.X_AXIS);
        button_panel.setLayout(bl);
        

        button_list_panel.add(scroll);
        DefaultListModel dlm = new DefaultListModel() ;
  for(int i = 0 ; i < 100 ; i++)
      dlm.addElement(i + "");
        movesList.setModel(dlm);
 
        button_list_panel.add(button_panel);
       

        button_panel.add(add);
        add.setAlignmentX(CENTER_ALIGNMENT);
        button_panel.add(edit);
        edit.setAlignmentX(CENTER_ALIGNMENT);
        button_panel.add(delete);
        delete.setAlignmentX(CENTER_ALIGNMENT);
        add(button_list_panel, BorderLayout.CENTER);
        add(back,BorderLayout.PAGE_START) ;
        
        back.addActionListener(new ActionListener(){

           @Override
           public void actionPerformed(ActionEvent e) {
          MainFrame.getMainFrame().dispose();
           }
    
    
    
    
    
    });
    }
        
        

        
        
    

    // paints the background image from img folder
    @Override
    protected void paintComponent(Graphics g) {

        g.drawImage(bg1, 0, 0, this);
        super.paintComponent(g);

    

}}
