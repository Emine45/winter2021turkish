package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary1 {

	public static void main(String[] args) {

		// Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, 
		// girilen degerlere gore dikdortgenin kare olup olmadigini yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kontrol icin dikdortgen kenar uzunluklarini giriniz");
		
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		
		// yazdirmanin 1. yolu
		System.out.println(kenar1>0 && kenar2>0 ? (kenar1==kenar2 ? "Kare" : "Kare degil") : "Gecersiz kenar uzunlugu");
		
		
		//yazdirmanin 2. yolu
		String sonuc = kenar1>0 && kenar2>0 ? (kenar1==kenar2 ? "Kare" : "Kare degil") : "Gecersiz kenar uzunlugu";
		System.out.println(sonuc);
		
		
		scan.close();
	}

}
