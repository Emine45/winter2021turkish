package ifelsestatements;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		
		// Kullanicidan yasini sorun
		// yas 65 veya buyukse "Emekli Olabilir" yoksa "Emekli Olamazsin" yazdirin

		Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();
        
        
        if(yas>=65) {
        	System.out.println("Emekli Olabilir");
        }else {
        	System.out.println("Emekli Olamazsin");
        }
        
        scan.close();
	}

}
