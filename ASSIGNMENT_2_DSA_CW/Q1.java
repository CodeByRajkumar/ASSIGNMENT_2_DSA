
class phone{
	int area_code;
	int exchange;
	int number;
	
	void input(int a,int e,int n) {
		this.area_code=a;
		this.exchange=e;
		this.number=n;
	}
	void display() {
		System.out.println("Your number is ("+area_code+") "+exchange+"-"+number);
	}
}
public class Q1 {

	public static void main(String[] args) {
		//your phone number
		phone p1 = new phone();
		p1.input(415, 555, 1212);
		p1.display();
		
		//My number
		phone p2 = new phone();
		p2.area_code=212;
		p2.exchange=767;
		p2.number=8900;
		System.out.println("My number is ("+p2.area_code+") "+p2.exchange+"-"+p2.number);
		
	}

}
