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
	int stepx = int(random(3));
  int stepy = int(random(3)-1);
  x += stepx;
  y += stepy;
   }

}


Walker w;         //Finally we call that class

// void draw() {
// 	w.step();
// 	w.display();
// }





















