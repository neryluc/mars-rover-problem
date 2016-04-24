package br.com.lucas.marsrover;

public class Point {
	private int x;
	private int y;
	
	public Point(int coordinateX, int coordinateY) {
		this.x = coordinateX;
		this.y = coordinateY;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void increaseX(int value) {
		this.x += value;
	}

	public void descreaseX(int value){
		this.x -= value;
	}

	public void increaseY(int value) {
		this.y += value;
	}
	
	public void descreaseY(int value){
		this.y -= value;
	}
	
}
