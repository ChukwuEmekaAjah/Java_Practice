package shapes;

interface TwoDShape{
	double width = 0;
	double height = 0;
	double area();
	double perimeter();
	abstract String details();
}