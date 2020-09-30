public class Saske {
	public static void main(String[] args) {
		double x = Double.valueOf(args[0]);
		int n = Integer.valueOf(args[1]);
		double sum = 0;
		if (x>=0 && n>=0 && x!=(-(n*(n+1)))) {
			sum = n+1;
			for (int i=n; i>=1; i--) {
				sum = n+x/sum;
			}
			System.out.println("Sum: " + sum);
		}
		else {
			System.out.print("Error");
		}
	}
}