package day09_ternary;

public class C1_Ternary1 {

	public static void main(String[] args) {

		int sayi = 101;
		
		// Ternary islemi bir sonuc dondurdugunden bir variable olusturup ona assign etmeliyiz
		String sonuc = (sayi%2==0) ? "cift sayi" : "tek sayi";
		System.out.println(sonuc);
		
		// Ben bir variable'a assign etmek istemezsem
		// syso icine yazabilirim
		System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");
		
		// Basina aciklama yapmak istersem ternary operatorunu parantez icine yazmaliyim
		System.out.println("Islem sonucu : " + (sayi%2==0 ? "cift sayi" : "tek sayi"));
		
		
	}

}
