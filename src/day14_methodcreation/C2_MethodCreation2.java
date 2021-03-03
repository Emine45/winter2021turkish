package day14_methodcreation;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		// Bir method'u calistirmak icin main method'un icinden cagirmamiz gerekir
		// Bir methodu cagirmak icin ise method adini ve parametrelere uygun argument'leri yazmaliyiz
		ortalama(85.2,90.3);  //method call

		
	}   
	
	// bir method olusturmak istedigimizde Class'in icinde ama main method'un disinda 
	// bir alanda olusturmaliyiz. Genel kullanim method'lar main method'dan sonra olur
	
	public static void ortalama(double sayi1, double sayi2) {
		
		System.out.println("Girdiginiz iki sayinin ortalamasi : " + (sayi1+sayi2)/2);
		// Bir methodu olusturmak o methodu calistirmak icin yeterli degildir
		// olusturulan method main method icinden cagrilinca calisir
	}

}   
