package r02Furniture;

/**
 * シリーズを扱うクラス
 * 
 * @author t.yoshizawa
 *
 */
public class Series {
	private String seriesCode;
	private String seriesName;

	public String getSeriesCode() {
		return seriesCode;
	}

	public void setSeriesCode(String seriesCode) {
		this.seriesCode = seriesCode;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	///////////////////////////////////////////////////////////

	public Series(String seriesCode, String seriesName) {
		setSeriesCode(seriesCode);
		setSeriesName(seriesName);
	}
}
