package r02Furniture.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author t.yoshizawa
 *
 */
public interface DBAccessInterface {
	final String driverName = "oracle.jdbc.driver.OracleDriver";
	final String url = "jdbc:oracle:thin:@192.168.54.226:1521/orcl2";
	final String id = "FURNITURE";
	final String pass = "KAGUYA";
	
	/**
	 * このインスタンスをデータベースに格納する
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public void save() throws ClassNotFoundException, SQLException;
	
	/**
	 * データベースコネクションを生成する
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driverName);
		Connection connection=DriverManager.getConnection(url,id,pass);
		return connection;
	}
}
