package day10_SwitchCase;

import java.util.Scanner;

public class C1_TernaryTekrar {

	public static void main(String[] args) {

		//Kullanicidan bir sayi alin ve sayi 3 basamakli positif sayi ise “uc basamakli sayi”, yoksa “Uc basamakli degil” yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();
		
		String sonuc = sayi>=100 ? (sayi<=999 ? "uc basamakli sayi" : "uc basamakli degil") : "uc basamakli degil";
		System.out.println(sonuc);
		
		//2.way
		System.out.println(sayi>=100 ? (sayi<=999 ? "uc basamakli sayi" : "uc basamakli degil") : "uc basamakli degil");
		
		
		
		// Nested ternary olmasin
		String sonuc2 = (sayi>=100 && sayi<=999 || sayi<=-100 && sayi>=-999) ? "uc basamakli sayi" : "uc basamakli degil";
		System.out.println(sonuc2);
		
		//2.way
		System.out.println((sayi>=100 && sayi<=999 || sayi<=-100 && sayi>=-999) ? "uc basamakli sayi" : "uc basamakli degil");
		
		scan.close();
	}

}
