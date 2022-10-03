package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman Sayisi : "+ mesaj.length());
		
		System.out.println("5. Eleman : "+ mesaj.charAt(4));
		
		System.out.println(mesaj.concat(" Yaşasın!"));
		
		System.out.println(mesaj.startsWith("B")); //B ile başlıyorsa true, değilse false

		System.out.println(mesaj.endsWith(".")); //. ile başlıyorsa true, değilse false
		
	    char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf('a')); //metindeki a kaçıncı indexte
		
		System.out.println(mesaj.lastIndexOf('e')); // metni sondan tarar, verilen karakter kaçıncı indexte  
		
		
		System.out.println("--------------------------------------");
		
		System.out.println(mesaj.replace('a', 'A')); // metindeki a yerlerine A yazdırdım
		
	    String yeniMesaj = mesaj.replace('a', 'A');
	    System.out.println(yeniMesaj);
	    
	    // bir metnin içinden parça almak
	    System.out.println(mesaj.substring(2)); //mesajın 2. indeksinden itibaren parçala
	    System.out.println(mesaj.substring(2,5)); //2.den 5. indekse kadar olan kısmı kes
	
	    for(String kelime : mesaj.split(" ")) { // kelimeleri boşluğa göre ayır
	    	System.out.println(kelime);
	    	
	    }
	    
	    System.out.println(mesaj.toLowerCase());
	    System.out.println(mesaj.toUpperCase());
	    
	    System.out.println(mesaj.trim()); //datadaki fazladan boşlukları giderir.
	
	
	}

}
