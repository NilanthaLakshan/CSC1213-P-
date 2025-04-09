import java.util.Scanner;
public class ex1{
	public static void main(String args[]){
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("enter the number :");
	int num=scanner.nextInt();
	
	if(num>0)
	{
		System.out.println("posicive number");
	}
	else if (num<0)
	{
		System.out.println("negative number");
	}
	else
	{
		System.out.println("number is zero");
	}
}
}
	