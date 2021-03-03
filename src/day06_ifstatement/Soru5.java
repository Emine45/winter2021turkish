package day06_ifstatement;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {
		
		/*
		  Kullanicidan bir gun alin 
		  eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal gun” yazdirin. 
		  “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. 
		  “Pazar” ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir gun giriniz");
		String gun = scan.nextLine().toLowerCase();
		if(gun.equals("cuma")) {
			System.out.println("Muslumanlar icin kutsal gun");
		}
		if(gun.equals("cumartesi")) {
			System.out.println("Yahudiler icin kutsal gun");
		}
		if(gun.equals("pazar")) {
			System.out.println("Hiristiyanlar icin kutsal gun");
		}
		if(!gun.equals("cuma") && !gun.equals("cumartesi") && !gun.equals("pazar")){
			System.out.println("Lutfen gecerli bir gun giriniz");
		}
		
		scan.close();
	}

}
