
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int[5];//declares an array and allocates memory for the values
    a[0]=2;
    a[1]=3;
    a[2]=4;
    a[3]=5;
    a[4]=6;
    int[] b= {1,2,3,4,5};
    for(int i=0;i<a.length;i++)
    {
    	System.out.println(a[i]);
    }
	for(int c:b)
	{
		System.out.println(c);
	}
	}

}
