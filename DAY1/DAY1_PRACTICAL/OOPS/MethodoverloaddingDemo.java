package OOPS;
class Calculator
{
	public int add(int a,int b)
	{
		return(a+b);
	}
	public float add(int a,float b)
	{
		return(a+b);
	}
	public double add(double a,double b)
	{
		return(a+b);
	}
}
public class MethodoverloaddingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator cl=new Calculator();//creating object
System.out.println(cl.add(5,6));
System.out.println(cl.add(5, 6.5));
System.out.println(cl.add(5.6,6.5));
	}

}
