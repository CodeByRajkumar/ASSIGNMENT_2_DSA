
class Persion{
	String name;
	int age;
	//const
	Persion(String name,int age){
		this.name=name;
		this.age=age;
	}
}
class Employee extends Persion{
	int Eid;
	double salary;
	Employee(String name, int age,double salary) {
		super(name, age);
		this.salary=salary;
	}
		void empDisplay() {
			System.out.println(name+"  "+age+"  "+salary);
		}
}
public class Q7 {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("RajKumar1", 18, 33112.9d);
		Employee emp2 = new Employee("RajKumar2", 19, 40019.25d);
		Employee emp3 = new Employee("RajKumar3", 20, 33022.40d);
		emp1.empDisplay();
		emp2.empDisplay();
		emp3.empDisplay();
	}
}
