/**
 * 
 */
package r02Furniture.jdbc;

import java.util.List;

/**
 * キット製品を扱うクラス（シリーズを参照）
 * 
 * @author t.yoshizawa
 *
 */
public class Kit {
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

}
