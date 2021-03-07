package day16_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		/*
		   kullanicidan pozitif bir sayi alin
           1'den kullanicinin girdigi sayiya kadar olan tum tamsayilarin 
           toplamini yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen pozitif bir sayi giriniz");
		int sayi = scan.nextInt();
		
		int sum =0;
		for (int i = 1; i <=sayi; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		scan.close();
	}

}
