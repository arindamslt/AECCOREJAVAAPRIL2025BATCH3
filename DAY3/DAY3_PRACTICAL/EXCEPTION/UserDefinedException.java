package EXCEPTION;
class Stock
{
	public int qoh=50;
	public void issue(int req)
	{
		try
		{
		if(req>qoh)
		{
			OutOfStockException oe=new OutOfStockException();
			throw oe;
		}
		System.out.println("CURRENT STOCK:"+(qoh-req));
		}
		catch(OutOfStockException oe)
		{
			oe.printStackTrace();
		}
	}
}
public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Stock st=new Stock();
  st.issue(75);
	}

}
