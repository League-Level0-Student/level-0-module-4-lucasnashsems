PImage donkey;
PImage tail;
import ddf.minim.*;
AudioSample woohooSound;      
boolean playSound = true;
void setup() {  
  size(500,500);
 donkey = loadImage("donkey.jpg");
tail = loadImage("tail.png"); 
donkey.resize(500,500);
tail.resize(75,75);
background (donkey);
image(tail, mouseX, mouseY);
image(tail, mouseX-10, mouseY-20);
Minim minim = new Minim(this);
woohooSound = minim.loadSample("homer-woohoo.wav");
if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
}
void draw() {
 rect(0, 0, 30, 30); 
  rect(420, 100, 40, 40);
  dist(0, 0, mouseX, mouseY);
  
}
