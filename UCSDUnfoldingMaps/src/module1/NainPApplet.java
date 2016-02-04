package module1;

import processing.core.PApplet;
import processing.core.PImage;

public class NainPApplet extends PApplet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PImage img;
	
	public void setup() {
		size(500, 500);
		background(211);
		stroke(100);
		
		img = loadImage("palmTrees.jpg", "jpg");
		img.resize(0, height);
		image(img, 0, 0);
		
	}
	
	public void draw() {
		
		fill(255, 204,0);
		ellipse(width/4, height/5, width/5, height/5);
		
	}
	

}
