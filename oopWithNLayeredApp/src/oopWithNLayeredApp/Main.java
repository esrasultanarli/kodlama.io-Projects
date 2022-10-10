package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		//Data Access --> Bir kod bloğu veriyle uğraşır
		//Business --> İş geliştirme
		//UI --> Kullanıcı Arayüzü
		//Böl-Parçala-Yönet
		//Kodların sürdürülebilir olması
		
		//Veriye Erişim Yöntemleri:
		//JDBC
		//Hibernate-ORM
		//JPA
		
		Product product1 = new Product(1, "Iphone Xr", 10000);
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		//Arayüz iş birimiyle iletişim kurar, veritabanına gidemez.
		ProductManager productManager = 
				new ProductManager(new HibernateProductDao(),loggers); //contructer
		productManager.add(product1);

	}

}
