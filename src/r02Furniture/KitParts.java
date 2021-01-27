/**
 * 
 */
package r02Furniture;

/**
 * @author t.yoshizawa
 *
 */
public class KitParts {
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

}
