public class Cos {
	public static void main(String [] args) {
		int n = Integer.parseInt(args[0]);
		double x = Double.parseDouble(args[1]);
		double sum = 0;
		if (args.length == 2 && n>0) {
			for (int i=0; i<n; i++) {
				sum = Math.cos(x+sum);
			}
			System.out.println((Math.round(sum*1000.0))/1000.0);
		}
		else {
			System.out.println("Error");
		}
	}
}