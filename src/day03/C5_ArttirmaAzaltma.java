package day03;

public class C5_ArttirmaAzaltma {

	public static void main(String[] args) {

		int num = 15;
		
		// bir sayiyi 2 artirmak istersek sayiyi iki ile toplariz
		
		int num2 = num+2;
		
		System.out.println("num2 = " + num2);
		System.out.println("num = " + num);
		
		num = num+5;  // esitligin solunda num yazdigimizda esitligin sagindaki islemde olusan sonuc num
		              // num variable'ina atanir. Bu satirdan SONRA num = 20 dir.
		
	    System.out.println("Yeni num degiskeni : " + num);
	    
	    
	    System.out.println(num+12);  //32
	    
	    // bir sayiyi artirmak (increment) istersek o sayiyi istedigimiz sayiyi ekler ve sonucu
	    // variable'a atariz
	    
	    // num'i 8 artirin
	    num = num+8;  //num=28
	    
	    
	    //num'i % artirin
	    num += 5;     //num =33
	    System.out.println("Javanin pratik artirisindan sonra num = " + num);  
	    
	    
	    // num'i 10 arttiralim
	    num += 10;  //num=43
	    
	    
	    //num'i 1 artirin
	   // 1.way
	    num +=1;    //num=44;
	    
	    //2.Way
	    num++;
	    System.out.println("num'in son hali : " + num);
	    
	    
	    
		
	}

}
