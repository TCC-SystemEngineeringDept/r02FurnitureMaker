/**
 * 
 */
package r02Furniture;

/**
 * @author t.yoshizawa
 *
 */
public class Seihin {
	private String seihinCode;
	private String seihinType;
	private String colorCode;
	private String seihinName;
	private int price;

	public String getSeihinCode() {
		return seihinCode;
	}

	public void setSeihinCode(String seihinCode) {
		this.seihinCode = seihinCode;
	}

	public String getSeihinType() {
		return seihinType;
	}

	public void setSeihinType(String seihinType) {
		this.seihinType = seihinType;
	}

	public String getColorCode() {
		return colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	public String getSeihinName() {
		return seihinName;
	}

	public void setSeihinName(String seihinName) {
		this.seihinName = seihinName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	///////////////////////////////////////////////////////////

	public Seihin(String seihinCode, String seihinType, String colorCode, String seihinName, int price) {
		setSeihinCode(seihinCode);
		setSeihinType(seihinType);
		setColorCode(colorCode);
		setSeihinName(seihinName);
		setPrice(price);
	}
	

}
