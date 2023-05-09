import java.util.Scanner;
class student_{
	int rollNo;
	String name;
	String course;
	Scanner sc = new Scanner(System.in);
	void input_Student() {
		System.out.println("Enter student detail roll,name,course");
		
		rollNo = sc.nextInt();
		name = sc.next();
		course = sc.next();
	}
	void display_Student() {
		System.out.println("Name:"+name+"  rollNo:"+rollNo+"  course:"+course);
	}
}
class Exam extends student_{

	float mark1;
	float mark2;
	float mark3;
	
	void input_mark() {
		System.out.println("Enter Mark 1,2,3");
		Scanner sc = new Scanner(System.in);
		mark1 = sc.nextFloat();
		mark2 = sc.nextFloat();
		mark3 = sc.nextFloat();
	}
	void display_Result() {
		
		System.out.println("Mark1:"+mark1+" , Mark2:"+mark2+" , Mark3:"+mark3);
	}
}
public class Q9 {
	public static void main(String[] args) {
		
		Exam s[]=new Exam[5];
		for(int i=0;i<5;i++) {
			
			s[i]=new Exam();
			//Entering roll,name,mark
			
			s[i].input_Student();
			s[i].input_mark();
			s[i].display_Student();
			s[i].display_Result();
			
		}
	}
}