package day15_methodcreation;

public class C4_FoorLoop1 {

	public static void main(String[] args) {

		// 5 defa Hello World yazdiralim
		/*
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		*/
		
		// bunun yerine loop kullaniyoruz
		// ne yapacagimizi java'ya soyluyoruz, kac kere yapmasi gerektigini de soyluyoruz
		
		// Tum loop'larda 3 seyi yazmak zorundayiz
		// 1) baslangic degeri
		// 2) bitis degeri
		// 3) artis degeri
		
		for(int i=1;i<=5;i++) { //Bu sekilde 5 tane Hello World yazdirir
			System.out.println("Hello World");
		}
		
		System.out.println("================");
		
		for(int i=1;i<=5;i++) {  //Bu sekilde 5 tane 1Hello World diye 5'e kadar sirayla yazdirir
			System.out.println(i + "Hello World");
		}
		
		System.out.println("================");
		
		for(int i=10;i>3;i--) {  ////Bu sekilde 10'dan geriye 10Hello World diye 4'e kadar sirayla yazdirir
			System.out.println(i + "Hello World");
		}
		
		System.out.println("================");
				
		for(int i=50;i>3;i-=5) {  ////Bu sekilde 50'den geriye 50Hello World diye 4'e kadar 5'er 5'er geriye dogru yazdirir
			System.out.println(i + "Hello World");
		}
		
		System.out.println("================");
		
		for(int i=100;i>300;i-=5) {  ////Bu sekilde hic birsey yazdirmaz.Alttaki cod calisir'i yazarsak o calisir for dongusu bisey yazdirmaz
			System.out.println(i + "Hello World");
		}
		System.out.println("Kod calisti");
		
		// Not : Eger sart kismi bizim artisimiza gore hep true verirse loop sonsuz donguye girer
        // Not : loop'da artis degeri pozitif oldugu gibi negatif de olabilir i--
        // Not : Artis degeri 1 olmak zorunda degil, farkli da olabilir
        // Not : Eger Loop'un sarti hic true olmazsa loop body hic devreye girmez

	}

}
