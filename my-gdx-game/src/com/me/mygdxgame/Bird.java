package com.me.mygdxgame;

import java.awt.Event;
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
//stub

public void fly( ){

	if(collide = true){//Collide is from Sayujya's collision class
		this.setAlive(false);//Base case 
	}else{
		fly();// What? Recursion? Maybe?

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
public void keyPressed(KeyEvent e) {// TRYING TO LEARN TO USE KEY LISTENERS 
	if(e.getKeyCode() == KeyEvent.VK_LEFT){
		this.setxStart(this.getxStart()-1);
		this.setxEnd(this.getxEnd()-1);
	}
	else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
		this.setxStart(this.getxStart()+1);
		this.setxEnd(this.getxEnd()+1);
	}
       
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
