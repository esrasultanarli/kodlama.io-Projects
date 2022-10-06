package classesWithAttributes;

public class Product {
	//her classın kendi adı ile constructor u vardır.
	public Product() {
		System.out.println("yapıcı blok");
	}
	
	
	

	// bir class özellik barındırır
	// attribute || field
	// classlar ilgili operasyonları ilgili özellikleri tutarlar.
	// bir classın içinde başka bir classı tutabiliriz.
	// Bir class hem attribute tutup, hem de operasyonları içermemeli

	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;

	public String get_kod() {
		return this._name.substring(0,1) + _id;
	}

	public String get_renk() {
		return _renk;
	}

	public void set_renk(String _renk) {
		this._renk = _renk;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	//getter
	public int getId() {
		return _id;
	}

	//setter
	public void setId(int id) { // set edilen değer parametre olarak verilmeli.
		// this.id = id;
		// this --> productun id si. İçinde bulunulan class id'si.
		_id = id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}
}
