package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{

    public void settings()
    {
        size(500, 500);
    }

    
    public void setup()
    {
        
    }

    float playerX;
    float playerY;
    float playerWidth;

    public void draw()
    {
        background(255, 255, 255);
        drawPlayer(playerX, playerY, playerWidth);
    }

    public void drawPlayer(float x, float y, float w)
    {
        stroke(0);

        strokeWeight(2);

        //body
        line(200, 150, 230, 150);
        line(200, 200, 230, 200);
        line(200, 150, 200, 200);
        line(230, 150, 230, 200);

        //legs
        line(200, 150, 180, 130);
        line(230, 150, 250, 130);
        line(200, 200, 180, 220);
        line(230, 200, 250, 220);

        //eyes
        line(210, 150, 210, 145);
        line(220, 150, 220, 145);
        
    }


    public void keyPressed()
	{
		if (keyCode == LEFT)
		{
            if (playerX > halfPlayerWidth)
            (
                playerX -= playerSpeed;
            )
		}
		if (keyCode == RIGHT)
		{
			playerX += playerSpeed;
		}
		if (key == ' ')
		{
            if (playerX < width - halfPlayerWidth)
            (
                System.out.println("SPACE key pressed");
            )
		}
	}	

}