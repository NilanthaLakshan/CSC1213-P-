public class ex1{
	public static void main(String args[]){
		
		int[] number = new int[5];
		number[0]=23;
		number[1]=67;
		number[2]=89;
		number[3]=45;
		number[4]=08;
		
		int sum=0;
		for(int i=0; i<5; i++)
		{
			sum=sum+number[i];
		}
		
		System.out.println("sum is :"+sum);
	}
}