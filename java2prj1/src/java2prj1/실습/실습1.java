package java2prj1.실습;

public class 실습1 {
	
	public static void main(String[] args) {
	
		Runnable b = () -> System.out.println("40대 전에 집 한 채 장만");
		b.run();
		
		Runnable b2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("50대 전에 5군데 나라 여행 가기");
				
			}};
			
			b2.run();
			
		class A implements Runnable{
			public void run() {
				System.out.println("2024년 안에 유명한 전국 맛집 10군데 가기");
			}		
		}
		
		A a = new A();
		a.run();
		
		Runnable b3 = () -> {
			for(int i=1; i<=5; i++) {
				System.out.println("★★★★★로또 1등 당첨★★★★★");
			}
		};
		
		b3.run();
		 
	}
	
}
