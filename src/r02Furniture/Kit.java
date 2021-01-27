/**
 * 
 */
package r02Furniture;

/**
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

}
