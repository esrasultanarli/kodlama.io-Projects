package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// 220-284 en küçük arkadaş sayılar.
		//kendileri hariç  pozitif tam bölenleri birbirine eşitse
		
		int sayi1 = 220;
		int sayi2 = 284;
		
		int toplam1 = 0;
		int toplam2 = 0;
		
		for(int i = 1; i< sayi1; i++) {
			
			int kalan1 = sayi1 % i;
			
			if(kalan1 == 0) {
				toplam1 = i + toplam1 ; 
				
			}
			
		}
		for(int j = 1; j< sayi1; j++) {
			
			int kalan2 = sayi2 % j;
			
			if(kalan2 == 0) {
				toplam2 = j + toplam2 ; 
				
			}
			
		}
		if(toplam1 == sayi2 && toplam2 == sayi1) {
			System.out.println(sayi1 + " ile " + sayi2 + " Arkadaş Sayılardır.");			
		}else {
			System.out.println(sayi1 + " ile " + sayi2 + " Arkadaş Sayı Değillerdir.");
		}

	}

}
