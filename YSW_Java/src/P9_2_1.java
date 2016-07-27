/*
   I've never studied Java!, Problem 9-2
   Define various class
 */

class Point {
	int xPos, yPos;
	
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void showPointInfo() {
		System.out.println("[" + xPos + ", " + yPos + "]");
	}
}
class Circle {
	Point center;
	int rad;
	
	public Circle(int x, int y, int r) {
		center = new Point(x, y);
		rad = r;
	}
	
	public void showCircleInfo() {
		System.out.println("radius : " + rad);
		center.showPointInfo();
	}
	
}

class Ring {
	Circle Inner, Outter;
	
	public Ring(int x1, int y1, int r1, int x2, int y2, int r2 ) {
		Inner = new Circle(x1, y1, r1); //  좌표 인스턴스 생성
		Outter = new Circle(x2, y2, r2);
	}
	
	public void showRingInfo() {
		System.out.println("Inner Circle Info...");
		Inner.showCircleInfo();
		System.out.println("Outter Circle Info...");
		Outter.showCircleInfo();
	}
}

public class P9_2_1 {

	public static void main(String[] args) {
		Ring ring = new Ring(1, 1, 4, 2, 2, 9);
		ring.showRingInfo();
	}

}
