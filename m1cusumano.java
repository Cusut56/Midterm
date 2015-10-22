//// Midterm code for 59CST112
float left,right,top,bottom;
float middle;

float cueX,cueY,cueDX,cueDY;
float redX,redY,redDX,redDY;
float yelX,yelY,yelDX,yelDY;
float bluX,bluY,bluDX,bluDY;



void setup(){
size(680,480);
left=65;
right= width-25;
top= 100;
bottom=height-50;
middle= left+(right-left)/2;
reset();
}
void reset(){
  cueX=left +(right-left)/2;
  cueY=top+(bottom-top)/2;
  
  //random positions
  cueX=random(middle,right); cueY=random(top,bottom);
  redX=random(middle,right); redY=random(top,bottom);
  yelX=random(middle,right); yelY=random(top,bottom);
  bluX=random(middle,right); bluY=random(top,bottom);
  
  //random speed
  redDX= random(1,3); redDY=random(1,3);
  yelDX=random(1,3); yelDY=random(1,3);
  bluDX=random(1,3); bluDY=random(1,3);
}

void draw(){
  background(255,255,200);
   rectMode(CORNERS);
    fill(50,205,50);
   rect(left,top,right,bottom);
 
  bounce();
    show();

}

void bounce(){
if((redDX>width) ||(redX<0));
if((yelDX>width)||(yelX<0));
if((bluDX>width)||(bluX<0));
}

//show balls
void show(){
  fill(255);     ellipse(cueX,cueY,30,30);
  
 fill(255,0,0);  ellipse(redX,redY,30,30);
  
 fill(255,255,20); ellipse(yelX,yelY,30,30);
  
 fill(90,90,220); ellipse(bluX,bluY,30,30);
  


}
//collision
void collision(){

}
