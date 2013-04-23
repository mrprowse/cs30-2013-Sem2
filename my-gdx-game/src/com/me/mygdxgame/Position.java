package com.me.mygdxgame;

public class Position {
	private int xStart;
	 private int yStart;
	 private int xEnd;
	 private int yEnd;
	 private int heightStart;
	 private int heightEnd;
	 //stub
	Position(){
		this(0,0,0,0,0,0);
	}
	Position(int xStart, int yStart, int xEnd, int yEnd, int heightStart, int heightEnd){
		this.setxStart(xStart);
		this.setyStart(yStart);
		this.setxEnd(xEnd);
		this.setyEnd(yEnd);
		this.setHeightStart(heightStart);
		this.setHeightEnd(heightEnd);
	}
	public Position updatePosition(int xStart, int yStart){
		this.setxStart(xStart);
		this.setyStart(yStart);
		return this;
	}
	/**
	 * Sees if the object passed is within the limits of the object calling.
	 * @param object. The object calling this class must not be flying.
	 * @return boolean. If within limits: True
	 */
	public boolean Overlap(Position object){
		if (((this.getxStart()>object.getxStart()&&this.getxStart()<object.getxEnd())
				&&(this.getxEnd()>object.getxStart()&&this.getxEnd()<object.getxEnd()))){
			if (((this.getyStart()>object.getyStart()&&this.getyStart()<object.getyEnd())
				&&(this.getyEnd()>object.getyStart()&&this.getyEnd()<object.getyEnd()))){
				if (((this.getHeightStart()>object.getHeightStart()&&this.getHeightStart()<object.getHeightEnd())
						&&(this.getHeightEnd()>object.getHeightStart()&&this.getHeightEnd()<object.getHeightEnd()))){
					return true;
				}
			}
		}
		return false;
	}
	 public int getxStart() {
		return xStart;
	}
	private void setxStart(int xStart) {
		this.xStart = xStart;
	}
	public int getyStart() {
		return yStart;
	}
	private void setyStart(int yStart) {
		this.yStart = yStart;
	}
	public int getxEnd() {
		return xEnd;
	}
	private void setxEnd(int xEnd) {
		this.xEnd = xEnd;
	}
	public int getyEnd() {
		return yEnd;
	}
	private void setyEnd(int yEnd) {
		this.yEnd = yEnd;
	}
	public int getHeightStart() {
		return heightStart;
	}
	private void setHeightStart(int heightStart) {
		this.heightStart = heightStart;
	}
	public int getHeightEnd() {
		return heightEnd;
	}
	public void setHeightEnd(int heightEnd) {
		this.heightEnd = heightEnd;
	}
	
	
}
