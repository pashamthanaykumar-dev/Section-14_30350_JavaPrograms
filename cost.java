import java.lang.*;
public class cost
{
public static void main (String a[])
{
 int l=45000;
 int m=500;
 int k=1500;

 int total=l+m+k;
 int GST=(total*18)/100;
 int final cost=total+GST;

 System.out.println("total="+total);
 System.out.println("final cost="+final cost);
 System.out.println("GST="+GST);
}
}