package java2prj2.toy;

public class FoodTest {
	public static void main(String[] args) {
		
		FoodBox<korean> list = new FoodBox<korean>();
		
		list.add(new korean("비빔밥"));
		list.add(new korean("콩국수"));
		
		for(int i=0; i<list.size(); i++) {
			
			System.out.println(list.get(i));
		}
		
		//FoodBox<japan> list = new FoodBox<japan>();
	
}
}
