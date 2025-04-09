import java.util.Scanner;
public class d4ex3{
	public static void main (String args[]){
		Scanner scanner=new Scanner(System.in);
		
		int x=0;
		int y=0;
		int sum=0;
		char co=' ';
		
		do{
			System.out.println("Enter the number :");
			int num=scanner.nextInt();
			
			if (num%2==0)
			{
				x=x+num;
			}
			else
			{
				y=y+num;
			}
				System.out.println("do you want to continue (y/n) :");
		co=scanner.next().charAt(0);
		
	}
	while(co=='y' || co=='Y');
	
	sum = x+y;
	
		System.out.println("even number summation is : "+x);
		System.out.println("odd number summation is : "+y);
		System.out.println("all number summation is : "+sum);
	}
}