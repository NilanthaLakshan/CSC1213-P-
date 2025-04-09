import java.util.Scanner;
public class d4ex1{
	public static void main (String args[]){
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("enter the number :");
		int x=scanner.nextInt();
		
		int i=1;
		int sum=0;
		
		while(i<=x)
		{
			sum=sum+i;
			i++;
		}
		
		System.out.println("summation "+sum);
	}
}