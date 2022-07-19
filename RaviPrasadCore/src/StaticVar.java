
public class 	StaticVar 
 {
	String name;
	String address;
	static String city;
	static int i;
	static
	{
		city="ohio";
		i=0;
	}
	StaticVar(String name, String address)
	{
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
	}
	public void getAddress()
	{
		System.out.println(address+" "+city);
	}
	public static void getCity()
	{
		System.out.println(city);
	}
public static void main(String[] args)
{
	StaticVar obj=new StaticVar("Anil","cleveland");
	StaticVar obj1=new StaticVar("midhun","dayton");
	obj.getAddress();
	obj1.getAddress();
	StaticVar.getCity();
	StaticVar.i=4;
	obj.address="XYZ";
}
}
