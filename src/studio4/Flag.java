package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor();
		StdDraw.rectangle(.5, .5, .30, .2);
		
		StdDraw.setPenColor(StdDraw.PINK);
		StdDraw.filledRectangle(.5, .5, .29, .19);
		
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledCircle(.5, .5, .12);
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledCircle(.5, .5, .06);
	}
}