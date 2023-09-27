package java2prj1.generic;

public class OList {

	private Object[] nums;
	private int current;
	
	public OList() {
		nums = new Object[5];
		current=0;
	}
	
	public int size() {
		return current;
	}
	
	public void add(Object obj) {
		
		nums[current] = obj;
		current++;
	}
	
	public void clear() {
		//current 초기화
		current=0;
		// nums=nuew int[3];
	}
	
	public Object get(int index) {
		return nums[index];
	}
}
