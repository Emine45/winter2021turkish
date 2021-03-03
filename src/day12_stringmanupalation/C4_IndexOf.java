package day12_stringmanupalation;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {

		// IndexOf() methodu bize istedigimiz karakter(lerin) indexini doldurur
		
		String str = "Java ogren, is sahibi ol";
		
		System.out.println(str.charAt(6));  //g
		
		System.out.println("char arama : " + str.indexOf('g'));  //6
		
		System.out.println("String arama :" + str.indexOf("g"));  //6
		
		System.out.println("String kelime arama : " + str.indexOf("is"));  //12
		
		System.out.println("Birden fazla varsa : " + str.indexOf('i'));  // ilk buldigi index'ini  // 12
		
		System.out.println("Baslangic indexi ile : " + str.indexOf('a', 3));  //baslangic index'i inclusive. 
		                                                            // Burada 3. index a oldugu 3 yazdirir. 
		                                                            // Eger 4 yazarsak 16 cikar
		
		System.out.println("olmayan harf : " + str.indexOf("dert"));  //-1
		
		//Kullanicidan bir cumle isteyin 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle = scan.nextLine().toLowerCase();
		
		
		int sonuc = cumle.indexOf("java");  //java varsa, ilk java kelimesinin index'ini doldurur
		                                   //java yoksa, -1
		// System.out.println(sonuc==-1 ? "Java icermiyor" : "Java iceriyor");
		
		
		//1.Way
		if(sonuc>=0) {
			System.out.println("Cumle java iceriyor");
		}else {
			System.out.println("Cumle java icermiyor");
		}
		
		
		
		//2.Way
		if(cumle.indexOf("java")>=0) {
			System.out.println("Cumle java iceriyor");
		}else {
			System.out.println("Cumle java icermiyor");
		}
		
		
		scan.close();
	}

}
