import java.util.Random;
import java.util.Date;

public class hw4{
	public static void main(String args[]){
		System.out.println(Math.max(0,10));
		System.out.println(Math.min(0,10));
		System.out.println(+Math.sqrt(64));
		System.out.println(+Math.abs(-4.7));
		System.out.println(+Math.round(5.58));
		
		String name = "Java";
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		int Num1 = Integer.parseInt("187");
		double Num2 = Double.parseDouble("48.18");
		System.out.println(Num1+Num2);
		
		Random r = new Random();
		int rr = r.nextInt(10);
		System.out.println(rr);
		
		Date date = new Date();
		System.out.println(date);
	}
}
		
		
		