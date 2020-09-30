public class Homework {
	public static void main(String [] args) {
		double t = Double.valueOf(args[0]);
		if (args.length !=0) {
			double g =9.8;
	    	double h = g*t*t/2;
	    	System.out.println("Height: ");
			System.out.print(h);
		}
		else {
		System.out.print("Mistake"); //ставить скобки при else, даже при одной строке
		}
	}
}