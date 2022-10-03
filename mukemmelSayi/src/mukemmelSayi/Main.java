package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// kendinden başka pozitif bölenlerinin toplamı kendine eşit sayılara denir
		// 6 --> 1, 2 , 3
		int sayi = 28;
		int toplam = 0;

		for (int i = 1; i < sayi; i++) {

			int kalan = sayi % i;

			if (kalan == 0) {
				toplam = i + toplam;
			}
		}
		System.out.println("Toplam = " + toplam);
		
		if (toplam == sayi) {
			System.out.println(sayi + " Sayisi Mükemmel Sayıdır.");
		} else {
			System.out.println(sayi + " Sayisi Mükemmel Sayı değildir.");
		}

	}

}
