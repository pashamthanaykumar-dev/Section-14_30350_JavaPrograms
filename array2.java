import java.util.Scanner;
public class array2{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int size = 5;
int[] array = new int [size];
for(int i=0; i<=size-1; i++)
{
System.out.print("enter element for position " + i +": ");
array[i]=sc.nextInt();
}
System.out.println("elements are: ");
for(int j=0; j<size; j++)
{
System.out.println("element " + j + " is: " + array[j]);
}
}}