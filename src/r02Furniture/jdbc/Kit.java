/**
 * 
 */
package r02Furniture.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * キット製品を扱うクラス（シリーズを参照）
 * 
 * @author t.yoshizawa
 *
 */
public class Kit implements DBAccessInterface{
	private String seihinCode;
	private String seriesCode;
	private int sizeW, sizeH, sizeD;

	public String getSeihinCode() {
		return seihinCode;
	}

	public void setSeihinCode(String seihinCode) {
		this.seihinCode = seihinCode;
	}

	public String getSeriesCode() {
		return seriesCode;
	}

	public void setSeriesCode(String seriesCode) {
		this.seriesCode = seriesCode;
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

	public Kit(String seihinCode, String seriesCode, int sizeW, int sizeH, int sizeD) {
		setSeihinCode(seihinCode);
		setSeriesCode(seriesCode);
		setSizeW(sizeW);
		setSizeH(sizeH);
		setSizeD(sizeD);
	}

	/**
	 * このキット製品のインスタンスに対応するキット製品構成パーツを返す
	 * 
	 * @return キット製品構成パーツのリスト
	 */
	public List<KitParts> getKitPartsList() {
		return KitParts.getListBySeihinCode(getSeihinCode());
	}

	public static List<Kit> getListBySeriesCode(String seriesCode) {
		// TODO seriesCodeが一致するKitをListに格納して返す
		return null;
	}

	public static List<Kit> getListBySeihinCode(String seihinCode) {
		// TODO seihinCodeが一致するKitをListに格納して返す
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
