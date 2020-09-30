public class Point_and_circle {
	public static void main(String[] args) {
		double x0 = Double.parseDouble(args[0]);
		double y0 = Double.parseDouble(args[1]);
		double r = Double.parseDouble(args[2]);
		double x = Double.parseDouble(args[3]);
		double y = Double.parseDouble(args[4]);
		if ((args.length == 5) && (r>=0)) {
			if (Math.pow((x-x0),2)+Math.pow((y-y0),2) == (r*r)) {
				System.out.print("The point is on the circle");
			}
			else {
				System.out.print("The point isn't on the circle");
			}
		}
		else {
			System.out.print("Error");
		}
	}
}