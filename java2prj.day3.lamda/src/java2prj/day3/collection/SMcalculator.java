package java2prj.day3.collection;

public class SMcalculator implements CalculatorI{

	@Override
	public int add(int a, int b) {
		System.out.println("LG");
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		System.out.println("LG");
		return a-b;
	}

}
