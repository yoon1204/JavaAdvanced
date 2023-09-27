package java2prj2.toy;

public class Food {
	String content;
	
	public Food() {
		// TODO Auto-generated constructor stub
	}

	public Food(String content) {
		super();
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Food [content=" + content + "]";
	}
	
	
}
