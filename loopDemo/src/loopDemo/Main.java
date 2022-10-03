package loopDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//For
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("1-10 ARASINDAKİ TEK SAYILAR:\n");
		
		for (int i = 1; i < 10; i+=2) {
			System.out.println(+i);
		}
		
		System.out.println("1-10 ARASINDAKİ ÇİFT SAYILAR:\n");
		
		for (int i = 2; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("for döngüsü bitti");
		
				
		//While
		int i=1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("while döngüsü bitti");
		
		//Do While 
		int j=100; //şart uymasa bile do while döngüsünde kod bir kere çalışır 100ü yazdırır.
		do {
			System.out.println(j);
			j++;
		}while(j<10);
		
		System.out.println("do-while döngüsü bitti");

	}

}
