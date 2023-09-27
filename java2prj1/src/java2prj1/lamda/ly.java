package java2prj1.lamda;

@FunctionalInterface
interface MinusInterface {
	int minus(int a, int b);
}

public class ly{
	
	public static void main(String[] args) {
		
		// 1. 클래스 작성
		class MinusInterfaceImp implements MinusInterface{

			@Override
			public int minus(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
			
		}
		
		MinusInterfaceImp m1 = new MinusInterfaceImp();
		int result=m1.minus(5, 1);
		System.out.println("result="+result);
		
		// 2. 익명 클래스 작성
		MinusInterface m2 = new MinusInterface() {

			
			@Override
			public int minus(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}};
			
			int result2 = m2.minus(3, 7);
			System.out.println("result2="+result2);
			
		// 3. 람다식 작성 (한 개의 추상매서드만을 가지는 인터페이스 )
			// MinusInterface m3 = (매개변수) -> {코드 구현부};
		  MinusInterface m3 = (a, b) ->{
			int sum;
			sum=a-b;
			return sum;
		};
		
	 
		 
		MinusInterface m4 = (a, b) ->   a-b  ;
		
		int result3 = m3.minus(10, 6);
		System.out.println("result3="+result3);
		
		int result4 = m4.minus(10, 6);
		System.out.println("result4="+result4);
			
	}
	
}



