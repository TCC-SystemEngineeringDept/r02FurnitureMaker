/**
 * 
 */
package r02Furniture.jdbc;

/**
 * パーツの在庫を扱うクラス（パーツと1対1対応）
 * 
 * @author t.yoshizawa
 *
 */
public class PartsZaiko implements DBAccessInterface{
	private String seihinCode;
	private int kijyunQty, realQty, usedQty, availableQty;

	public String getSeihinCode() {
		return seihinCode;
	}

	public void setSeihinCode(String seihinCode) {
		this.seihinCode = seihinCode;
	}

	public int getKijyunQty() {
		return kijyunQty;
	}

	public void setKijyunQty(int kijyunQty) {
		this.kijyunQty = kijyunQty;
	}

	public int getRealQty() {
		return realQty;
	}

	public void setRealQty(int realQty) {
		this.realQty = realQty;
	}

	public int getUsedQty() {
		return usedQty;
	}

	public void setUsedQty(int usedQty) {
		this.usedQty = usedQty;
	}

	public int getAvailableQty() {
		return availableQty;
	}

	public void setAvailableQty(int availableQty) {
		this.availableQty = availableQty;
	}

	///////////////////////////////////////////////////////////

	public PartsZaiko(String seihinCode, int kijyunQty, int realQty, int usedQty, int availableQty) {
		setSeihinCode(seihinCode);
		setKijyunQty(kijyunQty);
		setRealQty(realQty);
		setUsedQty(usedQty);
		setAvailableQty(availableQty);
	}

	/**
	 * データベースを初期化し、サンプルデータを1件格納する
	 */
	public void init() {
		// TODO テーブルを削除する処理を追加する
		// TODO テーブルを作成する処理を追加する

		// サンプルを追加

	}

	/**
	 * このインスタンスをデータベースに格納する
	 */
	public void save() {
		// TODO インスタンスのデータを保存する処理を追加する
	}
}
