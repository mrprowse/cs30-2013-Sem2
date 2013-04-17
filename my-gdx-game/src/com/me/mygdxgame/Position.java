package com.me.mygdxgame;

public class Position {
	 int xStart;
	 int yStart;
	 int xEnd;
	 int yEnd;
	 int height;

	Position(){
		this(0,0,0,0,0);
	}
	Position(int xStart, int yStart, int xEnd, int yEnd, int height){
		this.setxStart(xStart);
		this.setyStart(yStart);
		this.setxEnd(xEnd);
		this.setyEnd(yEnd);
		this.setHeight(height);
	}
	public void updatePosition(int xStart, int yStart, int xEnd, int yEnd){
		this.setxStart(xStart);
		this.setyStart(yStart);
		this.setxEnd(xEnd);
		this.setyEnd(yEnd);
	}
	public boolean Overlap(Position object){
		if (((this.getxStart()>object.getxStart()&&this.getxStart()<object.getxEnd())
				&&(this.getxEnd()>object.getxStart()&&this.getxEnd()<object.getxEnd()))){
			
		}
		return false; //stub
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
	public int getHeight() {
		return height;
	}
	private void setHeight(int height) {
		this.height = height;
	}
}
