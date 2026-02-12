
abstract class baap
{
	abstract public void test();
	abstract public int add(int a, int b);
}
class beta extends baap
{
	@Override
	public void test()
	{
		System.out.println("hi hi hi");
	}
	@Override
	public int add(int a, int b)
	{
		return a+b; 
	}
	public void demo ()
	{
		System.out.println("hi hi demo demo");
	}
}
public class oops6P1
{
	public static void main(String [] args)
	{
		baap b = new beta();
		b.test();
		beta obj = new beta(); 
		obj.demo();
		
	}

}