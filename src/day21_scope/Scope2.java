package day21_scope;

public class Scope2 {

	public static void main(String[] args) {
		
		// Static variable'lar icin object olusturma ihtiyaci yoktur
		// Baska bir Class'dan static variable'lara ulasmal istedigimizde
		// Ulasmak istedigimiz Class'in adi . static variable adi yazmamiz yeterlidir.

		System.out.println("1 : " + Scope1.okulAdi);  //Yildiz Koleji 
		System.out.println("2 : " + Scope1.okulId); //1201   //Java Run Time program'dir
		                                                    // Scope2 Class'i calisrtirildiginda Scope1 calismazzzzz
		                                                    // dolayisiyla en basta olusturulan veya atanan degerler gecerli olur
		
		Scope1.okulAdi="Mehmet Koleji";
		System.out.println("3 : " + Scope1.okulAdi);  //Mehmet Koleji
		
		Scope1.staticMethod();     //1201 Mehmet Koleji false
		System.out.println("4 : "+ Scope1.okulId);  //1203
		System.out.println("5 : " + Scope1.okulAdi);  //Mehmet Koleji
	}

}
