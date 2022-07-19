public class ReversalPyramid {
    public static void main(String[] args)
    {
       /* int k=1;
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<=0+i;j++)
            {

                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.println("");
        }*/
       /* for(int i=0;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
                System.out.print("\t");


            }
            System.out.println("");

        }*/
        int k=3;
        for(int i=0;i<4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k);
                System.out.print("\t");
k=k+3;
            }
            System.out.println("");
        }



    }




}
