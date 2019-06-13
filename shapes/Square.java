package shapes;

class Square implements TwoDShape{
	double width;
	double height;
	Square(){
		this.width = 0;
		this.height = 0;
	}
	Square(double w){
		this.width = w;
		this.height = w;
	}

	public double area(){
		return this.width * this.height;
	}

	public double perimeter(){
		return 2 * (this.width + this.height);
	}

	public static void details(){
		System.out.println("A square has 4 sides for which all sides are equal");
	}
}