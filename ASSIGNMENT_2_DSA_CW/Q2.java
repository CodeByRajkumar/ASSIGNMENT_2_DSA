import java.util.Scanner;
class Complex{
	int imag;
	int real;
	void setData() {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter real part:");
		 imag = sc.nextInt();
		 System.out.println("Enter imaginary part");
		 real = sc.nextInt();
	}
	//class as dataType
	public Complex add(Complex c1,Complex c2) {
		Complex c3=new Complex();
		c3.real=c1.real+c2.real;
		c3.imag=c1.imag+c2.imag;
		
		return c3;
	}
	void dispay() {
		System.out.println(real+"+"+imag+"i");
	}
}
public class Q2 {
	public static void main(String[] args) {
		
		Complex C1=new Complex();
		Complex C2=new Complex();
		Complex C3=new Complex();
		System.out.println("Enter First Comlex Number");
		C1.setData();
		System.out.println("Enter Second Complex Number");
		C2.setData();
		//C3=C3.add(C1, C2);
		C3=C3.add(C1, C2);
		System.out.println("The first number is:");
		C1.dispay();
		System.out.println("The second number is:");
		C2.dispay();
		
		System.out.print("The sum is ");
		C3.dispay();
	}
}