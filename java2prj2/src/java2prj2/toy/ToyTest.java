package java2prj2.toy;





public class ToyTest {
	public static void main(String[] args) {
		
		ToyBox<Toy> list = new ToyBox<Toy>();
		
		list.add(new Toy("복실이"));
		list.add(new Toy("다라밍"));
		list.add(new Toy("탬아리"));
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
