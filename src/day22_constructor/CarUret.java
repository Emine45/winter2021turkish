package day22_constructor;

public class CarUret {
	
	// SORU ...... CONSTRUCTOR BU CLASS'DA NEREDE?
	// su anda bu class'da gorunur bir contructor yok
	// bir class olusturuldugunda Java bu class'dan obje uretecegini bilir
	// ve gorunmeyen DEFAULT CONSTRUCTOR'i class'a yerlestirir
	// default constructor parametresizdir dolayisiyla sadece hic bir ozelligini tanimlanamayan
	// objeler uretir (tisort uret)
	// default constructor ile uretilen bir objenin tum ozellikleri sonradan tanimlanmalidir
	
	// eger biz sonradan bir constructor yazarsak, Java default constructor'i iptal eder
	
	// Bir  constructor olusturalim
	public CarUret() {
		
	}
	// Kurallar 1- Isim class ile ayni olmalidir (dolayisiyla buyuk harfle baslar)
	//          2- Constructor return type'a sahip olmalidir
	//          3- constructor isminden sonra mutlaka parantez olur () ama parametre olmasi opsiyoneldir
	//          4- bu constructor olusturuldugunda kimlerin kullanacagini belirlemek icin access modifier yazilir
	
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;

	// bir programda cok fazla uretecegimiz objeler icin bir tane class olustururuz
	// bu class'da olusturulacak objelere ait ozellikler olur
	// bu class direk calistirilmayacagi icin main method olmasada olur
	// (Kaliphane gibidir)
	
	
	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanir");
	}
	
	public void vites(String vites) {
		System.out.println("Araba " + vites + " viteslidir");
	}

}
