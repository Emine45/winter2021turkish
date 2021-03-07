package day16_forloop;

import java.util.Scanner;

public class C6_ForLoop6 {

	public static void main(String[] args) {

		/*
		 * Soru 8 ) Interview Question Kullanicidan bir String isteyin 
		 * ve Stringi tersine ceviren bir program yazin.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String kelime = scan.nextLine();
		
		//1.yol
		//aciklama yazmak istiyorsak for looptan once yazmamiz lazim bu yontemde
		System.out.println("Girdiginiz yazini  tersi : ");
		for (int i=kelime.length()-1; i>=0; i--) {
			System.out.print(kelime.charAt(i));
		}

		
		System.out.println();
		
		//2.yol
		String reverse ="";
		for (int i=kelime.length()-1; i>=0; i--) {
			reverse+=kelime.charAt(i);
		}
		System.out.println("Girdiginiz yazinin tersi : " + reverse);
		
		
		
		
		
		//3.yol method olusturup bunu yazdirabiliriz
				tersineCevir(kelime);
				
				
				
		scan.close();		
	}
	

	public static void tersineCevir(String kelime) {
        System.out.print("Girdiginiz yazinin tersi method ile : ");
        for (int i = kelime.length()-1 ; i >= 0; i--) {
            
            System.out.print(kelime.charAt(i));
        }
        
    }

}
