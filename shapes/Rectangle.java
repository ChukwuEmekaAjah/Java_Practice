package shapes;

class Rectangle implements TwoDShape{
	double width;
	double height;
	Rectangle(){
		this.width = 0;
		this.height = 0;
	}
	Rectangle(double w, double h){
		this.width = w;
		this.height = height;
	}

	public double area(){
		return this.width * this.height;
	}

	public double perimeter(){
		return 2 * (this.width + this.height);
	}

	public static String details(){
		return "A rectangle has 4 sides for which opposite sides are equal";
	}
}