public class Round {
	public static void main(String[] args) {
		double R = Double.valueOf(args[0]);
		double p =3.14;
		if (R>0) {
	    	double L = 2*p*R;
	    	double S = p*R*R;
	    	System.out.print("Long: ");
			System.out.println((Math.round(L*100.0))/100.0);
			System.out.print("Square: ");
			System.out.println((Math.round(S*100.0))/100.0);
		}
		else {
			System.out.println("Mistake");
		}
	}
}