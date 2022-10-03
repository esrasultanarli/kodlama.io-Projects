package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'F';

		switch (grade) {
		case 'A':
			System.out.println("Geçtiniz !");
			break;
		case 'B':
		case 'C':
			System.out.println("Geçtiniz !");
			break;
		case 'D':
			System.out.println("Geçtiniz !");
			break;
		case 'F':
			System.out.println("Kaldınız !");
			break;
		default:
			System.out.println("Geçersiz not girdiniz !");

		}
		

	}

}
