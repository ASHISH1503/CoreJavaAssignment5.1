abstract class Figure{
	double l,b,B,h,H,r,s;
	abstract void findArea();
	abstract void findPerimeter();
}

 class Circle extends Figure{
	 Circle(double radius){
		 this.r = radius;
	 }
	void findArea(){
		double area = 3.14*r*r;
		System.out.println("Area of Circle :" +area);
	}
	void findPerimeter(){
		double perimeter = 2*3.14*r;
		System.out.println("Perimeter of Circle : "+perimeter);
	}
}
 class Rectangle extends Figure{
	 Rectangle(double length,double breadth){
		 this.l = length;
		 this.b = breadth;
	 }
	void findArea(){
		double area = l*b;
		System.out.println("Area of Rectangle :" +area);
	}
	void findPerimeter(){
		double perimeter = 2*(l+b);
		System.out.println("Perimeter of Rectangle : "+perimeter);
	}
}
 class Triangle extends Figure{
	 Triangle(double Base,double height,double Hypotenuse){
		 this.B = Base;
		 this.h = height;
		 this.H = Hypotenuse;
	 }
	void findArea(){
		double area = (B*h)/2;
		System.out.println("Area of Triangle :" +area);
	}
	void findPerimeter(){
		double perimeter = B+h+H;
		System.out.println("Perimeter of Triangle : "+perimeter);
	}
}

public class Abstract {

	public static void main(String[] args) {
		Figure F1 = new Circle (5);
		Figure F2 = new Rectangle (5,6);
		Figure F3 = new Triangle (7,4,7);
		
		F1.findArea();
		F1.findPerimeter();
		F2.findArea();
		F2.findPerimeter();
		F3.findArea();
		F3.findPerimeter();
	}

}
