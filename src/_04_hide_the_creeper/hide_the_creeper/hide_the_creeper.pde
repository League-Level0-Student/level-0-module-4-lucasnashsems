PImage creeper;
int x = 70;
int y = 180;
PImage minecraft;
void setup() {
 size(500,500); 
 minecraft = loadImage("minecraft.png");     
minecraft.resize(500,500);         
background(minecraft);       
 creeper=loadImage("creeper.png");     
 creeper.resize(10, 10);
 
 
}

void draw() {
  background(minecraft);
  
 image(creeper, x, y); 
 
 if (mousePressed){
   if(isNear(mouseX, x) && isNear(mouseY, y)){
     fill(#00FF0A);
     print("You found the Creeper!!!");
   }else{
 fill(#FF0000);
   }
   ellipse(mouseX, mouseY, 20, 20);
 }

 
}


 boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
