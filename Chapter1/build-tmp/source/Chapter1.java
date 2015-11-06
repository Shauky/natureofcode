import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chapter1 extends PApplet {


// Defining the walker class
class Walker{
	int x;
	int y;

 Walker(){
 	x = width/2;
 	y = height/2;
 }


public void display() {
	stroke(0);                   //This walker uses a stroke to go around the screen
	point(x,y);                  //based on its x,y point and position
}

public void step() {                         //Then it keeps taking this random step
	int choice = PApplet.parseInt(random(4));       //0,1,2 or 3
    if (choice == 0) {
      x++;
    } else if (choice == 1) {
      x--;
    } else if (choice == 2) {
      y++;
    } else {
      y--;
    }
   }

}


Walker w;                     //Finally we call that class

//This is new
public void settings() {        //Add a default screen size
  size(640, 360);
}


public void setup(){                 //and run with the setup(), and draw() methods
	w = new Walker();
	background(255);
}

public void draw() {
	w.step();
	w.display();
}





















  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chapter1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
