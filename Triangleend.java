public class Triangleend {
	public static void main(String [] args) {
		int n = Integer.parseInt(args[0]);
		int [] str1 = new int[n+2];
		int [] str2 = new int[n+2];
		str1 [1] = 1;
		long maxsim = 1;
		for (int i = 1; i<=n/2; i++) {
			maxsim = maxsim*i;
		}
		long maxsim2 = maxsim;
		for (int i = n/2+1; i<=n; i++) {
			maxsim2 = maxsim2*i;
		}
		maxsim = (int)(Math.round(maxsim2/(maxsim*maxsim)));
		int max = (int)Math.ceil(Math.log10(maxsim));
		int two = 2;
		while (two <= max) {
			two = two*2;
		}
		max = two;
		for (int i = 0; i<=n; i++) {
			System.out.println("");
			for (int j = 0; j<max*(n-i)/2; j++) {
				System.out.print(" ");
			}
			for (int p = 1; p<(i+1); p++) {	
				int num = str1[p-1]+str1[p];
				int kolsim = 1;
				while (num>9) {
					num = num/10;
					kolsim++;
				}
				for (int m = 0; m<max-kolsim;m++) {
					System.out.print(" ");
				}
				System.out.print(str1[p-1]+str1[p]);		
			}
			for (int k = 0; k<i+1; k++) {
				str2[k] = str1[k];
			}
			for (int j = 2; j<=i; j++) {
				str1 [j] = str2[j-1]+str2[j];
			}
		}
	}
}