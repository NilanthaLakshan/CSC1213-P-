import java.util.Scanner;
public class ex2{
	public static void main(String args[]){
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the arry size :");
	int x= scanner.nextInt();
	int[] number= new int[x]; 
	int sum =0;
for(int i=0; i<x; i++)
{ 
    System.out.println("enter the number :");
    number[i]= scanner.nextInt();
    sum=sum+number[i];	
}
System.out.println("sum is :"+sum);
	}
}