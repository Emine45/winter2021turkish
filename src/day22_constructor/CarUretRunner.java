package day22_constructor;

public class CarUretRunner {

	public static void main(String[] args) {

		CarUret car1 = new CarUret();
		
		car1.model = "Toyota";
		car1.marka = "Corolla";
		car1.yil = 2010;
		car1.kazasiVarMi = true;
		
		
		System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasiVarMi);
		
		car1.yakit("Benzin");
		car1.vites("Duz");
		}

}
