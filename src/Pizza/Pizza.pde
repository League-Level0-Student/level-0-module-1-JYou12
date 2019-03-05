
void setup(){

size(1000, 1000);
    
 fill(#D69E02);
 ellipse(500, 500, 250, 250);
 
  fill(#DE1013);
 ellipse(500, 500, 225, 225);
}

void draw(){

 
 if (mousePressed == true){
 PImage pepperoni = loadImage("pepperoni.jpg");
 pepperoni.resize(10,10);
image(pepperoni, mouseX, mouseY);
 }
 }