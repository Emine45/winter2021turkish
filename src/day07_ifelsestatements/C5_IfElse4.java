package day07_ifelsestatements;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {

		/*
		   Kullanicidan bir ucgenin uc kenar uzunlugunu alin 
		   eger uc kenar uzunlugu birbirine esit ise ekrana “Eskenar ucgen” yazdirin. 
		   Diger durumlarda ekrana “Eskenar degil” yazdirin.
		 */
		Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen kenar uzunluklarini giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();
        
        
        if(kenar1==kenar2 && kenar2 == kenar3) {
        	System.out.println("Eskenar ucgen");
        }else {
        	System.out.println("Eskenar degil");
        }
        
        
        
        scan.close();
	}

}
