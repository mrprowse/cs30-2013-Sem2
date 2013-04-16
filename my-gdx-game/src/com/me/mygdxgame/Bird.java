package com.me.mygdxgame;

import com.sun.java_cup.internal.runtime.Scanner;

public class Bird {
	
boolean alive = true;
// Create the bird size
private int xStart;
private int xEnd;
private int yStart;
private int yEnd;
//stub

public void fly( ){
	if(collide = true){//Collide is from Sayuhya's collision class
		this.setAlive(false);//Base case 
	}else{
		//code to move the bird
	}
}
public Boolean getAlive() {
return alive;
}

public void setAlive(Boolean alive) {
this.alive = alive;
} 
public int getxEnd() {
return xEnd;
}

public void setxEnd(int xEnd) {
this.xEnd = xEnd;
}

public int getxStart() {
return xStart;
}

public void setxStart(int xStart) {
this.xStart = xStart;
}

public int getyEnd() {
return yEnd;
}

public void setyEnd(int yEnd) {
this.yEnd = yEnd;
}

public int getyStart() {
return yStart;
}

public void setyStart(int yStart) {
this.yStart = yStart;
}



}
