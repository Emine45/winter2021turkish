package day06_ifstatement;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {

		/*
		 *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin Soru 3)
		 * Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
		 * Ornek gun=Pazar output = “Hafta sonu” 
		 *       gun=Sali output = “Hafta ici”
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gun ismi giriniz");
		String gun = scan.next();

		if (gun.equalsIgnoreCase("pazartesi") || gun.equalsIgnoreCase("sali") || gun.equalsIgnoreCase("carsamba")
				|| gun.equalsIgnoreCase("persembe") || gun.equalsIgnoreCase("cuma")) {
			System.out.println("Hafta ici");
		}
		if (gun.equalsIgnoreCase("cumartesi") || gun.equalsIgnoreCase("pazar")) {
			System.out.println("Hafta sonu");
		}
		
		scan.close();

	}

}
