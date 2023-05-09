interface DetailInfo{
	void display();
	void count();
}
class Person implements DetailInfo{
	static int maxCount=0;
	String name;
	public Person (String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("Name:"+name);
	}
	public void count() {
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!=' ')
				maxCount++;
		}
		System.out.println(maxCount);
	}
}
public class Q8 {
	public static void main(String[] args) {
		
		Person p = new Person("Raj kumar Pradhan");
		p.display();
		p.count();
	}
}