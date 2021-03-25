package deneme;

import java.util.Scanner;

public class deneme1 {

	public static void main(String[] args) {

		for (int i = 10; i > 0; i-=2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		
		for (int i = 0; i < 100; i+=3) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < 100; i++) {
			if(i%3==0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		int product = 1;
		for (int i = 1; i <=10; i++) {
			product*=i;
			
		}
		System.out.println(product);
		
		
		
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//5! islemi
		
		int factoriyel=1;
		for (int i = 1; i <=5; i++) {
			factoriyel*=i;
		}
		System.out.println(factoriyel);
		
		
		// Rakamlar toplami
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();
		
		int rakamlarToplami =0;
		String str=sayi+"";
		
		for (int i = 0; i <=str.length(); i++) {
			rakamlarToplami+=sayi%10;
			sayi/=10;
		}
		System.out.println(rakamlarToplami);
		
		
		
		
		
		
	}

}
