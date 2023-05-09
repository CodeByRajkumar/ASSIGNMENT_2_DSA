
class Deposit{
	long Principal;
	int Time;
	double rate;
	double Total_amt;
	//Now for overloading
	//Constructor1:
	Deposit(){
		
	}//Constructor2:
	Deposit(long Principle,int Time,double rate){
		this.Principal=Principle;
		this.Time=Time;
		this.rate=rate;
	}//Constructor3:
	Deposit(long Principle,int Time){
		this.Principal=Principle;
		this.Time=Time;
	}
	Deposit(long Principle,double total_amt){
		this.Principal=Principle;
		this.Total_amt=Total_amt;
	}
	void calc_amt() {
		Total_amt=Principal + (Principal*rate*Time)/100;
	}
	void display() {
		System.out.println("Total amount is "+Total_amt);
	}
}
public class Q5 {
	public static void main(String[] args) {
		
		Deposit obj = new Deposit(10,10,10);//20
		obj.calc_amt();
		obj.display();
	}
}
