package java2prj.day3.실습;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CustomerTest {
	


	public static void main(String[] args) {
		
		
		ArrayList<Customer> list = new ArrayList<>();
		
		list.add(new Customer("dy","곽단야","vvip",90));
		list.add(new Customer("mg","김민규","vip",80));
		list.add(new Customer("mg","김민지","bronze",50));
		list.add(new Customer("bj","김병진","vvip",95));
		list.add(new Customer("jy","김재열","vip",75));
		list.add(new Customer("hs","김현수","bronze",55));
		list.add(new Customer("nj","문나정","vvip",100));
		list.add(new Customer("tm","박태민","vip",70));
		list.add(new Customer("yj","서예진","bronze",60));
		list.add(new Customer("yj2","이윤정","vvip",100));
		
		// 1. 고객등급이 vvip인 사람은 몇 명인가
		Stream<Customer> stream = list.stream();
		
		System.out.println("1.");
		stream = list.stream();
		long result =stream.filter(Customer -> Customer.getGrade().equals("vvip")).count();
		System.out.println(result);
		
		// 2. 고객등급이 vip인 사람만 출력
		System.out.println("2.");
		stream = list.stream();
		stream.filter(Customer -> Customer.getGrade().equals("vip")).forEach(s -> System.out.println(s));
		
		// 3. 포인트가 높은 사람순으로 정렬해서 출력
		System.out.println("3.");
		stream = list.stream();
		stream.sorted((o1,o2) -> o2.point - o1.point).forEach(item -> System.out.println(item));
		
		
		
		
}
}
