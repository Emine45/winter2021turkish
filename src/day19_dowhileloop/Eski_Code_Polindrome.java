package day19_dowhileloop;

import java.util.Scanner;

public class Eski_Code_Polindrome {

	public static void main(String[] args) {
		
		// Kullanicidan bir String isteyin. Kullanicinin girdigi
        // String’in palindrome olup olmadigini kontrol eden bir program yazin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		
		String terstenCumle = "";
		
		for (int i = cumle.length()-1; i >=0; i--) {
			terstenCumle += cumle.charAt(i);
		}
		if(cumle.equals(terstenCumle)) {
			System.out.println("Cumle Polindrome");
		}else {
			System.out.println("Cumle Polindrome degil");
		}
	  
		
		scan.close();
	}
	
}
