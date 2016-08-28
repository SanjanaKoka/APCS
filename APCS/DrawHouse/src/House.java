
import processing.awt.PSurfaceAWT;
import processing.core.PApplet;
import processing.core.PConstants;

import java.awt.Dimension;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

/*
 * multiple classes
 *	- shape classes
 *	- window 
 *	- house
 *	- main method
 *	- drawing surface/canvas (extends PApplet)
 * commenting
 * variable
 */

public class House{
	
	private float scale = 1f;
	private float xPos;
	private float yPos;

	public void draw(Window window)
	{
		window.stroke(0);
		window.translate(xPos, yPos);
		System.out.println("scale: "+ scale);
		window.scale(scale);
		window.rect(100, 200, 300, 200);
		window.rect(150, 250, 50, 50);
		window.rect(300, 250, 50, 50);
		window.rect(225, 300, 50, 100);
		window.triangle(100, 200, 400, 200, 250, 50);
	}	
	
	public void move(Window window)
	{
		if (window.key == window.CODED)
		{
			System.out.println("key");
		    if (window.keyCode == window.RIGHT)
		    {
		    	xPos = xPos + 50;
		    } else if (window.keyCode == window.LEFT)
		    {
		    	xPos = xPos - 50;
		    }
		    else if(window.keyCode == window.UP)
		    {
		    	yPos = yPos - 50;
		    }
		    else if(window.keyCode == window.DOWN)
		    {
		    	yPos = yPos + 50;
		    }
	}
	}
	
	public void size(Window window)
	{
		if(window.key == '+')
		{
			scale = scale + 0.1f;
		}
		if(window.key == '-')
		{
			scale = scale - 0.1f;
		}
	}
}








