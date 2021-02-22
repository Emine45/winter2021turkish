package day08_ifelseifnestedif;


public class C2_NestedIf {

	public static void main(String[] args) {
		
		// Nested : ic ice
		/*
		  Verilen cinsiyet ve yas icin kisinin emekli olup olmayacagini
		 yazdiran bir java programi yaziniz
		 Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
		 calisan erkekse 65 yasindan buyukse emekli olabilir.
		 */

		String cinsiyet = "Kadin";
		int yas = 59;
		
		if(yas<0) {
			System.out.println("Yas negatif olamaz");
		}else if(cinsiyet.equalsIgnoreCase("erkek") && yas >=65) {
			System.out.println("Emekli olabilirsin");
		}else if(cinsiyet.equalsIgnoreCase("erkek") && yas < 60) {
			System.out.println("emekli olamazsin");
		}else if(cinsiyet.equalsIgnoreCase("kadin") && yas >=65) {
			System.out.println("Emekli olabilirsin");
		}else if(cinsiyet.equalsIgnoreCase("kadin") && yas < 60) {
			System.out.println("emekli olamazsin");
		}else {
			System.out.println("Cinsiyet veya yas tanimsiz");
		}
		
		System.out.println("Nested if ile sonuc");
		
		if(cinsiyet.equalsIgnoreCase("erkek")) {
			if(yas<0) {
				System.out.println("Erkek yas negatif olamaz");
			}else if(yas<65) {
				System.out.println("Bu yastaki erkek emekli Olamaz");
			}else {
				System.out.println("Bu yastaki erkek emekli Olabilir");
			}
		}else if(cinsiyet.equalsIgnoreCase("kadin")) {
			if(yas<0) {
				System.out.println("Kadin yas negatif olamaz");
			}else if(yas<60) {
				System.out.println("Bu yastaki kadin emekli Olamaz");
			}else {
				System.out.println("Bu yastaki kadin emekli Olabilir");
			}
		}else {
			System.out.println("Yazdiginiz cinsiyet sisteme kayitli degildir");
			
		}
		
	}

}
