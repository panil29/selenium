
public class MiniumNumber {

	
public static void MinValue(int[][] ab)
{
	int min=ab[0][0];	
    for(int i=0;i<ab.length;i++)
    {
   	 for(int j=0;j<ab[i].length;j++)
   	 {
   		 if(ab[i][j]<min)
   		 {
   			 min=ab[i][j];
   		 }
   	 }
    }
 System.out.println(min);
}
public static void   Maxvalue(int[][] ab)
{
	int max=ab[0][0];
	for(int i=0;i<ab.length;i++)
    {
   	 for(int j=0;j<ab[i].length;j++)
   	 {
   		 if(ab[i][j]>max)
   		 {
   			 max=ab[i][j];
   		 }
   	 }
    }
	System.out.println(max);
	
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
int[][] ab= {{2,4,5,7},{8,8,4,7},{1,2,9,0}};
//System.out.println(MinValue(ab));
//System.out.println(Maxvalue(ab));
Maxvalue(ab);
MinValue(ab);
}

}