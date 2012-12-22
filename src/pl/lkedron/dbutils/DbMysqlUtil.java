package pl.lkedron.dbutils;

import pl.lkedron.entity.User;

public class DbMysqlUtil implements IdbUtil {
	
	private String dbname;
	private String dbuser;
	private String dbpass;
	private String connection;
	
	/* (non-Javadoc)
	 * @see pl.lkedron.dbutils.IDbUtil#extractSetup()
	 */
	
	/* (non-Javadoc)
	 * @see pl.lkedron.dbutils.IdbUtil#extractSetup()
	 */
	@Override
	public void extractSetup() {
		System.out.println("readDBFile");
		dbname = "MysqlDbase";
		dbuser = "MysqlUser";
		dbpass = "MysqlPass";
	}
	
	/* (non-Javadoc)
	 * @see pl.lkedron.dbutils.IDbUtil#setConnection()
	 */
	
	/* (non-Javadoc)
	 * @see pl.lkedron.dbutils.IdbUtil#setConnection()
	 */
	@Override
	public boolean setConnection(){
		return true;
	}
	
	/* (non-Javadoc)
	 * @see pl.lkedron.dbutils.IDbUtil#addData(java.lang.String)
	 */
	
	/* (non-Javadoc)
	 * @see pl.lkedron.dbutils.IdbUtil#addData(java.lang.String)
	 */
	@Override
	public boolean addData(String data) {
		try {
			System.out.println("Saving data "+ data);
			return true;
		} catch (Exception ex){
			return false;
		}
	}
	
	/* (non-Javadoc)
	 * @see pl.lkedron.dbutils.IDbUtil#removeData(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see pl.lkedron.dbutils.IdbUtil#removeData(java.lang.String)
	 */
	@Override
	public boolean removeData (String data) {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see pl.lkedron.dbutils.IDbUtil#updateData(java.lang.String)
	 */

	/* (non-Javadoc)
	 * @see pl.lkedron.dbutils.IdbUtil#updateData(java.lang.String)
	 */
	@Override
	public boolean updateData (String data) {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see pl.lkedron.dbutils.IdbUtil#saveUser(pl.lkedron.entity.User)
	 */
	@Override
	public boolean saveUser(User user) {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see pl.lkedron.dbutils.IdbUtil#getUser(java.lang.Integer)
	 */
	@Override
	public User getUser(Integer arg) {
		User user2 = new User();
		user2.setUsername("Admin");
		user2.setPassword("kall");
		user2.setId(1);
		user2.setAuthLevel(1);
		return user2;
	}
}
