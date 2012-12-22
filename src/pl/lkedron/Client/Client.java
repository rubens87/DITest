package pl.lkedron.Client;

import pl.lkedron.dbutils.DbMysqlUtil;
import pl.lkedron.entity.User;
import pl.lkedron.util.UserAuthenticator;

public class Client {

	public static void main (String[] args){
		DbMysqlUtil dbase = new DbMysqlUtil();
		UserAuthenticator userAuth = new UserAuthenticator();
		
		
		userAuth.setDbase(dbase);
		User user = new User();
		user.setUsername("Admin");
		user.setPassword("kall");
		System.out.println(userAuth.authenticate(user.getUsername(), user.getPassword()));
		
		
	}
	
}
