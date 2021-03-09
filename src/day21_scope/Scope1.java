package day21_scope;

public class Scope1 {
	
	static int okulId=1201;
	static String okulAdi="Yildiz Koleji";
	static boolean acikMi;
	
	// static variable'laqr class level'da olusturuldugu icin  class'in her yerinde kullanilabilirler
	// instance variable'lar static olmayan method'larda direk kullanilabiliyorken, static method'larda
	// static variable'lar ise ister static isterse static olmayan tum method'larda direk kullanilabilir

	public static void main(String[] args) {
		
		System.out.println(okulId + " " + okulAdi + " " + acikMi);  //1201 Yildiz Koleji false
		okulId=1202;
		acikMi=true;
		
		staticMethod();
		
		System.out.println(okulId + " " + okulAdi + " " + acikMi);  //1203 Yildiz Koleji true
		


	}
	
	
	public static void staticMethod() {
		
		System.out.println(okulId + " " + okulAdi + " " + acikMi);   //1202 Yildiz Koleji true
		okulId=1203;

	}
	
	public void method() {
		okulId=1205;
	}
	
	
	//method olan methodu cagirmak istersek eger Scope1 scope = new Scope1();
	// scope.method();
	// System.out.println(okulId + " " + okulAdi + " " + acikMi);

}
