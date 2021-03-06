package r02Furniture.jdbc;

import java.util.List;

/**
 * シリーズを扱うクラス
 * 
 * @author t.yoshizawa
 *
 */
public class Series implements DBAccessInterface {
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

	/**
	 * このシリーズのインスタンスに対応する品目を返す
	 * 
	 * @return 品目のリスト
	 */
	public List<Hinmoku> getHinmokuList() {
		return Hinmoku.getListBySeriesCode(getSeriesCode());
	}

	/**
	 * このシリーズのインスタンスに対応するキット製品を返す
	 * 
	 * @return キット製品のリスト
	 */
	public List<Kit> getKitList() {
		return Kit.getListBySeriesCode(getSeriesCode());
	}

	/**
	 * データベースを初期化し、サンプルデータを1件格納する
	 */
	public void init() {
		// TODO テーブルを削除する処理を追加する
		// TODO テーブルを作成する処理を追加する

		// サンプルを追加
		Series s = new Series("BU", "寝室向けアーバンタイプ");
		s.save();

	}

	/**
	 * このインスタンスをデータベースに格納する
	 */
	public void save() {
		// TODO インスタンスのデータを保存する処理を追加する
	}
}
