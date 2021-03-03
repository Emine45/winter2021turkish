package day10_SwitchCase;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin.
            Kullanici 
            S girerse “Software” 
            D girerse “Developer”
            E girerse “Engineer”
            T girerse “In Testing” yazdirin
		 */

		Scanner scan = new Scanner(System.in);
	    System.out.println("Lutfen bir harf giriniz");
	    char harf = scan.next().toUpperCase().charAt(0);   //char'da toUpperCase Kullanarak
	    
	    
	    switch(harf) {
	      case 'S':
	    	System.out.println("Software");
	    	break;
	      case 'D':
			   System.out.println("Developer");
			   break;
		  case 'E':
			   System.out.println("Engineer");
			   break;
		  case 'T':
			   System.out.println("In Testing");
			   break;
		  default:  
			   System.out.println("Lutfen gecerli bir harf giriniz");
	    }
	    
	    
	    
	  //2. way
	    System.out.println("Lutfen bir harf giriniz");
	    char harf2 = scan.next().charAt(0);    // char'da toUpperCase kullanmadan
	    
	    switch(harf2) {
	      case 's' :
	      case 'S':
	    	System.out.println("Software");
	    	break;
	      case 'd':
	      case 'D':
			   System.out.println("Developer");
			   break;
	      case 'e':
		  case 'E':
			   System.out.println("Engineer");
			   break;
		  case 't':
		  case 'T':
			   System.out.println("In Testing");
			   break;
		  default:  
			   System.out.println("Lutfen gecerli bir harf giriniz");
	    
	    }
	    
	    
	    
	    
	    //3. way
	    System.out.println("Lutfen bir harf giriniz");
	    String harf1 = scan.next().toUpperCase();   //String'de toUpperCase Kullanarak
	    
	    switch(harf1) {
	      case "S":
	    	System.out.println("Software");
	    	break;
	      case "D":
			   System.out.println("Developer");
			   break;
		  case "E":
			   System.out.println("Engineer");
			   break;
		  case "T":
			   System.out.println("In Testing");
			   break;
		  default:  
			   System.out.println("Lutfen gecerli bir harf giriniz");
	    }
	    
	    
	  //4. way
	    System.out.println("Lutfen bir harf giriniz");
	    String harf3 = scan.next();    // String'de toUpperCase Kullanmadan
	    
	    switch(harf3) {
	      case "s":
	      case "S":
	    	System.out.println("Software");
	    	break;
	      case "d":
	      case "D":
			   System.out.println("Developer");
			   break;
	      case "e":
		  case "E":
			   System.out.println("Engineer");
			   break;
		  case "t":
		  case "T":
			   System.out.println("In Testing");
			   break;
		  default:  
			   System.out.println("Lutfen gecerli bir harf giriniz");
	    
	    }
	    
	    scan.close();
	}

}
