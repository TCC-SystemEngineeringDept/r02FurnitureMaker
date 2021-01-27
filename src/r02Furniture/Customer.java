/**
 * 
 */
package r02Furniture;

/**
 * 顧客を扱うクラス
 * 
 * @author t.yoshizawa
 *
 */
public class Customer {
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
}
