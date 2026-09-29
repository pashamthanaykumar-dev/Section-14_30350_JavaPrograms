class Arm
{
     public static void main(String args[])
     {
          int no,temp,x,rev=0;
          scanner sc=new scanner(System.in);
          System.out.println("ps enter any number");
          no=sc.nextInt();
          temp=no;
          while(no>0)
          {
               x=no%10;
               rev=rev+(x*x*x);
               no=no/10;
          }
          if(rev==temp)
          System.out.println("the entered number "+temp+" is armstrong");
          else
          System.out.println("the entered number "+temp+" is not armstrong");
     }
}