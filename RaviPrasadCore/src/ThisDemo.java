
public class ThisDemo {
int a=2;
public void getData()
{
	int a=3;
	System.out.println(a);
	//this refers to current object scope lies in class level
	System.out.println(this.a);
	int c=a+this.a;
	System.out.println(c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo td=new ThisDemo();
		td.getData();
	}

}
