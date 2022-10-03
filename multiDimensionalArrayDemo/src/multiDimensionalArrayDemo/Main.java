package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		
		sehirler [0][0] = "Adana";
		sehirler [0][1] = "Antalya";
		sehirler [0][2] = "Hatay";
		sehirler [1][0] = "İstanbul";
		sehirler [1][1] = "Bursa";
		sehirler [1][2] = "Bilecik";
		sehirler [2][0] = "Kayseri";
		sehirler [2][1] = "Ankara";
		sehirler [2][2] = "Konya";
		
		for(int i=0; i<3; i++) {
			
			if(i==0) {
				System.out.println("-----Akdeniz Bölgesi-----\n");
			}
			else if(i==1){
				System.out.println("-----Marmara Bölgesi-----\n");
			}
			else {
				System.out.println("-----İç Anadolu Bölgesi-----\n");
			}
			for(int j=0; j<3; j++) {
				System.out.println(sehirler[i][j]);
				
			}
		}

	}

}
