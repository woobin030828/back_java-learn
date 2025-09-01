package objectTask;

import java.util.Objects;

public class Fruit {
	private String name, mou;
	private int price, stock;
	
	public Fruit() {;}
	public Fruit(String name, String mou, int price, int stock) {
		this.name = name;
		this.mou = mou;
		this.price = price;
		this.stock = stock;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(mou, name, price, stock);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(mou, other.mou) && Objects.equals(name, other.name) && price == other.price
				&& stock == other.stock;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", mou=" + mou + ", price=" + price + ", stock=" + stock + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMou() {
		return mou;
	}
	public void setMou(String mou) {
		this.mou = mou;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
