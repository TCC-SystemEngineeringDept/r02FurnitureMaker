/**
 * 
 */
package r02Furniture.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * 販売製品のデータを扱うクラス(カラーを参照)
 * 
 * @author t.yoshizawa
 *
 */
public class Seihin implements DBAccessInterface{
	private String seihinCode;
	private String seihinType;
	private String colorCode;
	private String seihinName;
	private int price;

	public String getSeihinCode() {
		return seihinCode;
	}

	public void setSeihinCode(String seihinCode) {
		this.seihinCode = seihinCode;
	}

	public String getSeihinType() {
		return seihinType;
	}

	public void setSeihinType(String seihinType) {
		this.seihinType = seihinType;
	}

	public String getColorCode() {
		return colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	public String getSeihinName() {
		return seihinName;
	}

	public void setSeihinName(String seihinName) {
		this.seihinName = seihinName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	///////////////////////////////////////////////////////////

	public Seihin(String seihinCode, String seihinType, String colorCode, String seihinName, int price) {
		setSeihinCode(seihinCode);
		setSeihinType(seihinType);
		setColorCode(colorCode);
		setSeihinName(seihinName);
		setPrice(price);
	}

	public static List<Seihin> getListByColorCode(String colorCode) {
		// TODO colorCodeが一致するSeihinをListに格納して返す
		return null;
	}

	/**
	 * この販売製品のインスタンスに対応するパーツを返す
	 * 
	 * @return パーツのリスト
	 */
	public List<Parts> getPartsList() {
		return Parts.getListBySeihinCode(getSeihinCode());
	}

	/**
	 * この販売製品のインスタンスに対応するキット製品を返す
	 * 
	 * @return キット製品のリスト
	 */
	public List<Kit> getKitList() {
		return Kit.getListBySeihinCode(getSeihinCode());
	}

	/**
	 * データベースを初期化し、サンプルデータを1件格納する
	 */
	public static void init() throws ClassNotFoundException, SQLException {
		// TODO テーブルを作成する処理を追加する

		// サンプルを追加

	}
	public static void remove() throws ClassNotFoundException, SQLException {
		// TODO テーブルを削除する処理を追加する
		Connection connection = DBAccessInterface.getConnection();
		PreparedStatement ps = connection.prepareStatement("DROP TABLE SERIES");
		ps.executeUpdate();
	}

	/**
	 * このインスタンスをデータベースに格納する
	 */
	public void save() {
		// TODO インスタンスのデータを保存する処理を追加する
	}
}
