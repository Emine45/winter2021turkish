package day08_ifelseifnestedif;

import java.util.Scanner;

public class C3_ArtikYil {

	public static void main(String[] args) {
		
		/*Kullanicidan artik yil olup olmadigini kontrol 									
	 	etmek icin yil girmesini isteyin.
					
		Kural 1: 4 ile bolunemeyen yillar artik yil degildir
		Kural 2: 4’un kati olmasina ragmen 100 ile
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yil giriniz");
		int yil = scan.nextInt();
		//1.Way
		if(yil%4==0 && yil%100==0 && yil%400==0) {
			System.out.println("Artik yil");
		}else {
			System.out.println("Artik yil degil");
		}
		
		
		
		//2.Way
		System.out.println("Lutfen yil yaziniz");
        
        int yil1 = scan.nextInt();
        
        if (yil1%4==0  && yil1%100 != 0) {
            
            System.out.println("Artik yil");
            
        } else if(yil1 %100==0 && yil1%400==0){
            System.out.println("Artik yil");
            
        }else {
            System.out.println("Artik yil degil");
        }

		scan.close();
	}

}
