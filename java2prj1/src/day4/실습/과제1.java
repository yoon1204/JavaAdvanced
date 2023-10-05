package day4.실습;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class 과제1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		
		Food food = new Food("불고기","한국"); 
		System.out.println(food.toString());
		System.out.println(food);
		
		Food food3 = new Food("햄버거","미국"); 
		
		Class a =Class.forName("day4.실습.Food");
		Food b  = (Food)a.newInstance();
		System.out.println( b);
		
		
		Constructor con= a.getDeclaredConstructor(String.class, String.class);
		Food  food2 = (Food)con.newInstance("피자","로마");
		
		System.out.println( food2);
		
		
		Method method  =a.getDeclaredMethod("getName");
		String name  =(String)method.invoke(food);		
		System.out.println( name);
		
		Method method2 = a.getDeclaredMethod("getCountry");
		String country = (String)method2.invoke(food3);
		System.out.println(country);
		
		
		
		

	}

}
