package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 2;
		int remainder = number % 2;
		//System.out.println(remainder);
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("Sayı Asal Değildir.");
			
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz Sayi");
			
		}
		
		for(int i = 2; i<number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime == true) {
			System.out.println("Sayı Asaldır.");
		}else {
			System.out.println("Sayı Asal değildir.");
		}
		
		
		
		
		/*
		 * for(int i = 2; i<number; i++) { int remainder = number % i;
		 * 
		 * if(remainder == 0) { System.out.println(number + "Sayısı Asal Değildir."); }
		 * else{ System.out.println(number + "Sayısı Asaldır."); } break; }
		 */
		

	}

}
