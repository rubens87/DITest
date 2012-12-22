package pl.lkedron.dbutils;

import pl.lkedron.entity.User;

public interface IdbUtil {

	public abstract void extractSetup();

	public abstract boolean setConnection();

	public abstract boolean addData(String data);

	/* (non-Javadoc)
	 * @see pl.lkedron.dbutils.IDbUtil#removeData(java.lang.String)
	 */
	public abstract boolean removeData(String data);

	public abstract boolean updateData(String data);

	public abstract boolean saveUser(User user);

	public abstract User getUser(Integer arg);

}