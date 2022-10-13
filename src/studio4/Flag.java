package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	

		
	StdDraw.setXscale(0, 22);
	StdDraw.setYscale(0, 16);

		   
	StdDraw.setPenColor(37,111,115);
	StdDraw.filledRectangle(11, 8, 9, 5);
	
	StdDraw.setPenColor(Color.CYAN); 
	StdDraw.filledCircle(11, 8, 3);
		   
	StdDraw.setPenColor(36,48,97); 
	StdDraw.setPenRadius(.01);
	StdDraw.rectangle(11, 8, 9, 5);
	
	StdDraw.setPenColor(Color.GREEN);
	StdDraw.filledCircle(9.5, 8, 1);
	StdDraw.filledCircle(12.5, 8, 1);  
	
	StdDraw.setPenColor(Color.DARK_GRAY); 
	StdDraw.setPenRadius(.01);
	StdDraw.rectangle(11, 6, 1.5, 0.0);
		   
		 
	}
}