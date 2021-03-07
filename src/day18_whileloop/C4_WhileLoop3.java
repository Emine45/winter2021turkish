package day18_whileloop;

import java.util.Scanner;

public class C4_WhileLoop3 {

	public static void main(String[] args) {

		/*
		 * Soru 4) Kullanicidan baslangic ve bitis haflerini alin ve 
		 * baslangic harfinden baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. 
		 * Kullanicinin hata yapmadigini farz edin.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen baslangic harfini giriniz");
		char basHarf = scan.next().toUpperCase().charAt(0);
		System.out.println("Lutfen bitis harfini giriniz");
		char bitisHarf = scan.next().toUpperCase().charAt(0);
		
		for (char i = basHarf; i <= bitisHarf; i++) {
			System.out.print(i + " ");
		}
		
		
		
		System.out.println(" ");
		
		
		// While loop ile yapalim
		// baslangic degeri var basHarf
		
		while(basHarf<=bitisHarf) {
			System.out.print(basHarf + " ");
			basHarf++;
		}
		
		scan.close();
	}

}
