package day10_SwitchCase;

import java.util.Scanner;

public class C3_SwitchCase1 {

	public static void main(String[] args) {

		// Kullanicidan bir rakam isteyin
        // girilen rakami yazi ile yazdirin

			
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir rakam giriniz");
		int sayi = scan.nextInt();
		
		
		if(sayi ==0) {
			System.out.println("Sifir");
		}else if(sayi==1) {
			System.out.println("Bir");
		}else if(sayi==2) {
			System.out.println("Iki");
		}else if(sayi==3) {
			System.out.println("Uc");
		}else if(sayi==4) {
			System.out.println("Dort");
		}else if(sayi==5) {
			System.out.println("Bes");
		}else if(sayi==6) {
			System.out.println("Alti");
		}else if(sayi==7) {
			System.out.println("Yedi");
		}else if(sayi==8) {
			System.out.println("Sekiz");
		}else if(sayi==9) {
			System.out.println("Dokuz");
		}else {
			System.out.println("Lutfen gecerli bir rakam giriniz");
		}
		
		
		// Soruyu switch ile yapalim
		
		switch(sayi) {
		   case 0: 
			   System.out.println("Sifir");
			   break;
		   case 1: 
			   System.out.println("Bir");
			   break;
		   case 2:
			   System.out.println("Iki");
			   break;
		   case 3:
			   System.out.println("Uc");
			   break;
		   case 4:
			   System.out.println("Dort");
			   break;
		   case 5: 
			   System.out.println("Bes");
			   break;
		   case 6:
			   System.out.println("Alti");
			   break;
		   case 7: 
			   System.out.println("Yedi");
			   break;
		   case 8:
			   System.out.println("Sekiz");
			   break;
		   case 9:
			   System.out.println("Dokuz");
			   break;
		   
		   default:  //else gibi, geriye kalan hersey icin gecerli
			   System.out.println("Lutfen gecerli bir rakam giriniz");
		   }
		
		
		scan.close();
	}

}
