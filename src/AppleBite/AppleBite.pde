void setup() {
    size(500, 500);

}
void draw() {
    background(200, 200, 200);
    noStroke();
     fill(#F50010);
   ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#3A9D13);
    rect(176, 103, 12, 32);
    
    if (mousePressed == true){
    fill(#C9C9C9);
    ellipse(50, 200, 150, 50);

    }
}