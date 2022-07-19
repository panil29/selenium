
public class ExceptioonDemo {

	//one try can be followed by multiple catch blocks
	//ctach block should be a immediately block after try

public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a=4;
	int b=7;
	int c=0;
	try 
	{
	int k=b/c;
	System.out.println(k);
	int[] arr=new int[5];
	System.out.println(arr[7]);
		
	}
	                 catch(ArithmeticException et)
	{
		System.out.println("i catched arthimetic exception");
	}
	catch(IndexOutOfBoundsException ets)
	{
		System.out.println("i catch index out of bound exception");
	}
	catch(Exception e)
	{
		System.out.println("i catched the error/exception");
	}
	finally
	{
		System.out.println("delete cookies");
	}
	}

}
