
public class ChildDemo extends ParentClassDemo {
	public void Engine()
	{
System.out.println("new engine");
	}
	public void colour()
	{
		System.out.println(colour);
	}
	public void audioSsytem()
	{
		System.out.println("new audio child");
	}
public static void main(String[] args)
{
	ChildDemo c=new ChildDemo();
c.colour();
c.Engine();
c.Gear();
c.Break();
c.audioSsytem();
}
}
