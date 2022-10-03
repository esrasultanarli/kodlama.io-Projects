package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 2;
		int sayi2 = 25;
		int sayi3 = 39;
		int enBuyuk = sayi1;
		
		/*
		 * if(sayi1>sayi2 && sayi1>sayi3) {
		 * System.out.println("En büyük sayi ="+ sayi1); } else if(sayi2>sayi1 &&
		 * sayi2>sayi3) { System.out.println("En büyük sayi ="+ sayi2); } else
		 * if(sayi3>sayi1 && sayi3>sayi2) {
		 * System.out.println("En büyük sayi ="+ sayi3); }
		 */

		if(enBuyuk<sayi2) {
			enBuyuk=sayi2;
		}
		if(enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		
		System.out.println("En büyük sayi ="+ enBuyuk);
		
		
	}

}
