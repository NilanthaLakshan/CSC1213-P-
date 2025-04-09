import java.util.Scanner;
public class d3ex5{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		 
		System.out.println("enter the number :");
		int x=scanner.nextInt();
		
		for(int i=0; i<x; i++)
		{
			System.out.print(i+"\t");
		}
	}
}