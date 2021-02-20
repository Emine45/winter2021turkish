package day06_ifstatement;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {

		//Kullanicidan gun isminin ilk harfini isteyin ve harfe uygun olan gun isimlerini yazdirin
		//c --> cuma ,cumartesi
		
		
		Scanner scan = new Scanner(System.in);
		
		//1.Way
		System.out.println("Lutfen bir harf giriniz");
		char harf = scan.next().toLowerCase().charAt(0);
		
		if(harf=='p') {
			System.out.println("Pazartesi , Persembe, Pazar");
		}
		if(harf =='s') {
			System.out.println("Sali");
		}
		if(harf =='c') {
			System.out.println("Carsamba, Cuma , Cumartesi");
		} 
		
		
		
		//2. Way
		System.out.println("Lutfen gun isminin ilk harfini giriniz");
		char ilkHarf = scan.next().charAt(0);
		
		if(ilkHarf=='p' || ilkHarf=='P') {
			System.out.println("Pazartesi , Persembe, Pazar");
		}
		if(ilkHarf =='s' || ilkHarf =='S') {
			System.out.println("Sali");
		}
		if(ilkHarf =='c'  || ilkHarf =='C') {
			System.out.println("Carsamba, Cuma , Cumartesi");
		}
		if (ilkHarf!='p' && ilkHarf!='P' && ilkHarf!='s' && 
                ilkHarf!='S' && ilkHarf!='c' && ilkHarf!='C') {
            System.out.println("Lutfen gecerli bir harf yaziniz");
        }

		
		
			
		scan.close();
	}

}
