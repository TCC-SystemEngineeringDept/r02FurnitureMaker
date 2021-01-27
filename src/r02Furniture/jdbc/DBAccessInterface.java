package r02Furniture.jdbc;

public interface DBAccessInterface {
	/**
	 * データベースを初期化し、サンプルデータを1件格納する
	 */
	public void init();

	/**
	 * このインスタンスをデータベースに格納する
	 */
	public void save();
}
