package day09_ternary;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {

		//Kullanicidan bir sayi alin ve sayi 3 basamakli ise “uc basamakli sayi”, yoksa “Uc basamakli degil” yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		double sayi = scan.nextDouble();
		
		String sonuc = (sayi>=100 && sayi<=999 || sayi<=100 && sayi>=999) ? "uc basamakli sayi" : "uc basamakli degil";
		System.out.println(sonuc);
		
		//2.way
		System.out.println((sayi>=100 && sayi<=999 || sayi<=100 && sayi>=999) ? "uc basamakli sayi" : "uc basamakli degil");
		
		scan.close();
	}

}
