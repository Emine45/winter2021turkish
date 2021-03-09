package day21_scope;

public class Scope6 {

//	int num1;
//	String name = "Ali";
	public static void main(String args){ 
		
	  add();
	//  product (5);  // static olmayan bir method static olan bir main method icerisinden cagrilamaz
	  product(5);
	}
	
	
	public static void add(){
		
	// num1 ++;   // static olmayan (instance) num1, static bir method icinden kullanilamaz
	int num2 = 6;
	char letter;
	System.out.println("Do addition ");
	System.out.println(num2+num2);
	
	}
	
	
	public static void product(int num3){
	
	//name = "Veli";
	// num2++;  //num2 ustteki method'da olusturulmus Local bir variable'dir
	System.out.println(num3 * num3);
	
	} 
}

