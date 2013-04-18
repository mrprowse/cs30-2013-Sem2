package com.me.mygdxgame;

public class Collision {
	private Position position;
	private boolean isPassable;
	
	/**
	 * Returns true if the bird collided with the collision.
	 * @param positionBird
	 * @return boolean value. If collided: true
	 */
	public boolean collide (Position positionBird){
		return this.position.Overlap(positionBird);
	}

	public void updatePositon(int xStart, int yStart){
		this.changePosition(xStart, yStart);
	}
	private void changePosition(int xStart, int yStart){
		position.updatePosition(xStart, yStart);
	}
	public Position getPosition() {
		return position;
	}

	private void setPosition(Position position) {
		this.position = position;
	}

	public boolean isPassable() {
		return isPassable;
	}

	private void setPassable(boolean isPassable) {
		this.isPassable = isPassable;
	}
	//stub
}
