/**
 * 
 */
package r02Furniture;

import java.util.List;

/**
 * @author t.yoshizawa
 *
 */
public class Color {
	private String colorCode;
	private String colorName;
	
	public String getColorCode() {
		return colorCode;
	}
	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}
	public String getColorName() {
		return colorName;
	}
	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
	
	///////////////////////////////////////////////////////////
	
	public Color(String colorCode , String colorName) {
		setColorCode(colorCode);
		setColorName(colorName);
	}
	
	public List<Seihin> getSeihinList(){
		return Seihin.getListByColorCode(getColorCode());
	}
	
}
