package day10_SwitchCase;

import java.util.Scanner;

public class C2_Ternary {

	public static void main(String[] args) {

		// Kullanicidan bir sayi alin. Sayi cift ise “Cift” yazdirin, degilse sayinin karesini yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int sayi = scan.nextInt();
		
		// Eger ternary'de iki durum icin farkli data tipleri konusu olursa
		// ya variable'a atama yapmadan direk yazdiririz
		// ya da mumkunse sonuclari ayni data tiplerine cevirmeye calisiriz
		
		String sonuc = sayi%2==0 ? "Cift" : sayi*sayi+"";
		System.out.println(sonuc);
		
		System.out.println(sayi%2==0 ? "Cift" : sayi*sayi);
		
		scan.close();
	}

}
