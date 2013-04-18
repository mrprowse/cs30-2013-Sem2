package com.me.mygdxgame;

public class Pyramid extends Collision {
	public boolean isBirdDead (Position birdPosition){
		if (this.collide(birdPosition)){
			return true;
		}
		else {
			return false;
		}
	}//stub
}
