package java2prj1.interfaceEx.ice;

public class Icecream {

	String name;
	
	public void 달다() {
		System.out.println("달다");
	}
	
	public void 차갑다() {
		System.out.println("차갑다");
	}
	
	public void 맛있다() {
		System.out.println("맛있다");
	}
	public Icecream() {
		// TODO Auto-generated constructor stub
	}
	public Icecream(String name) {
		this.name=name;
	}

	@Override
	public String toString() {
		return "icecream [name=" + name + "]";
	}
	
	
}
