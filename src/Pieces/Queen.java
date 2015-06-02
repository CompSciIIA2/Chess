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
public class Queen implements Piece {
    
    private static final int value = 9;
    private String color;
    private String symbol = "Q";
    private BufferedImage image;
    private String position;
    
    public Queen(String color) {
        this.color = color;
        //Sets the color of the piece depending on the input from the constructor
        try{
            switch (color) {
                case "BLACK":
                    image = ImageIO.read(new File("img\\chess_pieces\\queen_black.png"));
                    break;
                case "WHITE":
                    image = ImageIO.read(new File("img\\chess_pieces\\queen_white.png"));
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
    
    public int getValue() {
        return value;
    }
    
    public String getPosition() {
        return position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
}
