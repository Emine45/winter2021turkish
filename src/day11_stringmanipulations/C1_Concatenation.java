package day11_stringmanipulations;

public class C1_Concatenation {

	public static void main(String[] args) {

		// Concantination : Java'da + isareti yapilirken eger toplanan ifadelerden biri veya 
		// her ikisi String ise Java toplama degil BIRLESTIRME yapar
		
		System.out.println(15 + 20 + "Merhaba");  //35Merhaba
		System.out.println("Merhaba" + 15 + 20);   //Merhaba1520
		System.out.println("Merhaba" + (15+20));   //Merhaba35
		System.out.println("Merhaba" + 15 * 20);   //Merhaba300
		
		String str1 = "Hello";
		String str2 = "World";
		
		//Hello World yazdirmak istersek
		System.out.println(str1 + " " + str2);   //Hello World
		
		//str1.concat(str2) methodu str1'in sonuna str2'yi ekler
		System.out.println(str1.concat(str2));   //HelloWolrd
		System.out.println(str1.concat(" " + str2));   //Hello World
		System.out.println(str1.concat(" ").concat(str2));   //Hello World
	}

}
