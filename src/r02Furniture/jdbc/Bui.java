/**
 * 
 */
package r02Furniture.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 部位のデータを扱うクラス
 * 
 * @author t.yoshizawa
 *
 */
public class Bui implements DBAccessInterface {
	private String buiCode;
	private String buiName;

	public String getBuiCode() {
		return buiCode;
	}

	public void setBuiCode(String buiCode) {
		this.buiCode = buiCode;
	}

	public String getBuiName() {
		return buiName;
	}

	public void setBuiName(String buiName) {
		this.buiName = buiName;
	}

	///////////////////////////////////////////////////////////

	public Bui(String buiCode, String buiName) {
		setBuiCode(buiCode);
		setBuiName(buiName);
	}

	/**
	 * この部位のインスタンスに対応する品目を返す
	 * 
	 * @return 品目のリスト
	 */
	public List<Hinmoku> getHinmokuList() {
		return Hinmoku.getListByBuiCode(getBuiCode());
	}

	/**
	 * データベースを初期化し、サンプルデータを1件格納する
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static void init() throws ClassNotFoundException, SQLException {
		// テーブルを作成する処理を追加する
		Connection connection = DBAccessInterface.getConnection();
		PreparedStatement ps = connection.prepareStatement(
				"CREATE TABLE BUI ( BUI_CODE CHAR(2) PRIMARY KEY , BUI_NAME VARCHAR(200) )");
		ps.executeUpdate();

		// サンプルを追加
		Bui b = new Bui("BN", "接続ボルトナット");
		b.save();
	}

	public static void remove() throws ClassNotFoundException, SQLException {
		// テーブルを削除する処理を追加する
		Connection connection = DBAccessInterface.getConnection();
		PreparedStatement ps = connection.prepareStatement("DROP TABLE BUI");
		ps.executeUpdate();
	}

	/**
	 * このインスタンスをデータベースに格納する
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public void save() throws ClassNotFoundException, SQLException {
		// インスタンスのデータを保存する処理を追加する
		Connection connection = DBAccessInterface.getConnection();
		PreparedStatement ps = connection.prepareStatement("INSERT INTO BUI (BUI_CODE,BUI_NAME) VALUES (?,?)");
		ps.setString(1, getBuiCode());
		ps.setString(2, getBuiName());
		ps.executeUpdate();
	}

	public static List<Bui> list() throws SQLException, ClassNotFoundException {
		Connection connection = DBAccessInterface.getConnection();
		PreparedStatement ps = connection.prepareStatement("SELECT BUI_CODE,BUI_NAME FROM BUI ");
		ResultSet rs = ps.executeQuery();

		List<Bui> list = new ArrayList<Bui>();

		while (rs.next() == true) {
			String buiCode = rs.getString("BUI_CODE");
			String buiName = rs.getString("BUI_NAME");
			Bui bui = new Bui(buiCode, buiName);
			list.add(bui);
		}
		return list;

	}

}
