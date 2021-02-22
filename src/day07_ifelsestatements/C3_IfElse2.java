package day07_ifelsestatements;

import java.util.Scanner;

public class C3_IfElse2 {
	
	public static void main(String[] args) {
		
		// Kullanicidan bir karakter girmesini isteyin
		// harf olup olmadigini yazdirin
		
		Scanner scan =new Scanner(System.in);
		//1.Way
        System.out.println("Lutfen bir karakter giriniz");
        char karakter = scan.next().toLowerCase().charAt(0);
        
        if(karakter >= 'a' && karakter <= 'z') {
        	System.out.println("girdiginiz karakter harf");
        }else {
        	System.out.println("girdiginiz karacter harf degil");
        }
        
        
        //2.Way
        System.out.println("Lutfen bir karakter giriniz");
        char ch = scan.next().charAt(0);
        
        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
        	System.out.println("girdiginiz karakter harf");
        }else {
        	System.out.println("girdiginiz karacter harf degil");
        }
        
        
        scan.close();
	}

}
