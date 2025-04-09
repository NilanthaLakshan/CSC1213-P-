import java.util.Scanner;
public class d3ex2{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the number :");
		int num1=scanner.nextInt();
		System.out.println("enter the number :");
		int num2=scanner.nextInt();
		System.out.println("enter the number :");
		int num3=scanner.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("maxsimam number is :"+num1);
		}
		else if(num2>num1 && num2>num3)
		{
		System.out.println("maxsimam number is :"+num2);
		}
		else
		{
			System.out.println("maxsimam number is :"+num3);
		}
	}
}