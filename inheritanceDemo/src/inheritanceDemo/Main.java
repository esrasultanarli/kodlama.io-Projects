package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		//Polimorfizm
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());

	}

}
