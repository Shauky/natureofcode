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


int[] randomCounts;

public void settings() {
  size(640, 240);
}


public void setup(){
   randomCounts = new int[20];

}

public void draw(){
	background(255);

	int index = PApplet.parseInt(random(randomCounts.length));
	randomCounts[index]++;

	stroke(0);
	fill(175);

	int w = width/randomCounts.length;

	for(int x =0; x < randomCounts.length; x ++){
		rect(x*w, height-randomCounts[x], w-1, randomCounts[x]);
	}

}

// Defining the walker class
// class Walker{
// 	int x;
// 	int y;

//  Walker(){
//  	x = width/2;
//  	y = height/2;
//  }


// void display() {
// 	stroke(0);                   //This walker uses a stroke to go around the screen
// 	point(x,y);                  //based on its x,y point and position
// }

// void step() {                         //Then it keeps taking this random step
// 	float stepx = random(-1, 1);
//   float stepy = random(-1, 1);
//   x += stepx;
//   y += stepy;
//    }

// }


// Walker w;                     //Finally we call that class

// This is new
// public void settings() {        //Add a default screen size
//   size(640, 360);
// }


//void setup(){                 //and run with the setup(), and draw() methods
	// w = new Walker();
	// background(255);
//}

//void draw() {
//	w.step();
//	w.display();
// }





















  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chapter1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
