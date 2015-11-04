///// Midterm code for 59CST112
float left,right,top,bottom;


float cueX,cueY,cueDX,cueDY;
float orangeX,orangeY,orangeDX,orangeDY;
float purpleX,purpleY,purpleDX,purpleDY;
float greenX,greenY,greenDX,greenDY;
int x=50;
int y=50;
int w =100;
int h =75;



void setup(){
size(680,480);
left=65;
right= width-75;
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
  orangeDX= random(2,3); orangeDY=random(1,3);
  purpleDX=random(1,3); purpleDY=random(1,3);
  greenDX=random(1,3); greenDY=random(1,3);
}
{
left=75;
right = width-50;
top=100;
bottom= height-25;
}
void draw(){
  background(255,255,200);
   rectMode(CORNERS);
    fill(50,205,50);
    rect(left,top,right,bottom);
   


 fill(175);
 rect(x,y,w,h);

  bounce();
    show();
    

}
if(wall)
float middle=x+y/2;              //wall
  stroke(0,127,0);
line(middle,top+5,middle,bottom-5);
}

  void bounce(){
 
    purpleX=purpleDX; if (purpleX<left|| purpleX>right) purpleDX *= -1;
    orangeX=orangeDX; if (orangeX<left||orangeX>right) orangeDX *= -1;
    greenX=greenDX;   if (greenX<left ||greenY>right) greenDX *= -1;
}




//collision(){
float tmp;{
//Swap velocities!
if (dist (purpleX, purpleY, orangeX, orangeY) <100){
  tmp=orangeDX;orangeDX=purpleDY; purpleDX=tmp;


 
}

}


//show balls
void show(){
  fill(255);     ellipse(cueX,cueY,30,30);
  
 fill(204,110,0);  ellipse(orangeX,orangeY,30,30);
  
 fill(90,80,250); ellipse(purpleX,purpleY,30,30);
  
 fill(50,200,0); ellipse(greenX,greenY,30,30);
}
