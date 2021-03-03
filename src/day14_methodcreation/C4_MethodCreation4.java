package day14_methodcreation;

public class C4_MethodCreation4 {

	public static void main(String[] args) {

		toplama(50,90);             // integer method sonucu : 140
		toplama(20.3,12.5);         // double method sonucu : 32.8
		toplama(60.2, 50);          // double method sonucu : 110.2
		toplama(30, 67.4);          // integer/double method sonucu : 97.4
		toplama('a','b');           // char method sonucu : 195
		toplama("Ali", "Veli");     //String method sonucu : AliVeli
		
	}
	
	public static void toplama(int sayi1, int sayi2) {
		System.out.println("integer method sonucu : " + (sayi1+sayi2));
	}
	
	public static void toplama(double sayi1, double sayi2) {
		System.out.println("double method sonucu : " + (sayi1+sayi2));
	}
	
	public static void toplama(int sayi1, double sayi2) {
		System.out.println("integer/double method sonucu : " + (sayi1+sayi2));
	}
	
	public static void toplama(char char1, char char2) {
		System.out.println("char method sonucu : " + (char1+char2));
	}
	
	public static void toplama(String str1, String str2) {
		System.out.println("String method sonucu : " + (str1+str2));
	}

}
