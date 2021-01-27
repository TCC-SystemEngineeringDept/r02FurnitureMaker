/**
 * 
 */
package r02Furniture.jdbc;

/**
 * 顧客を扱うクラス
 * 
 * @author t.yoshizawa
 *
 */
public class Customer implements DBAccessInterface{
	private String tel;
	private String customerName;
	private String deliveryAddress;

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	///////////////////////////////////////////////////////////

	public Customer(String tel, String customerName, String deliveryAddress) {
		setTel(tel);
		setCustomerName(customerName);
		setDeliveryAddress(deliveryAddress);
	}

	/**
	 * データベースを初期化し、サンプルデータを1件格納する
	 */
	public void init() {
		// TODO テーブルを削除する処理を追加する
		// TODO テーブルを作成する処理を追加する

		// サンプルを追加

	}

	/**
	 * このインスタンスをデータベースに格納する
	 */
	public void save() {
		// TODO インスタンスのデータを保存する処理を追加する
	}
}
