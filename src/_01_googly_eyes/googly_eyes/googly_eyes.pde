PImage face;
void setup() {
      face = loadImage("E.jpg");
   size(800,600);
    face.resize(width,height);
     background(face);
  
  
 
  
  
}
int x;
int y;
void draw() {
  background(face);
  if(mouseX < 380 && mouseX > 345){
  x = mouseX;
  }
  if(mouseY < 380 && mouseY > 345){
y = mouseY;
  }
  fill(#FFFFFF);
   ellipse(360, 120, 40,40);
  fill(#000000);
   ellipse(x,mouseY, 5,5);
  fill(#FFFFFF);
   ellipse(465, 115, 40,40);
  fill(#000000);
   ellipse(x + 105,mouseY - 5, 5,5);
  
  
}
