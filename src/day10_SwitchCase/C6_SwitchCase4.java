package day10_SwitchCase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {

		// kullanicidan VIP (Very Important Person) kisaltmasinda hangi harfin anlamini
        // istedigi soralim
        // girilen harfin aciklamasini yazdiralim
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Lutfen bir harf giriniz");
	    char harf = scan.next().toUpperCase().charAt(0);
	    
	    //1.WAY
	    switch(harf) {
		   case 'V': 
			   System.out.println("Very");
			   break;
		   case 'I':
			   System.out.println("Important");
			   break;
		   case 'P':
			   System.out.println("Person");
			   break;
		   default:  
			   System.out.println("Lutfen gecerli bir harf giriniz");
		   }
	    
	    
	    //2.WAY (toUpperCase kullanmazsam)
	    System.out.println("Lutfen bir harf giriniz");
	    char harf2 = scan.next().charAt(0);
	    switch(harf2) {
	       case 'v':
		   case 'V': 
			   System.out.println("Very");
			   break;
		   case 'i':
		   case 'I':
			   System.out.println("Important");
			   break;
		   case 'p':
		   case 'P':
			   System.out.println("Person");
			   break;
		   default:  
			   System.out.println("Lutfen gecerli bir harf giriniz");
		   }
	    
	    // Kullanicinin birden fazla harf girmesini sorun olarak kabul ediyorsaniz
        // ve bunu hata olarak kullaniciya bildirmek istiyorsaniz
	    
	    //3.Way
	    System.out.println("Lutfen bir harf giriniz");
	    String str = scan.next();
	    switch(str) {
	       case "v":
		   case "V": 
			   System.out.println("Very");
			   break;
		   case "i":
		   case "I":
			   System.out.println("Important");
			   break;
		   case "p":
		   case "P":
			   System.out.println("Person");
			   break;
		   default:  
			   System.out.println("Lutfen gecerli bir harf giriniz");
		   }
		
	    
	    scan.close();
	}

}
