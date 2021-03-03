package day08_ifelseifnestedif;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		/*
		  Soru 12) Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. 
		  Girdiği sayi 5’e bölünüyorsa  son rakamını kontrol edin. 
		  Son rakamı 0 ise ekrana “5’e bölünen çift sayı”  yazdırın. 
		  Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın. 
		  Girdiği password  5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 4 basamakli bir sayi giriniz");
		int sayi = scan.nextInt();
		
		
		if(sayi>=1000 && sayi<=9999 && sayi%5==0 ) {
			if(sayi%10==0) {
				System.out.println("5'e bolunebilen cift sayi");
			}else {
				System.out.println("5'e bolunebilen tek sayi");
			}
		}else {
			System.out.println("Tekrar deneyin");
		}
		
		
		//2.way
		
		 System.out.println("Lutfen 4 basamakli bir sayi giriniz");
	        int sayi1 = scan.nextInt();
	        if (sayi1 >= 1000 && sayi <= 9999) {
	            if (sayi1 % 5 == 0) {
	                if (sayi1 % 10 == 0) {
	                    System.out.println("5'e bolunen cift sayi");
	                } else {
	                    System.out.println("5'e bolunen tek sayi");
	                }
	            } else {
	                System.out.println("tekrar deneyiniz");
	            }
	        } else {
	            System.out.println("lutfen 4 basamakli bir sayi giriniz");
	        }

		
		scan.close();

	}

}





//if(sayi%5==0 ) {
//if(sayi%10==0) {
//	System.out.println("5'e bolunebilen cift sayi");
//}else if(sayi%10!=0){
//	System.out.println("5'e bolunebilen tek sayi");
//}
//}else {
//System.out.println("Tekrar deneyin");
//}
