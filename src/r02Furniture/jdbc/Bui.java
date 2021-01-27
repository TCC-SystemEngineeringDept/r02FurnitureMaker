/**
 * 
 */
package r02Furniture.jdbc;

import java.util.List;

/**
 * 部位のデータを扱うクラス
 * 
 * @author t.yoshizawa
 *
 */
public class Bui {
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
}
