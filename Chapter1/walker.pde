// Defining the walker class
class Walker{
	int x;
	int y;

 Walker(){
 	x = width/2;
 	y = height/2;
 }


void display() {
	stroke(0);                   //This walker uses a stroke to go around the screen
	point(x,y);                  //based on its x,y point and position
}

void step() {                         //Then it keeps taking this random step
	int choice = int(random(4));       //0,1,2 or 3
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


void setup(){                 //and run with the setup(), and draw() methods
	w = new Walker();
	background(255);
}

void draw() {
	w.step();
	w.display();
}





















