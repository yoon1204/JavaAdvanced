package java2prj1.lamda;

import java.util.function.Supplier;

/*
 * interface Supplier<T>{
 *  	T get();
 *  }
 *  
 *  
 */
public class SupplierTest {
	
	public static void main(String[] args) {
		//int -> Integer
		//double-> Double
		
		
		Supplier<Integer> s1 = () -> (int) (Math.random()*5);
		int result = s1.get();
		System.out.println(result);
		
		Supplier<String> s2 = () -> {
			int randomNumber= (int) (Math.random()*2)+1;
			if(randomNumber ==0) {
				return "좋다";
			}else {
				return "더 좋다";
			}	
		};
		
		String result2=s2.get();
		System.out.println(result2);
		
		Supplier<Integer> s3 = new Supplier<>() {
			
			public Integer get() {
				return (int) (Math.random()*5);
			}};
			
		int result3 = s3.get();
		System.out.println(result3);
		}
	


		
	}


