/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pieces;

import java.awt.image.BufferedImage;

/**
 *
 * @author Rashad
 */
public interface Piece {
    
    public String getColor();
    
    public String getSymbol();
    
    public BufferedImage getImage();
    
    public int getValue();
    
    public String getPosition();
    
    public void setPosition(String position);
    
}
