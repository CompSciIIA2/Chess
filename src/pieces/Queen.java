package pieces;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Queen extends Piece{
	
	private static int value = 1;
	private static String name = "Queen";
	private static String notation = "Q";
	private String image;
	
	public Queen(String color, int x, int y) {
		super(value, name, color, notation, x, y);
		
		image = "/images/pieces/fantasy/png/"+getColor()+"p";
		super.setImage(image);
		
	}

}
