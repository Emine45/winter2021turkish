package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {

		// verilen bir array'de bir elemanin var olup olmadigini nasil kontrol ederiz ?
		 
		int arr[] = { 10,25,3,16,75};
		
		int sayi = 25;
		
		boolean flag = false;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == sayi) {
				flag = true;
			}
			
		}
		if(flag) {
			System.out.println("array sorulan elemani iceriyor");
		}else {
			System.out.println("array sorulan elemani icermiyor");
		}
		
		
		// arrays class'indan method kullanarak yapalim
		// ilk once silama yapmaliyiz
		
		Arrays.sort(arr);   // ilk once siralama yapmaliyiz  [3,10,16,25,75]
		System.out.println(Arrays.binarySearch(arr, sayi));  // 3 //sonuc olarak aranan sayinin index'ini doner
		System.out.println(Arrays.binarySearch(arr, 10));  //1
		System.out.println(Arrays.binarySearch(arr, 28));  //-5  //olmayinca kacinci sirada olurdu - olarak o sayiyi yazdirir
		System.out.println(Arrays.binarySearch(arr, 100));   //-6
		
		
		// binary search sonuc olarak aradigimizx eleman varsa indexini verir
		// aradigimiz eleman yoksa - isareti ile olsaydi kacinci eleman olacagini dondurur
		
		
		
		int arr2[] = {12,15,25,14,3,12,65};
		
		Arrays.sort(arr2);   // [3,12,12,14,15,25,65]
		System.out.println(Arrays.binarySearch(arr2, 14));   //3
		System.out.println(Arrays.binarySearch(arr2, 20));   //-6
		System.out.println(Arrays.binarySearch(arr2, 12));   //3
		System.out.println(Arrays.binarySearch(arr2, 2));   //-1
		
		
		//Array nasil String'e cevrilir
		 String arrayString = Arrays.toString(arr2);
		 System.out.println(arrayString);   // [3, 12, 12, 14, 15, 25, 65]
		 
		 System.out.println(arrayString.substring(5));  //2, 12, 14, 15, 25, 65]  // bastaki [ dahil tum array'i String'e cevirir
	}

}
