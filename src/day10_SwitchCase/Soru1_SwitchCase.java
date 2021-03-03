package day10_SwitchCase;

import java.util.Scanner;

public class Soru1_SwitchCase {

	public static void main(String[] args) {

		// Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen haftanin kacinci gununu istediginizi giriniz");
        int istenenGun = scan.nextInt();
        
        
        switch(istenenGun) {
        case 1:
        	System.out.println("pazartesi");
        	break;
        case 2:
        	System.out.println("sali");
        	break;
        case 3:
        	System.out.println("carsamba");
        	break;
        case 4:
        	System.out.println("persembe");
        	break;
        case 5:
        	System.out.println("cuma");
        	break;
        case 6:
        	System.out.println("cumartesi");
        	break;
        case 7:
        	System.out.println("pazar");
        	break;
        default :
        	System.out.println("Lutfen gecerli gun sayisi giriniz");
        	break;
        }
        
        scan.close();
	}

}
