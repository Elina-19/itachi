public class Square {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if (a>=0) {
			for (int i = 1; i<=a; i++) {
				System.out.println("");
				for (int j = 1;j<=a;j++) {
					System.out.print(" *");
				}
			}
		}
		else {
			System.out.print("Error");
		}
	}
}