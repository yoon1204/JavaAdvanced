package java2prj1.실습;

import java.util.function.Consumer;

public class 실습2 {

	public static void main(String[] args) {
		
		Consumer<String> r = str -> System.out.println("\r\n"+str);
		r.accept("열라면 5개 3580원\r\n");
				
		
		Consumer<String> r2 = new Consumer<>() {
			
			public void accept(String t) {
				System.out.println(t+"\r\n");
						
						
			}};
			
		r2.accept("\r\n");
		
		class B implements Consumer<String>{

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t+"");
			}	
		}
		 B b = new B();
		 b.accept("\r\n");
		 
		 
	}
}
