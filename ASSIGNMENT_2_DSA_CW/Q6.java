import java.util.Scanner;

abstract class Shape{
	abstract void findArea();
}
class Square extends Shape{
	void findArea() {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int Area = a*a;
		System.out.println("Area of square is "+Area);
	}
}
class Circle extends Shape{
	void findArea() {
		Scanner sc = new Scanner (System.in);
		int r = sc.nextInt();
		double Area = Math.PI*r*r;
		System.out.println("Area of circle is "+Area);
	}
}
class Triangle extends Shape{
	void findArea() {
		Scanner sc = new Scanner (System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		int Area = l*b;
		System.out.println("Area of tringle is "+Area);
	}
}


public class Q6 {
	public static void main(String[] args) {
		
		Shape square = new Square();
		Shape circle = new Triangle();
		Shape tringle = new Circle();
		
		square.findArea();
		tringle.findArea();
		circle.findArea();
	}
}
