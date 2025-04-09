import java.util.Scanner;
public class ex3{
public static void main(String args[]){
	
	Scanner scanner=new Scanner(System.in);
	int[] number= new int[10];
	
	for(int i=0; i<10; i++)
	{ 
       System.out.println("enter the number :");
	   number[i]= scanner.nextInt();
	}
	for(int i=0; i<10; i++)
	{
		int j=i+1;
		System.out.println("number "+j+" :"+number[i]);
	}
	String days[]={"monday","tuesday","wendesday","thursday","friday","saturday","sunday"};
	
	for(int i=0; i<days.length; i++)
	{
		int j=i+1;
		System.out.println("day "+j+" :"+days[i]);
	}
	for(String day:days)
	{
		System.out.println(day);
	}
	}
}
	
	