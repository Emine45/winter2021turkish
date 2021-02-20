package ifelsestatements;

import java.util.Scanner;

public class C6_IfElseIf1 {

	public static void main(String[] args) {

		// Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A” 

		
		Scanner scan =new Scanner(System.in);
		//1.Way
        System.out.println("Lutfen not giriniz");
        double not = scan.nextDouble();
       
        if(not<0 || not>100) {
        	System.out.println("Lutfen gecerli bir not giriniz");
        }else if(not>=0 && not< 50) {
        	System.out.println("D");
        }else if(not>=50 && not<60) {
        	System.out.println("C");
        }else if(not>=60 && not<80) {
        	System.out.println("B");
        }else if(not>=80 && not<100) {
        	System.out.println("A");
        }
        
        
        //2. Way
        System.out.println("Lutfen not giriniz");
        double not1 = scan.nextDouble();
        
        if(not1<0 || not1>100) {
        	System.out.println("Lutfen gecerli bir not giriniz");
        }else if(not1<50) {
        	System.out.println("D");
        }else if(not1<60) {
        	System.out.println("C");
        }else if(not1<80) {
        	System.out.println("B");
        }else {
        	System.out.println("A");
        }
        
        scan.close();
	}

}
