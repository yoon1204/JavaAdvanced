package java2prj1.interfaceEx.cast;

public class 캐스팅연습 {

	
	public static void main(String[] args) {
		
		Score s = new Score("홍길동",100,90);		
		System.out.println(s);
		
		//up캐스팅
		//Object o = s;	//상속관계에서 부모형으로 다루는 것 (참조하는 것), 부모형으로 참조가 축소됨
		//다운캐스팅
		//Score s2 = (Score)o;
			
		print(s);
		
		
		
	}
	
		
	public static void print(Object obj) {	// Object형으로 업캐스팅
		
		Score s = (Score)obj;
		System.out.println(s.getEng());
		
	}
	
}
