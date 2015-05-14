/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pieces;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Rashad
 */
public class King implements Piece {
    
    private String color;
    private String symbol = "K";
    private BufferedImage image;
    
    public King(String color) {
        this.color = color;
        //Sets the color of the piece depending on the input from the constructor
        try{
            switch (color) {
                case "BLACK":
                    image = ImageIO.read(new File("img\\chess_pieces\\king_black.png"));
                    break;
                case "WHITE":
                    image = ImageIO.read(new File("img\\chess_pieces\\king_white.png"));
                    break;
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public String getColor() {
        return color;
    }
    
    public String getSymbol() {
        return symbol;
    }
    
    public BufferedImage getImage() {
        return image;
    }
}
