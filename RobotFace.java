/*This program uses different methods to draw robot face on canvas.
using parameters of exact position on canvas
*/

import acm.graphics.*;
import acm.program.*;

import java.awt.Color;
import java.awt.color.*;

public class RobotFace extends GraphicsProgram{

	public void run() {		
		
		head();
		eyes();
		nose();
		mouth();
	}
	
	private void head() {
		GRect rect = new GRect(100, 100, 300, 400);
		rect.setColor(Color.BLACK);
		rect.setFilled(true);
		rect.setFillColor(Color.GRAY);
		add(rect);
	}
	private void mouth() {
		GRect rect1 = new GRect(150, 400, 200, 50);
		rect1.setColor(Color.BLACK);
		rect1.setFilled(true);
		rect1.setFillColor(Color.WHITE);
		add(rect1);
	}
	private void eyes() {
		GOval oval = new GOval(150, 150, 50, 50);
		oval.setColor(Color.BLACK);
		oval.setFilled(true);
		oval.setFillColor(Color.YELLOW);
		add(oval);

		GOval oval1 = new GOval(300, 150, 50, 50);
		oval1.setColor(Color.BLACK);
		oval1.setFilled(true);
		oval1.setFillColor(Color.YELLOW);
		add(oval1);
	}
	
	private void nose() {
				
		GLine line2 = new GLine(250, 225, 300, 300);
		line2.setColor(Color.BLACK);
		add(line2);
		
		GLine line3 = new GLine(200, 300, 300, 300);
		line3.setColor(Color.BLACK);
		add(line3);
		
		GLine line4 = new GLine(250, 225, 200, 300);
		line4.setColor(Color.BLACK);
		add(line4);
		
	}
}

 

