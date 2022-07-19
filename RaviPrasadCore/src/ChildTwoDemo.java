
public class ChildTwoDemo  extends ParentTwoDemo{
	String name="BEZAWADA";
	
	public  ChildTwoDemo()
	{
		super();//always first line
		System.out.println("child class constructor");
	}
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
public void getDat()
{
	super.getDat();
	System.out.println("i am in child class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildTwoDemo cd=new ChildTwoDemo();
		cd.getDat();
	cd.getStringData();
	}
}
