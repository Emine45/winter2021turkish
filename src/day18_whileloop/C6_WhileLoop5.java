package day18_whileloop;

public class C6_WhileLoop5 {

	public static void main(String[] args) {

		// Verilen sayinin asal olup olmadigini bulan bir program yazin
		// asal sayi : 1 ve kendisi disinda pozitif tamsayiya kalansiz bolunmeyen
		
		int sayi =41;
		
		String flag = "Asal";  // bizim istedigimiz sartin gerceklesip gerceklesmedigine kontrol eder
		
		int bolen=2;
		
		while(bolen<sayi) {
			if (sayi%bolen==0) {
				flag="Asal sayi degil";
				
			}
			bolen++;
		}
		System.out.println(flag);
		
	}

}
