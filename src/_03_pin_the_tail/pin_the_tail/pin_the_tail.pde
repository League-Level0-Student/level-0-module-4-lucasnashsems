PImage donkey;
PImage tail;
void setup() {  
  size(500,500);
 donkey = loadImage("donkey.jpg");
tail = loadImage("tail.png"); 
donkey.resize(500,500);
tail.resize(75,75);
background (donkey);
image(tail, mouseX, mouseY);
image(tail, mouseX-10, mouseY-20);
}
void draw() {
 rect(0, 0, 30, 30); 
  rect(454, 75, 40, 40);
  
  
}
