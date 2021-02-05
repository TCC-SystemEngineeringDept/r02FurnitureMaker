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
 * 品目を扱うクラス(シリーズと部位を参照)
 * 
 * @author t.yoshizawa
 * 
 */
public class Hinmoku implements DBAccessInterface {
	private String hinmokuCode;
	private String hinmokuName;
	private String seriesCode;
	private String buiCode;
	private int sizeW, sizeH, sizeD;

	public String getHinmokuCode() {
		return hinmokuCode;
	}

	public void setHinmokuCode(String hinmokuCode) {
		this.hinmokuCode = hinmokuCode;
	}

	public String getHinmokuName() {
		return hinmokuName;
	}

	public void setHinmokuName(String hinmokuName) {
		this.hinmokuName = hinmokuName;
	}

	public String getSeriesCode() {
		return seriesCode;
	}

	public void setSeriesCode(String seriesCode) {
		this.seriesCode = seriesCode;
	}

	public String getBuiCode() {
		return buiCode;
	}

	public void setBuiCode(String buiCode) {
		this.buiCode = buiCode;
	}

	public int getSizeW() {
		return sizeW;
	}

	public void setSizeW(int sizeW) {
		this.sizeW = sizeW;
	}

	public int getSizeH() {
		return sizeH;
	}

	public void setSizeH(int sizeH) {
		this.sizeH = sizeH;
	}

	public int getSizeD() {
		return sizeD;
	}

	public void setSizeD(int sizeD) {
		this.sizeD = sizeD;
	}

	///////////////////////////////////////////////////////////

	public Hinmoku(String hinmokuCode, String hinmokuName, String seriesCode, String buiCode, int sizeW, int sizeH,
			int sizeD) {
		setHinmokuCode(hinmokuCode);
		setHinmokuName(hinmokuName);
		setSeriesCode(seriesCode);
		setBuiCode(buiCode);
		setSizeW(sizeW);
		setSizeH(sizeH);
		setSizeD(sizeD);
	}

	/**
	 * この品目のインスタンスに対応するパーツを返す
	 * 
	 * @return パーツのリスト
	 */
	public List<Parts> getPartsList() {
		return Parts.getListByHinmokuCode(getHinmokuCode());
	}

	public static List<Hinmoku> getListByBuiCode(String buiCode) {
		// TODO buiCodeが一致するHinmokuをListに格納して返す
		return null;
	}

	public static List<Hinmoku> getListBySeriesCode(String seriesCode) {
		// TODO seriesCodeが一致するHinmokuをListに格納して返す
		return null;
	}

	/**
	 * データベースを初期化し、サンプルデータを1件格納する
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static void init() throws SQLException, ClassNotFoundException {
		// TODO テーブルを作成する処理を追加する
		Connection connection = DBAccessInterface.getConnection();
		PreparedStatement ps = connection.prepareStatement(
				"CREATE TABLE HINMOKU ( HINMOKU_CODE CHAR(4) PRIMARY KEY , HINMOKU_NAME VARCHAR(200) , "
						+ " SERIES_CODE CHAR(3),BUI_CODE CHAR(2) constraint HINMOKU_PK references BUI(BUI_CODE) ,SIZE_W number(5),SIZE_H number(5),SIZE_D number(5))");
		ps.executeUpdate();

		// サンプルを追加
		Hinmoku h = new Hinmoku("001", "アーバン調ボルトナットセット", "BU", "BN", 80, 80, 280);
		h.save();

	}

	public static void remove() throws ClassNotFoundException, SQLException {
		// テーブルを削除する処理を追加する
		Connection connection = DBAccessInterface.getConnection();
		PreparedStatement ps = connection.prepareStatement("DROP TABLE HINMOKU");
		ps.executeUpdate();
	}

	/**
	 * このインスタンスをデータベースに格納する
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public void save() throws ClassNotFoundException, SQLException {
		Connection connection = DBAccessInterface.getConnection();
		PreparedStatement ps = connection.prepareStatement(
				"INSERT INTO HINMOKU(HINMOKU_CODE  , HINMOKU_NAME  ,  SERIES_CODE ,BUI_CODE  ,SIZE_W ,SIZE_H ,SIZE_D) "+
		" values(?,?,?,?,?,?,?)");
		ps.setString(1, getHinmokuCode());
		ps.setString(2, getHinmokuName());
		ps.setString(3, getSeriesCode());
		ps.setString(4, getBuiCode());
		ps.setInt(5, getSizeW());
		ps.setInt(6, getSizeH());
		ps.setInt(7, getSizeD());

		ResultSet rs = ps.executeQuery();

	}
	
	public static List<Hinmoku> find() throws SQLException, ClassNotFoundException {
		Connection connection = DBAccessInterface.getConnection();
		PreparedStatement ps = connection.prepareStatement("SELECT HINMOKU_CODE  , HINMOKU_NAME  ,  SERIES_CODE ,BUI_CODE  ,SIZE_W ,SIZE_H ,SIZE_D  FROM HINMOKU ");
		ResultSet rs = ps.executeQuery();

		List<Hinmoku> list = getResultList(rs);

		return list;
	}

	public static List<Hinmoku> listByHinmokuCode(String requestHinmokuCode) throws SQLException, ClassNotFoundException {
		Connection connection = DBAccessInterface.getConnection();
		PreparedStatement ps = connection.prepareStatement("SELECT HINMOKU_CODE  , HINMOKU_NAME  ,  SERIES_CODE ,BUI_CODE  ,SIZE_W ,SIZE_H ,SIZE_D  FROM HINMOKU where HINMOKU_CODE=?");
		ps.setString(1, requestHinmokuCode);
		ResultSet rs = ps.executeQuery();

		List<Hinmoku> list = getResultList(rs);
		return list;
	}

	private static List<Hinmoku> getResultList(ResultSet rs) throws SQLException {
		List<Hinmoku> list = new ArrayList<Hinmoku>();

		while (rs.next() == true) {
			String hinmokuCode = rs.getString("HINMOKU_CODE");
			String hinmokuName = rs.getString("HINMOKU_NAME");
			String seriesCode = rs.getString("SERIES_CODE");
			String buiCode = rs.getString("BUI_CODE");
			int sizeW = rs.getInt("SIZE_W");
			int sizeH = rs.getInt("SIZE_H");
			int sizeD = rs.getInt("SIZE_D");
			Hinmoku hinmoku = new Hinmoku(hinmokuCode,hinmokuName,seriesCode,buiCode,sizeW,sizeH,sizeD);
			list.add(hinmoku);
		}
		return list;
	}
	

}
