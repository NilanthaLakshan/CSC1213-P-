import java.util.Scanner;
public class d3ex6{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the value of counter 1");
		int x= scanner.nextInt();
		System.out.println("enter the value of counter 2");
		int y= scanner.nextInt();
		
		for(int i=0; i<x; i++)
		{
			System.out.println("value is i :"+i);
			for(int j=0; j<y; j++)
			{
				System.out.println("value is j :"+j);
			}
			System.out.println();
		}
	}
}