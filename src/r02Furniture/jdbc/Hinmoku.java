/**
 * 
 */
package r02Furniture.jdbc;

import java.util.List;

/**
 * 品目を扱うクラス(シリーズと部位を参照)
 * 
 * @author t.yoshizawa
 * 
 */
public class Hinmoku {
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

}
