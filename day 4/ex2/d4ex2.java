import java.util.Scanner;
public class d4ex2{
public static void main(String args[]){
	Scanner scanner=new Scanner(System.in);
	char co= ' ';
	
	int sum=0;
	
	
	do
	{
		System.out.println("Enther the number :");
	     int x=scanner.nextInt();
		sum=sum+x;
		System.out.println("do you want to continue (y/n) :");
		co=scanner.next().charAt(0);
		
	}
	while(co=='y');
	
	
		System.out.println("summation is : "+sum);
}
}