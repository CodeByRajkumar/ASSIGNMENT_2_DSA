class product

int pid;

double price; static double tot_price; product(int pid, double price)

this.pid = pid; this.price = price;

} void display()

System.out.println(pid +"\t\t"+ price);

} static double totalAmount(product[] prod)

for (int i = 0; i < prod.length; i++) tot_price += prod[i].price; return tot price;

} public class Q4

public static void main(String[] args) {

product[] products = new product[5]; products[0] = new product (785432, 199.99);

products[1] = new product (845753, 79.99);

products[2] = new product (264535, 999.49); products[3] = new product (454121, 749.99);

products[4] = new product(121312, 149.99); System.out.println("sino\t"+"Product-id\t"+"Product_price");

for (int i = 0; i < products.length; i++)

System.out.print( (i+1)+"\t"); products[i].display();

double total_price = product.totalAmount (products); System.out.println("Total price is: + total price+" rupees only...");