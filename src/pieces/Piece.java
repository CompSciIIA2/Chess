package pieces;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public abstract class Piece {
	
	public static final int WIDTH = 64;
	public static final int HEIGHT = 64;
	
	private int value;
	private String name;
	private String color;
	private String notation;
	private String image;
	private int x;
	private int y;
	
	/**
	 * 
	 * @param value integer value of the piece
	 * @param color takes in "W" for white and "B" for black
	 */
	public Piece(int value, String name, String color, String notation, int x, int y) {
		this.value = value;
		this.name = name;
		this.notation = notation;
		this.x = x;
		this.y = y;
		createColor(color);
		
	}
	
	private void createColor(String color) {
		switch(color){
		case "W":
			this.color = "w";
			break;
		case "B":
			this.color = "b";
			break;
		}
	}
	
	protected void setImage(String image) {
		this.image = image;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getNotation() {
		return notation;
	}
	
	public Image getPieceImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(image));
		
		return i.getImage();
	}
	
	public String getPieceImagePath() {
		return image;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return String.format("%s: %s, (%d, %d)", this.name, this.color.toUpperCase(), this.x, this.y);
	}
	
	public void draw(Graphics2D g2d) {
		
	}
	
	public void update() {
		
	}
	
}
