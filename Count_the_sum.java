public class Count_the_sum {
	public static void main(String[] args) {
		double n = Double.valueOf(args[0]);
		double m = 1;
		double ch = 1; //числитель
		double z =1; //знаменатель
		double sum =0;
		double k = 1;
		double j = 1;
		if (n>0) {
			while (m<=n) { //находим факториалы пока m не станет равна n
				while (k<=(m-1)) { //факториал числителя
					ch = ch*k;
					k = k+1;
				}
				while (j<=(2*m)) { //факториал знаменателя
					z = z*j;
					j = j+1;
				}
				sum = sum+((ch*ch)/z);
				m = m+1;
			}
		}
		else {
			System.out.println("Error");
		}
		System.out.print("Sum: " + sum);
	}
}