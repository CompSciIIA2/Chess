package pieces;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Rook extends Piece{
	
	private static int value = 1;
	private static String name = "Rook";
	private static String notation = "R";
	private String image;
	
	public Rook(String color, int x, int y) {
		super(value, name, color, notation, x, y);
		
		image = "/images/pieces/fantasy/png/"+getColor()+"r";
		super.setImage(image);
	}
	
}
