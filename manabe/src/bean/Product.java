package bean;

public class Product implements java.io.Serializable {
	private int pro_id;
	private String pro_name;
	private int pro_price;

	public int getId() {
		return pro_id;
	}
	public String getName() {
		return pro_name;
	}
	public int getPrice() {
		return pro_price;
	}

	public void setId(int pro_id) {
		this.pro_id=pro_id;
	}
	public void setName(String pro_name) {
		this.pro_name=pro_name;
	}
	public void setPrice(int pro_price) {
		this.pro_price=pro_price;
	}
}
