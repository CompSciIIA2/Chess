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
 * @author S355569
 */
public class Knight implements Piece{
    
    private String color;
    private String symbol = "N";
    private BufferedImage image;
    
    public Knight(String color){
        this.color = color;
        try{
            switch (color) {
                case "BLACK":
                    image = ImageIO.read(new File("img\\chess_pieces\\knight_black.png"));
                    break;
                case "WHITE":
                    image = ImageIO.read(new File("img\\chess_pieces\\knight_white.png"));
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
