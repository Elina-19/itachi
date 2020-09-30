public class Fix {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int p = n*n;
		int kolsim = 1;
		int kolsim2 = 1;
		int up = 1;
		if ((n % 1 == 0) && n>0 ) {
			while ( p >=10) {
				kolsim = kolsim+1;
				p = p/10;
			}
			for (int k = 0;k<=n;k++) {
				int k2 = k;
				while ( k2 >=10) {
					up = up+1;
					k2 = k2/10;
				}
				System.out.print(k); //вывод 1 строки
				System.out.print(" ");
				for (int m=1;m<=(kolsim-up);m++) {
					System.out.print(" ");
				}
				up = 1;
			}
			for (int i = 1;i<=n;i++) { //цикл для строк
				System.out.println("");
				System.out.print(i);
				if (i<10) {
					System.out.print(" ");
				}
				for (int j = 1;j<=n;j++) { //цикл для одной строки
					int s = i*j; //количество символов в числе
					while ( s >=10) {
						kolsim2 = kolsim2+1;
						s = s/10;
					}
					for (int m=1;m<=(kolsim-kolsim2);m++) {
						System.out.print(" ");
					}
					System.out.print(" " + i*j);
					kolsim2 = 1;
				}
			}
		}
		else {
			System.out.print("Error");
		}
	}
}