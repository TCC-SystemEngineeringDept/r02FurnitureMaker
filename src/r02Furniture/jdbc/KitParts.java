/**
 * 
 */
package r02Furniture.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * キット製品構成パーツ(キット製品とパーツを参照)
 * 
 * @author t.yoshizawa
 *
 */
public class KitParts implements DBAccessInterface{
	private String partsCode;
	private String seihinCode;
	private int qty;

	public String getPartsCode() {
		return partsCode;
	}

	public void setPartsCode(String partsCode) {
		this.partsCode = partsCode;
	}

	public String getSeihinCode() {
		return seihinCode;
	}

	public void setSeihinCode(String seihinCode) {
		this.seihinCode = seihinCode;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	///////////////////////////////////////////////////////////

	public KitParts(String partsCode, String seihinCode, int qty) {
		setPartsCode(partsCode);
		setSeihinCode(seihinCode);
		setQty(qty);
	}

	public static List<KitParts> getListByPartsCode(String partsCode) {
		// TODO partsCodeが一致するKitPartsをListに格納して返す
		return null;
	}

	public static List<KitParts> getListBySeihinCode(String seihinCode) {
		// TODO seihinCodeが一致するKitPartsをListに格納して返す
		return null;
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
