package guimodule;

import processing.core.PApplet;

public class NainDisplay extends PApplet{

	
	public void setup(){
		size(800, getGoldenRatio(800));
		
		stroke(59, 166, 176);
		background(35, 43, 48);
	}
	
	private int getGoldenRatio(int size){
		Double gr = size/1.618;
		return gr.intValue();
	}
	
	private int getGoldenRatioB(int size){
		Double gr = size/1.618;
		return size-gr.intValue();
	}
	
	public void draw(){
		
		int size = getGoldenRatioB(getGoldenRatio(height));		
		int mainX = getGoldenRatioB(width);
		int mainY = getGoldenRatioB(height);
		
		
		fill(19, 123, 143);
		ellipse(mainX, mainY, size, size);
		
		int propX = getGoldenRatioB(size/2);
		int propY = getGoldenRatioB(size/2);
		int propWidth = getGoldenRatioB(size/2);
		int propHeight = getGoldenRatio(size/2);
		
		fill(64,196,198);
		ellipse(mainX-propX, mainY-propY, propWidth, propHeight);
		ellipse(mainX+propX, mainY-propY, propWidth, propHeight);
		
		
		int propBigWidth = getGoldenRatio(size);
		int propBigHeight = getGoldenRatioB(size);
		noFill();
		arc(mainX, mainY+propY, propBigWidth, propBigHeight, 0, getGoldenRatio((int)PI));
		
	}
}
