package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product; //bir paketten başka paketi kullanıyorsak onu import etmemiz gerekir.

public class JdbcProductDao implements ProductDao  {
	// veritabanına erişim işlemleri burada olacak.SQL
	
	public void add(Product product) {
		System.out.println("JDBC ile veritabanına eklendi.");
	}
}
