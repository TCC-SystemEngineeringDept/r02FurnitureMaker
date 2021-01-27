/**
 * 
 */
package r02Furniture;

/**
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
}
