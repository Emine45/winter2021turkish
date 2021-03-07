package day15_methodcreation;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {

		/*
		 * Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre
         - @ isareti icermiyorsa gecersiz email yazdirin
         - @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
         - @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”
		 */
		
		email();
		
	}
	
	public static void email() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen email adresinizi giriniz");
		String email = scan.next();
		
		if(!email.contains("@")) {
			System.out.println("Gecersiz email");
		}else if(!email.contains("@gmail.com")) {
			System.out.println("Lutfen gmail adresinizi girin");
		}else if(!email.endsWith("@gmail.com")) {
			System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
		}else {
			System.out.println("Email adresiniz kabul edildi");
		}
		
		scan.close();
	}

}
