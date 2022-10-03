package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if(sayi == aranacak) {
				varMi = true ; 
				break;
			}
			
		}
		if(varMi) {
			System.out.println("Sayı bulundu");
		}else {
			System.out.println("Sayı bulunamadı");
		}
		
		
//		for(int i = 0; i <= sayilar.length; i++){
//			
//			if(aranacak == i) {
//				System.out.println("Sayı bulundu");
//			}else {
//				System.out.println("Sayı bulunamadı");
//			}
//			break;
//			
//		}

	}

}
