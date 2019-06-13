package shapes;

class Circle implements TwoDShape{
	double radius;
	Circle(){
		this.radius = 0;
	}
	Circle(double r){
		this.radius = r;
	}

	public double area(){
		return Math.PI * this.radius * this.radius;
	}

	public double perimeter(){
		return 2 * Math.PI * this.radius;
	}

	public static void details(){
		System.out.println("A circle has a radius and with all points on the circumference being a distance of the radius from the center of the circle");
	}
}