
public class MinValueRowMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] bc= {{2,4,5},{3,2,10},{1,2,0}};
		int min=bc[0][0];
		
		int minColumn = 0;
		for(int i=0;i<bc.length;i++)
		{
			for(int j=0;j<bc[i].length;j++)
			{
				if(bc[i][j]<min)
				{
					min=bc[i][j];
				minColumn=j;
				}
			}
		}
		System.out.println(min);

		int max=bc[0][minColumn];
		int k=0;
		while(k<3)
		{
			if(bc[k][minColumn]>max)
			{
				max=bc[k][minColumn];
			}
			k++;
		}
		System.out.println(max);
		
		

	}

}
