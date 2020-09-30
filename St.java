public class St {
	public static void main(String[] args) {
		String abc = "Java";
		String abc2 = "a";
		char a = abc2.charAt(0); //первый элемент подстроки
		int l = abc2.length();
		int len = abc.length();
		char [] itachi = abc.toCharArray(); //строка в массив
		int b = 0;
		for (int i = 0; i<len; i++) {
			if ((abc.charAt(i) == a) && (i+l<=abc.length())) { //если в строке находится 1-ый символ подстроки, то она обрезается и сравнивается с подстрокой
				String abc3 = abc.substring(i,i+l);
				if (abc3.compareTo(abc2) == 0) {
					System.out.println(i);
					b = 3;
					break;
				}
			}
		}
		if (b == 0) {
			System.out.println("-1");
		}
	}
}