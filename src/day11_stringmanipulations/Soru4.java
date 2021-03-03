package day11_stringmanipulations;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {

       //Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isim giriniz");
		String isim = scan.nextLine();
		System.out.println("Lutfen soyisim giriniz");
		String soyisim= scan.nextLine();
		
		if(isim.length()>soyisim.length()) {
			System.out.println(isim);
		}else if(isim.length()<soyisim.length()){
			System.out.println(soyisim);
		}else {
			System.out.println("Esit uzunlukta");
		}
		
		
		scan.close();
	}

}
