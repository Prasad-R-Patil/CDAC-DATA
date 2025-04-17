package object_class_demos;

import java.util.Objects;

public class MobilePhone {
	private String brandName;
	private String model;
	private int price;
	public MobilePhone() {
		// TODO Auto-generated constructor stub
	}
	public MobilePhone(String brandName, String model, int price) {
		this.brandName = brandName;
		this.model = model;
		this.price = price;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public void finalize() {
		System.out.println("Object is getting destroyed...");
	}
	@Override
	public String toString() {
		return "MobilePhone [brandName=" + brandName + ", model=" + model + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(brandName, model, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MobilePhone other = (MobilePhone) obj;
		return Objects.equals(brandName, other.brandName) && Objects.equals(model, other.model) && price == other.price;
	}

}
