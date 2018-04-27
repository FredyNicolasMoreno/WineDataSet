package models;

public class Wine {

	private String country;
	private String grape;
	private int rating;
	private String oregon;
	private int price;
	private int totalSale;
	
	public Wine(String country, String grape, int rating, String oregon, int price, int totaaSale) {
		this.country = country;
		this.grape = grape;
		this.rating = rating;
		this.oregon = oregon;
		this.price = price;
		this.totalSale = totaaSale;
	}

	public String getCountry() {
		return country;
	}

	public String getGrape() {
		return grape;
	}

	public int getRating() {
		return rating;
	}

	public String getOregon() {
		return oregon;
	}

	public int getPrice() {
		return price;
	}

	public int getTotaaSale() {
		return totalSale;
	}
	
	
	
}
