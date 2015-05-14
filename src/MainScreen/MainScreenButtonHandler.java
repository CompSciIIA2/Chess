package MainScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import AnalyzeScreen.*;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jacob
 */
public class MainScreenButtonHandler implements ActionListener, MouseListener {

    // handles the behavior of each button
    @Override
    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        // decides what to do based on command of button chosen
        switch (s) {
            case "PLAY GAME":

                break;
            case "ANALYZE GAME":
                startAnalyzer();
//                MainFrame.getMainFrame().getContentPane().removeAll();
//                MainFrame.getMainFrame().repaint() ;
//                MainFrame.getMainFrame().add(asb1 );
//                 MainFrame.getMainFrame().revalidate() ;

                break;
            case "EXIT":

                MainFrame.getMainFrame().dispose();
                break;

        }

    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        JButton b = (JButton) me.getSource();
        b.setForeground(new Color(36, 143, 143));

    }

    @Override
    public void mouseExited(MouseEvent me) {
        JButton b = (JButton) me.getSource();
        b.setForeground(Color.white);
    }

    private void startAnalyzer() {
        AnalyzeScreenBackground asb1 = new AnalyzeScreenBackground(MainFrame.getBgImage());
     


       String comp[] = {"LOAD PGN FILE","MANUAL INPUT"};
        int result = JOptionPane.showOptionDialog(MainFrame.getMainFrame(), "Select Input Method:", "Check Mate Popup", JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, comp,comp);
         switch (result) {
             case JOptionPane.YES_OPTION:
                    JFileChooser jfc = new JFileChooser();

                    int fileC = jfc.showOpenDialog(null);
                    if (fileC == JFileChooser.APPROVE_OPTION) {
                        File filePath = jfc.getSelectedFile();
                        JOptionPane.showMessageDialog(null, "you chose " + filePath.getPath());
                   
                    }
                    break;
                case JOptionPane.NO_OPTION:
                   JOptionPane.showMessageDialog(null, "Coming soon...");
                    break;
         }

    }

  

}
