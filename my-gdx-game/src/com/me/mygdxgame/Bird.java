package com.me.mygdxgame;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Bird implements KeyListener{
	
boolean alive = true;
// Create the bird size
private int xStart;
private int xEnd;
private int yStart;
private int yEnd;


public void fly( ){

	if(collide = true){//Collide is from Sayujya's collision class
		this.setAlive(false);//Base case 
	}else{// trying to use listener

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
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}



}
