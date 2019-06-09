
class CLArithmetic{
	public static void main(String args []){
		try{
			Double x = new Double(args[0]);
			Double y = new Double(args[1]);
			double result;
			
			if(args.length < 3){
				System.out.println("Command line input should be three");
				return;
			}
			switch(args[2]){
				case "addition":
				case "a":
					result = x + y;
					System.out.println("this is the outcome of addition of "+x +" and "+y+" : "+result);
					break;
				case "division":
				case "d":
					result = x / y;
					System.out.println("this is the outcome of division of "+x +" and "+y+" : "+result);
					break;
				case "multiplication":
				case "m":
					result = x * y;
					System.out.println("this is the outcome of multiplication of "+x +" and "+y+" : "+result);
					break;
				case "subtraction":
				case "s":
					result = x - y;
					System.out.println("this is the outcome of subtraction of "+x +" and "+y+" : "+result);
					break;
				default:
					System.out.println("Please use either a, m, s or d as the third argument");
			}
		} catch( Exception exc){
			System.out.println("There was an error my guy");
			System.out.println(" "+exc);
		}
		

	}
}