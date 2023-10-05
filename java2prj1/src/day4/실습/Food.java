package day4.실습;

public class Food {

	String name;
	String Country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", Country=" + Country + "]";
	}
	public Food(String name, String country) {
		super();
		this.name = name;
		Country = country;
	}
	
	
	public Food() {
		// TODO Auto-generated constructor stub
	}
	
}
