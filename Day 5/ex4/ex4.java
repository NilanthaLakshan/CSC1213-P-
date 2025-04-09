import java.util.Scanner;
public class ex4{
	public static void main(String args[]){
		Scanner scanner= new Scanner(System.in);
		
		int[] number= new int[5];
		for(int i=0; i<5; i++)
		{
			System.out.println("enter the number :");
			number[i]= scanner.nextInt();
		}
        int max=number[0];
		int min=number[0];
		for(int i=0; i<5; i++)
		{
			if(number[i]>max)
			{
				max=number[i];
			}
			
			if(number[i]<min)
			{
				min=number[i];
			}
		}
		System.out.println("maxsimam number is : "+max);
		System.out.println("minimam number is : "+min);
	}
}