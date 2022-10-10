package oopWithNLayeredApp.business;

import java.util.Iterator;
import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers; 
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}


	public void add(Product product) throws Exception { //response request pattern.Spring
		//iş kuralları yazılacak
		
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10'dan Küçük Olamaz");
			//hata fırlatılırsa uygulama durur.
		}
		
		//İnterface onu implemente eden sınıfın referansını tutabilir.
	    //ProductDao productDao = new JdbcProductDao();
		productDao.add(product);
		
		//Bir katman başka bir katmanın, classını kullanıyorken sadece interfacesinden erişim kurmalıdır.
	
		for (Logger logger : loggers) { // [db, file, mail]
			logger.log(product.getName());
		}
	
	
	}
}
