import java.util.*;
class Student{
	int Roll;
	String Name;
	double DSA_Mark;
	
	void getdata(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll No.");
		Roll=sc.nextInt();
		System.out.println("Enter Name");
		Name=sc.next();
		System.out.println("Enter mark");
		DSA_Mark=sc.nextDouble();
	}
	void showdata() {
		System.out.println(Roll+" , "+Name+" , "+DSA_Mark);
	}
}
public class Q3 {
	public static void main(String[] args) {
		//class as dataType
		Student s[] = new Student[5];
		for(int i=0;i<5;i++) {
			//Creating an object of array s[] from 1 to 5
			System.out.println("Enter information about student"+(i+1));
			s[i]=new Student();
			//Entering roll,name,mark
			s[i].getdata();
		}
		//printing information
		for(int i=0;i<5;i++) {
			System.out.println("Roll, Name, DSA Mark of Student"+(i+1));
			s[i].showdata();
		}
		//initialization
		int index = -1;
		double max=s[0].DSA_Mark;
		for(int i=0;i<5;i++) {
			if(s[i].DSA_Mark>max) {
				max=s[i].DSA_Mark;
				index=i;
			}
		}
		System.out.println("The Student"+(index+1)+" get maximum mark that is "+max);
	}
}