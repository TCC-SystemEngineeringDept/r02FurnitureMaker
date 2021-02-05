/**
 * 
 */
package r02Furniture.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * カラーを扱うクラス
 * 
 * @author t.yoshizawa
 *
 */
public class Color implements DBAccessInterface {
	private String colorCode;
	private String colorName;

	public String getColorCode() {
		return colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	///////////////////////////////////////////////////////////

	public Color(String colorCode, String colorName) {
		setColorCode(colorCode);
		setColorName(colorName);
	}

	/**
	 * このカラーのインスタンスに対応する販売製品を返す
	 * 
	 * @return 販売製品のリスト
	 */
	public List<Seihin> getSeihinList() {
		return Seihin.getListByColorCode(getColorCode());
	}

	/**
	 * データベースを初期化し、サンプルデータを1件格納する
	 */
	public void init() {
		// TODO テーブルを作成する処理を追加する

		// サンプルを追加
		Color c = new Color("OAK", "オーク");
		c.save();

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
