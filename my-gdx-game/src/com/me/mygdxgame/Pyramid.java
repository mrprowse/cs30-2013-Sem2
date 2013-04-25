package com.me.mygdxgame;

public class Pyramid extends Collision {
	Pyramid (int xStart, int yStart, int xEnd, int yEnd, int heightEnd){
		super(xStart, yStart, xEnd, yEnd, 0, heightEnd, false);
	}	
}
