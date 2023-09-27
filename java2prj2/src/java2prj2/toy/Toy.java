package java2prj2.toy;

public class Toy {
	String content;

	@Override
	public String toString() {
		return "Toy [content=" + content + "]";
	}
	
	public Toy() {
		// TODO Auto-generated constructor stub
	}

	
	public Toy(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
