public class Wallis_product {
	public static void main(String[] args) {
		double n = Double.valueOf(args[0]);
		double p = 1;
		double k =1;
		if (n>0) {
			while (k<=n) {
				p = (p*4*k*k)/((2*k-1)*(2*k+1));
				k = k+1;
			}
		}
		else {
			System.out.print("Error");
		}
		System.out.print("π= ");
		System.out.print((Math.round((2*p)*1000.0))/1000.0);
	}
}