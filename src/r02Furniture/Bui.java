/**
 * 
 */
package r02Furniture;

/**
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

	public Bui(String buiCode , String buiName) {
		setBuiCode(buiCode);
		setBuiName(buiName);
	}
}
