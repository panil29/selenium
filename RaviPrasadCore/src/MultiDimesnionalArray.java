
public class MultiDimesnionalArray {

	public static void main(String[] args)
	{
		int[][] a=new int[2][2];
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		
			//System.out.println(a[0][1]);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		int b[][]= {{2,3,4},{5,6,7}};
		for(int c[]:b)
		{
			for(int d:c)
			{
				System.out.println(d);
			}
		}
			
		
	}
}
