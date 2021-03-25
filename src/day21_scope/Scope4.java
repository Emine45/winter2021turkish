package day21_scope;

public class Scope4 {

	public static void main(String[] args) {
		int sayi = 10;
		// bir method icinde olusturulan variable, sadece o method icinde kullanilabilir
		// System.out.println(isim);
		
		int sayi2;  //2- bir variable deger atanmadan da olusturulabilir
		// 2- System.out.println(sayi2);  // ancak ilk deger atamasi yapilmayan variable'lar kullanilamaz
		// 2- sayi2++;  //2- ilk deger atanmadigi icin arttirma yada azaltma da yapamayiz
		// 2- Java deger atamasi olmadan local variable ousturulmasina izin verir, ilerde atanacak diye bekler
		
		sayi2 =15;  // 2- olusturma ayri satirda (11. satir), deger atamasi ayri satirda (16. satir) yapilabilir
		
		// 3- birden fazla method'un oldugu class'larda her method'da kullanmamiz gereken
		// 3- ortak variable'lar varsa class level'da variable olusrurmaliyim
		// 3- ortak variable class'in yapisina bagli olarak instance veya static olabilir
		
	}
	
	public static void staticMethod() {
		
		String isim = "Hasan";
		//1- System.out.println(sayi);  bu kural main method ocerisinde olusturulan variable'lar da dahildir
		
	}
	
	public void method() {
		
		boolean isTrue = true;
		//1- System.out.println(sayi);  Bu kural static olan veya olmayan tum methodlar icin gecerlidir
	}

}
