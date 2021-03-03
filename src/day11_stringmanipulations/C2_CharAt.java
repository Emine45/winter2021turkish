package day11_stringmanipulations;

public class C2_CharAt {

	public static void main(String[] args) {

		//charAt(index)  
		// scan.next().charAt(0)  ==> 0. indexteki karakteri verir
		// index 0'dan baslar 
		
		String str = "Java cok guzel";
		System.out.println(str.charAt(0));   // J
		
		System.out.println(str.charAt(5));    // c
		
		System.out.println(str.charAt(13));   // l
		// Kelimenin uzunlugu son index +1 dir
		// son index kelimenin uzunlugu(length) -1
		// kullanici 10 karakter bir kelime girerse abcd efghi
		// bana son harfi verecek kodu yaziniz
		// //str.charAt(9)
		
		
		//System.out.println(str.charAt(14));  // exception verir
		// eger index olarak String'in uzunlugu veya daha buyuk bir sayi girilirse
		
		//String str3 = 5;  // Compile Time Error CTE
		                    // Kod calismadan Java'nin farkini varip altini kirmizi cizdigi hatalardir
		                    // Bu tur hatalar duzeltilmeden Java kodu calistirmaz 
		
		
		//System.out.println(str.charAt(14));  // Bazi hatalar syntax'den anlasilmaz,
		                                       // ancak kod calistirildiktan sonra Java islemi yaparken anlasilir
		                                       // Kod Run edildiginde ortaya ciktigi icin bu tur hatalara
		                                       // Run Time Error deni RTE
		
	}

}
