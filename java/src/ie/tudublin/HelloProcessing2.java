package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing2 extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
	}

	//float x = a;
	//int i;
	//String s;
	//boolean b;
	
	public void draw()
	{	
		background(255, 0, 0); 

		fill(255, 255, 0);
		circle(250, 275, 400);
		
		fill(0, 255, 255);
		triangle(250, 50, 40, 450, 460, 450);
		

		fill(0);
		ellipse(200, 150, 100, 50); 

		fill(0);
		ellipse(300, 150, 100, 50); 

		fill(0);
		circle(250, 300, 135);

		fill(0, 255, 255);
		circle(250, 275, 135);

		noStroke();

	}
}
