package pieces;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Knight extends Piece{
	
	private static int value = 1;
	private static String name = "Knight";
	private static String notation = "N";
	private String image;
	
	public Knight(String color, int x, int y) {
		super(value, name, color, notation, x, y);
		
		image = "/images/pieces/fantasy/png/"+getColor()+"p";
		super.setImage(image);
		
	}
	
}
