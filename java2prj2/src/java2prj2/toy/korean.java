package java2prj2.toy;

	public class korean extends Food{
		String Name;

public korean() {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "korean [Name=" + Name + "]";
}

public korean(String name) {
	super();
	Name = name;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}
}
