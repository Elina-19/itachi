public class Sum_ver2 {
	public static void main(String[] args) {
		double n = Double.valueOf(args[0]);
		double sum = 0;
		double k = 1; //счётчик
		if (args.length !=0) {
			if (n>0) {
				while (k<=n) {
					if (k % 2 == 1) {
						sum = sum + 1/(Math.pow((2*k-1), 2));
					}
					else {
						sum = sum - 1/(Math.pow((2*k-1), 2));
					}
					k = k+1;
				}
			}
			else {
				System.out.print("Error");
			}
		}
		System.out.print("Sum: ");
		System.out.print((Math.round(sum*1000.0))/1000.0);
	}
}