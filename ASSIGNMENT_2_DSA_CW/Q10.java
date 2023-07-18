import Pack.*;
import Pack1.*;
public class Q10 implements Sports {

	public static void main(String[] args) {
		Test t = new Test();
		t.input();
		t.output();
		int grand_total_mark = t.mark1+t.mark2+score1+score2;
		System.out.println("Grand total score and mark "+grand_total_mark);		
	}
}
//package Pack

package Pack;
import java.util.*;
class student1{
	String name;
	int roll;
	public void input(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter name & rollNo");
		name = sc.nextLine();
		roll = sc.nextInt();
	}
	public void output() {
		System.out.println("The name is "+name+" & rollNo is "+roll);
	}
}
public class Test extends student1{
	public int mark1;
	public int mark2;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mark1 & mark2");
		mark1 = sc.nextInt();
		mark2 = sc.nextInt();
	}
	public void output() {
		System.out.println("The mark1 and mark2 are :"+mark1+","+mark2);
	}
	
}
//package Pack1

package Pack1;
public interface Sports{	
	public int score1=20;
	public int score2=30;	
}
