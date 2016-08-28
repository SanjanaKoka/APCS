import java.awt.Dimension;

import javax.swing.JFrame;

import processing.awt.PSurfaceAWT;
import processing.core.PApplet;
import processing.core.PConstants;

public class Window  extends PApplet{
	
	private House h;
	private Person p;
	private float xRatio = width/500f;
	private float yRatio = height/500f;
	
	public Window (){
		h = new House();
		p = new Person();
		runSketch();
	}
	
	public void setup() {
		  
	}	
	// The statements in draw() are executed 60 times a second until the 
	// program is stopped. Each statement is executed in 
	// sequence and after the last line is read, the first 
	// line is executed again.
	public void draw() {
		background(255); // Clear the screen with a white background
		  stroke(0);
		  noFill();
		  
		  //translate(xScale, yScale);
		  xRatio = width/500f;
		  yRatio = height/500f;
		  scale(xRatio, yRatio);
		   
		  p.draw(this);
		  h.draw(this);
	}
	
	public void keyPressed()
	{
		h.move(this);
		p.move(this);
		h.size(this);
		p.rotate(this);
	}	
}

