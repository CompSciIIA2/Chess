package pieces;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;

public class Pawn extends Piece{
	
	private static int value = 1;
	private static String name = "Pawn";
	private static String notation = "";
	private String image;
	
	public Pawn(String color, int x, int y) {
		super(value, name, color, notation, x, y);
		image = "/images/pieces/fantasy/png/"+getColor()+"p.png";
		super.setImage(image);
		
	}
	
}
