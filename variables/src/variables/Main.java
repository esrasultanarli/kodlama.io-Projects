package variables;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Öğrenci Sayisi = 10");
		System.out.println("Öğrenci Sayisi = 10");
		System.out.println("Öğrenci Sayisi = 10");
		System.out.println("Öğrenci Sayisi = 10");
		
		/*bu ifadeyi böyle tanımlamak yerine değişkenler kullanarak tanımlamak, bellekten tasarruf sağlar.
		  tekrar tekrar kullanımlarda hızlı, temiz kod yazmamızı sağlar.*/
		
		 String mesaj = "Ogrenci Sayisi = ";
		 int ogrenciSayi = 10 ;
		 
		 System.out.println(mesaj+ogrenciSayi);

	}

}
