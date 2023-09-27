package java2prj1.lamda실습;

@FunctionalInterface
interface multiInterface{
	int multi(int a, int b);
}
public class 람다연습_서예진 {

	public static void main(String[] args) {
		

// 		1. 
		class YejinInterfaceImp implements multiInterface{

			@Override
			public int multi(int a, int b) {
				
				return a*b;
			}
			
		}
		 
		YejinInterfaceImp m1 = new YejinInterfaceImp();
		int result = m1.multi(7, 2);
		System.out.println(result);
		
		
//		2.
		
		multiInterface m2 = new multiInterface() {

			@Override
			public int multi(int a, int b) {
				// TODO Auto-generated method stub
				return a*b;
			}};
			
			int result2 = m2.multi(4, 2);
			System.out.println(result2);
			
		
//		3.
		
		multiInterface m3 = (a,b)-> a*b;
		int result3 = m3.multi(5, 6);
		System.out.println(result3);
	
		 
		
	}

}