package OOPS;
class Product
{
	public String pid;
	public String pname;
	public int pqty;
	public double price;
	public String sdt="22/04/2025";
	public Product(String pid,String pname,int pqty,double price)
	{
		this.pid=pid;
		this.pname=pname;
		this.pqty=pqty;
		this.price=price;
		
	}
	public void viewProduct()
	{
		System.out.println("PRODUCT ID:"+this.pid);
		System.out.println("PRODUCT NAME:"+this.pname);
		System.out.println("PRODUCT QUANTITY:"+this.pqty);
		System.out.println("PRODUCT PRICE:"+this.price);
	}
	public void salesOrder()
	{
		
		this.viewProduct();
		System.out.println("SALES DATE:"+sdt);
		double total=this.price*this.pqty;
		System.out.println("TOTAL SALES:"+total);
	}
	 
}
public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product ps=new Product("P1","TV",5,25000.00);
//ps.viewProduct();
ps.salesOrder();
	}

}
