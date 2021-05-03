
public class Campaign {
	
	private String name;
	private double discount;
	private double price;
	private double PriceDisconut;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPriceDisconut() {
		return PriceDisconut;
	}
	public Campaign(String name, double discount, double price, double priceDisconut) {
		super();
		this.name = name;
		this.discount = discount;
		this.price = price;
		PriceDisconut = priceDisconut;
	}

}
