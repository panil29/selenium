
public class ConstructorDEmo {
	public ConstructorDEmo()
	{
		System.out.println("i am in constructor");
	}
	public ConstructorDEmo(int a,int b)
	{
		System.out.println("i am in parametrized constructor");
		int c=a+b;
		System.out.println(c);
	}
	public ConstructorDEmo(String name)
	{
		System.out.println(name);
	}
	public void getData()
	{
		System.out.println("i am method");
	}
	public static void main(String[] args)
	{
		ConstructorDEmo cd=new ConstructorDEmo();
		ConstructorDEmo c=new ConstructorDEmo(29,3);
		ConstructorDEmo cde=new ConstructorDEmo("anil pavuluru");

	}

}
