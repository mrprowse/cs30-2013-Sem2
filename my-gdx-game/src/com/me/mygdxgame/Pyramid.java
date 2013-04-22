package com.me.mygdxgame;

public class Pyramid extends Collision {
	Pyramid (int xStart, int yStart, int xEnd, int yEnd, int heightStart, int heightEnd){
		Position newPosition = new Position(xStart, yStart, xEnd, yEnd, heightStart, heightEnd);
		this.setPosition(newPosition);
	}
	public boolean isBirdDead (Position birdPosition){
		if (this.collide(birdPosition)){
			return true;
		}
		else {
			return false;
		}
	}//stub
}
