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
public class PartsZaiko {
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
}
