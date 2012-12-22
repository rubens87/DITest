package pl.lkedron.util;

import pl.lkedron.dbutils.IdbUtil;
import pl.lkedron.entity.User;

public class UserAuthenticator {
	private IdbUtil dbase;
	private User user;
	
	public boolean authenticate(String username, String password) {
		user = dbase.getUser(1);
		boolean result = false;
		if (user.getUsername() == username && user.getPassword() == password)
		{
			result = true;
		}
		return result;
	}

	public IdbUtil getDbase() {
		return dbase;
	}

	public void setDbase(IdbUtil dbase) {
		this.dbase = dbase;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}	
	
}
