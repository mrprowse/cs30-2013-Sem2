package com.me.mygdxgame;


import java.awt.Event;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.EventListener;

public class Bird implements KeyListener,EventListener{
	
boolean alive = true;
// Create the bird size
private Position position = new Position(45,45,50,50,10,20);

//Arrow key movement
public void fly(KeyEvent e){
	if(e.getKeyCode() == KeyEvent.VK_LEFT){ //Move Left
		this.moveLeft();
	}
	else if(e.getKeyCode() == KeyEvent.VK_RIGHT){ //Move Right
		this.moveRight();
	}     
// Touch movement
this.addListener(new InputListener() {
    public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
        Gdx.app.log("Example", "touch started at (" + x + ", " + y + ")");
}

public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
        Gdx.app.log("Example", "touch done at (" + x + ", " + y + ")");
}
});

public void moveLeft(){
	this.setPosition(this.position.updatePosition(this.getPosition().getxStart()-1, this.getPosition().getyStart()));
	this.setPosition(this.position.updatePosition(this.getPosition().getxStart()-1, this.getPosition().getyStart()));
}

public void moveRight(){
	this.setPosition(this.position.updatePosition(this.getPosition().getxStart()+1, this.getPosition().getyStart()));
	this.setPosition(this.position.updatePosition(this.getPosition().getxStart()+1, this.getPosition().getyStart()));
}

public Boolean getAlive() {
return alive;
}

public void setAlive(Boolean alive) {
this.alive = alive;
} 

@Override
public void keyPressed(KeyEvent e) {// TRYING TO LEARN TO USE KEY LISTENERS 
this.fly(e);
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
@Override
public boolean handle(com.badlogic.gdx.scenes.scene2d.Event event) {
	// TODO Auto-generated method stub
	return false;
}



}
