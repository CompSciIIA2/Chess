package MainScreen;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jacob
 */
public class MainFrame extends JFrame {

    private static Image bg;
    private static MainFrame m;
    private static MainScreenBackground backgroundPan;
    public static boolean testing = false;
    private static final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();

    public MainFrame(String title) {
        super(title);
        loadTitleScreen();

    }

    public void loadTitleScreen() {
        // load in background
        try {
            bg = ImageIO.read(new File("img\\chess-pieces-1.jpg"));
            System.out.println("HELLO");
        } catch (IOException e) {
            System.out.println("Doesnt exist");
        }

        backgroundPan = new MainScreenBackground(bg);
        add(backgroundPan, BorderLayout.CENTER);
     
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        if (testing) {
            setUndecorated(false);
        } else {
            setUndecorated(true);
        }
        // sets Look and Feel to mimic the System UI
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
SwingUtilities.updateComponentTreeUI(this);
pack();

    }

    public static JFrame getMainFrame() {

        return m;
    }

    public static MainScreenBackground getBackgroundPanel() {
        return backgroundPan;

    }

    public static Dimension getScreenSize() {
        return SCREEN_SIZE;
    }

    public static Image getBgImage() {

        return bg;

    }

    public static void main(String[] arg) {
        m = new MainFrame("Check Mate");
        m.setVisible(true);

    }

}
