package javastandard.oop.inheritance;

public class DrawShape {

	public static void main(String[] args) {
		Point[] p = { new Point(100, 100), new Point(140, 80), new Point(200, 100), };

		Triangle t = new Triangle(p); // 설정한 Point[] p 포인트형의 배열 p의 element를 Triangle 생성자의 매개변수로 보냄
		Circle c = new Circle(new Point(150, 150), 50);

		t.draw();
		c.draw();

	} // main
} // class

/**
 * 샤프의 클래스 명시적 특징: 샤프의 심은 검정색 동사 : 샤프를 사용해 그림
 */
class Shape {

	String color = "black";

	void draw() {
		System.out.printf("[colors=%s]\n", color);
	}
} // Shape

class Point {
	int x;
	int y;

	Point(int x, int y) { // 생성자
		this.x = x;
		this.y = y;
	}

	Point() { // 생성자
		this(0, 0);
	}

	String getXY() { 
		return "(" + x + "," + y + ")"; // x와 y값을 문자열로 변환 문자열 + 정수는 = 문자열로 변환된다.
	}

} // Point

class Circle extends Shape {
	Point center; // 원의 원점좌표
	int r; // 반지름

	Circle() {
		this(new Point(0, 0), 100);
	}

	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	void draw() { 
		System.out.printf("[center=(%d, %d), r = %d, color = %s]\n", center.x, center.y, r, color);
	}

} // Circle

class Triangle extends Shape {
	Point[] p = new Point[3]; // 3개의 Point instance를 다음 배열을 생성

	Triangle(Point[] p) {
		this.p = p;
	}

	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]\n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}
