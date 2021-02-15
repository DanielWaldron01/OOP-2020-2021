package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet {

    public float map1(float from, float start1, float stop1, float start2, float stop2)
    {
        return 0;
    }

<<<<<<< HEAD
    public void settings() {
        size(500, 500);   
        
        float f = map1(2, 0, 10, 0 ,width);
        println(f); //should print 100

        f = map1(0, 0, 1, 0, 10);
        println(f); //should print 90

        f = map1(250, 200, 300, 400, 500);
        println(f); // should print 450

        f = map1(5, 0, 10, 1000, 2000);
        println(f); //should print 1500
=======

    public void settings() {
        size(500, 500);          
        
        float f = map1(2, 0, 10, 0, width);
        println(f); // Should print 100

        f = map1(9, 0, 1, 0, 10);
        println(f); // Should print 90

        f = map1(250, 200, 300, 400, 500);
        println(f); // Should print 450

        f = map1(5, 0, 10, 1000, 2000);
        println(f); // Should print 1500


>>>>>>> f26557d85a3ee2ea58ac9e822fe7d8a72fccee08
    }

    int mode = 0;

    public void keyPressed() {
        // the value of mode will be the number of the 
        // number key pressed
        if (keyCode >= '0' && keyCode <= '9')
            mode = keyCode - '0';
    }

    public void setup() {
        colorMode(HSB);
    }

    float offset = 0;

    public void draw() {
        background(0);
        noStroke();
    }
}
