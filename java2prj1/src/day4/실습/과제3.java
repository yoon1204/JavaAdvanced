package day4.실습;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import day4.변경에유리한코드.Animal;

public class 과제3 {
	
	Cook cook;
	
	
	
	public Cook getCook() throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Properties p = new Properties();
		p.load(new FileReader("src/day4/실습/cook.txt"));
		String className = p.getProperty("cook");		
		Class clazz = Class.forName(className);
		Cook cook = (Cook)clazz.newInstance();
		return cook;
		 
	}
	
	public void showMenu() {
		 
		System.out.println("메뉴입니다===>");
		System.out.println("돼지불백");
		System.out.println("모둠쌈밥");
		System.out.println("불고기된장찌게");
	}
	
	
	public void run() throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {	
		
			
			this.cook =getCook();	
			System.out.println( "오늘의 요리사 " + cook);
			
			showMenu();
		    Scanner sc = new Scanner(System.in);		
			
			System.out.println("주문을 받습니다=>");
			String orderMenu ="";
			orderMenu=sc.next();		
			
			System.out.println("주문한 것은"+orderMenu+"입니다");
			
			
			
			String resultFood=""; 
			if(orderMenu.equals("돼지불백")) {
				resultFood=cook.돼지불백();
			}else if(orderMenu.equals("모둠쌈밥")){
				resultFood=cook.모둠쌈밥();
			}else if(orderMenu.equals("불고기된장찌게")) {
				resultFood=cook.불고기된장찌게();
			}
			
			System.out.println(resultFood);			
			
			
	}
	

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		
		과제3 program  = new 과제3();
		program.run();
		
		
		
		
	}
}
