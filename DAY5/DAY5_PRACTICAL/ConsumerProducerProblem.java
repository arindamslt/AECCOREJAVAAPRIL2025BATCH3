package THREAD;
class Stock
{
	public int qoh=50;
	public synchronized void demand(int req)
	{
		try
		{
		if(req>qoh)
		{
			this.wait();
		}
		System.out.println("CURRENT STOCK:"+(this.qoh-req));
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
	public synchronized void  supply(int qty)
	{
		this.qoh=this.qoh+qty;
		System.out.println("AFTER DEPOSIT:"+this.qoh);
		this.notify();
	}
}
class Consumer extends Thread
{
	Stock st;
	public Consumer(Stock st)
	{
		this.st=st;
	}
	public void run()
	{
		st.demand(75);
	}
	
}
class Producer extends Thread
{
	Stock st;
	public Producer(Stock st)
	{
		this.st=st;
	}
	public void run()
	{
		st.supply(50);
	}
	
}
public class ConsumerProducerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stock st=new Stock();
Consumer cs=new Consumer(st);
Producer ps=new Producer(st);
cs.start();
ps.start();
	}

}
