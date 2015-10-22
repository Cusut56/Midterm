///// Midterm code for 59CST112
float left,right,top,bottom;
float middle;

float cueX,cueY,cueDX,cueDY;
float orangeX,orangeY,orangeDX,orangeDY;
float purpleX,purpleY,purpleDX,purpleDY;
float greenX,greenY,greenDX,greenDY;



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
  orangeX=random(middle,right); orangeY=random(top,bottom);
 purpleX=random(middle,right); purpleY=random(top,bottom);
 greenX=random(middle,right); greenY=random(top,bottom);
  
  //random speed
 orangeDX= random(1,3); orangeDY=random(1,3);
  purpleDX=random(1,3); purpleDY=random(1,3);
  greenDX=random(1,3); greenDY=random(1,3);
}

void draw(){
  background(255,255,200);
   rectMode(CORNERS);
    fill(50,205,50);
   rect(left,top,right,bottom);
 
  bounce();
    show();
    collision();

}

void bounce(){
  orangeX=  orangeX + orangeDX;
  if((orangeX>width) ||(orangeX<0))
    ;
    purpleX= purpleX+purpleDX;
  if((purpleX>width)||(purpleX<0))
    ;
    greenX= greenX +greenDX;
  if((greenX>width)||(greenX<0))
    ;
}

//show balls
void show(){
  fill(255);     ellipse(cueX,cueY,30,30);
  
 fill(204,110,0);  ellipse(orangeX,orangeY,30,30);
  
 fill(90,80,250); ellipse(purpleX,purpleY,30,30);
  
 fill(50,200,0); ellipse(greenX,greenY,30,30);
  


}
//collision
void collision(){

}
