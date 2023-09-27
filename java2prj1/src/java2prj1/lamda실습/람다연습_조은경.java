package java2prj1.lamda실습;

public class 람다연습_조은경 {

	
	@FunctionalInterface
	interface AddInterface {
		int add(int a, int b);
	}
	
	
	public static void main(String[] args) {
		
		// 1. 클래스 작성
		class AddInterfaceImp implements AddInterface{
			@Override
			public int add(int a, int b) {
				if(a > b) {
					int tmp = 0;
					tmp = a;
					a = b;
					b= tmp;
				}
				int sum =0;
				for(int i = a; i<=b; i++) {
					sum += i;
				}
				return sum;
			}
		}
		
		AddInterfaceImp f1 =  new AddInterfaceImp();
		int result1 = f1.add(1, 10);
		System.out.println("result1 = " + result1);
		
		
		// 2. 익명클래스
		AddInterface f2 = new AddInterface() {
			@Override
			public int add(int a, int b) {
				if(a > b) {
					int tmp = 0;
					tmp = a;
					a = b;
					b= tmp;
				}

				int sum =0;
				for(int i = a; i<=b; i++) {
					sum += i;
				}
				return sum;
			}
		};
		int result2 = f2.add(1, 10);
		System.out.println("result2 = " + result2);
		
		// 3. 람다식
		AddInterface f3 = (a, b) -> {
			if(a > b) {
				int tmp = 0;
				tmp = a;
				a = b;
				b= tmp;
			}

			int sum =0;
			for(int i = a ; i <= b; i++) {
				sum += i;
			}
			return sum;
		};
		int result3 = f3.add(10, 1);
		System.out.println("result3 = " + result3);
		
	}
}
