import java.util.Scanner;
Class Arm
{
      public static void main (String args[])
      {
              int no,temp,x;
              Scanner sc=new Scanner(System.in)
              System.out.println("pls enter any number");
              no=sc.nextInt();
              temp=noe;
              while(no>0)
              {
              
                   x=no%10;
                   rev=rev+(x*x*x);
                   no=no/10;
                  
                   }
                   if(rev==temp)
                   System.out.println("the enterd number "+temp+ is Armstrong");
                   else
                   System.out.prinln("the enterd number "+temp+" is not Armstrong");
                   
                   }
       }