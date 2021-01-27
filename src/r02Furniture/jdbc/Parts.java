/**
 * 
 */
package r02Furniture.jdbc;

import java.util.List;

/**
 * パーツを扱うクラス(品目を参照)（在庫と1対1対応）
 * 
 * @author t.yoshizawa
 *
 */
public class Parts {
	private String seihinCode;
	private String hinmokuCode;

	public String getSeihinCode() {
		return seihinCode;
	}

	public void setSeihinCode(String seihinCode) {
		this.seihinCode = seihinCode;
	}

	public String getHinmokuCode() {
		return hinmokuCode;
	}

	public void setHinmokuCode(String hinmokuCode) {
		this.hinmokuCode = hinmokuCode;
	}

	///////////////////////////////////////////////////////////

	public Parts(String seihinCode, String hinmokuCode) {
		setSeihinCode(seihinCode);
		setHinmokuCode(hinmokuCode);
	}

	/**
	 * このパーツのインスタンスに対応するキット製品構成パーツを返す
	 * 
	 * @return キット製品構成パーツのリスト
	 */
	public List<KitParts> getKitPartsList() {
		return KitParts.getListBySeihinCode(getSeihinCode());
	}

	public static List<Parts> getListByHinmokuCode(String hinmokuCode) {
		// TODO hinmokuCodeが一致するPartsをListに格納して返す
		return null;
	}

	public static List<Parts> getListBySeihinCode(String seihinCode) {
		// TODO seihinCodeが一致するPartsをListに格納して返す
		return null;
	}
}
