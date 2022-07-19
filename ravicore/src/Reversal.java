public class Reversal {
    public static void main(String[] args)
    {
        String a="anil pavuluru";
        String b="";
        for(int i=a.length()-1;i>=0;i--)
        {
            //System.out.println(a.charAt(i));
            b=b+a.charAt(i);

        }
        System.out.println("String reversal of given name:\t"+b);
    }
}
