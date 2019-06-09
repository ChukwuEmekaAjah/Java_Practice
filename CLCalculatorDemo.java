
class CLCalculator{
	static void operate(double x, double y, char operator){

		double result; 
		switch(operator){
			case 'a':
				result = x + y;
				System.out.println("this is the outcome of addition of "+x +" and "+y+" : "+result);
				break;
			case 'd':
				result = x / y;
				System.out.println("this is the outcome of division of "+x +" and "+y+" : "+result);
				break;
			case 'm':
				result = x * y;
				System.out.println("this is the outcome of multiplication of "+x +" and "+y+" : "+result);
				break;
			case 's':
				result = x - y;
				System.out.println("this is the outcome of subtraction of "+x +" and "+y+" : "+result);
				break;
			default:
				System.out.println("Please use either a, m, s or d as the operator");
		}

	}
	
	static void usage(){
		System.out.println("This is a Command line tool for doing command line addition in java");
		System.out.println("It is used as thus ' [double] [double] [operator]");
		System.out.println("[filename] is for the compiled file class where it is used");
		System.out.println("[double] is for the number that would be inputted; they must be two");
		System.out.println("[operator] can be any of the following addition, subtraction, multiplication, division used as thus: ");
		System.out.println("a/addition for Addition ");
		System.out.println("s/subtraction for Subtraction");
		System.out.println("m/multiplication for Multiplication");
		System.out.println("d/division for Division");
		System.out.println("s to start, c to continue and q to quit the program");
	}
}

class CLCalculatorDemo {
	public static void main(String args[]) throws java.io.IOException {
		double x = 0, y = 0;
		char operator = 'x';
		char ignore; 
		char choice;
		String temp = "";
		do{
			try{
				CLCalculator.usage();
				choice = (char) System.in.read();
				if(choice == 'q'){
					break;
				}
				do{
					ignore = (char) System.in.read();
				} while (ignore != '\n');
				System.out.print("Please enter the first number: ");
				do{
					ignore =  (char) System.in.read();
					temp += Character.valueOf(ignore);
				} while (ignore != '\n' );
				x = new Double(temp);
				temp = "";
				System.out.print("Please enter the second number: ");
				do{
					ignore =  (char) System.in.read();
					temp += Character.valueOf(ignore);
				} while (ignore != '\n' );
				y = new Double(temp);
				temp = "";
				System.out.print("Please enter the operator type: ");
				operator = (char) System.in.read();
				do{
					ignore = (char) System.in.read();
				} while (ignore != '\n' );
				CLCalculator.operate(x,y, operator);
			} catch(NumberFormatException exc){
				System.out.println("Could not cast it to a number type ");
			}
		} while (true);
	}
}