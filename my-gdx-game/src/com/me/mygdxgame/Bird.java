package com.me.mygdxgame;

import java.awt.Event;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Bird implements KeyListener{
	
boolean alive = true;
// Create the bird size

private Position position = new Position(45,45,50,50,10,20);
//stub

public void fly( ){

	if (Collide = true){//Collide is from Sayujya's collision class
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

@Override
public void keyPressed(KeyEvent e) {// TRYING TO LEARN TO USE KEY LISTENERS 
	if(e.getKeyCode() == KeyEvent.VK_LEFT){
		this.setPosition(this.position.updatePosition(this.getPosition().getxStart()-1, this.getPosition().getyStart()));
		this.setPosition(this.position.updatePosition(this.getPosition().getxStart()-1, this.getPosition().getyStart()));
	}
	else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
		this.setPosition(this.position.updatePosition(this.getPosition().getxStart()+1, this.getPosition().getyStart()));
		this.setPosition(this.position.updatePosition(this.getPosition().getxStart()+1, this.getPosition().getyStart()));
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

private Position getPosition() {
	return position;
}

private void setPosition(Position position) {
	this.position = position;
}



}
