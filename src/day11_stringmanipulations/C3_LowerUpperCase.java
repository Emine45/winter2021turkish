package day11_stringmanipulations;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {

		// str.toLowerCase() verilen String'in tamamini kucuk harfe cevirir
		// str.toUpperCase() verilen String'in tamamini kucuk harfe cevirir
		
		String str = " Techproeducation";
		System.out.println(str);
		
		//buyuk harfle yazdirmak istersek 
		System.out.println(str.toUpperCase());
		
		
		//str'i buyuk harfe cevirmek istersek
		str=str.toUpperCase();  // Bu satirdan sonra kalici olarak str BUYUK harflerden olusan bir String oldu
		System.out.println(str); 
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));
	}

}
