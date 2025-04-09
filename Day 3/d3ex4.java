import java.util.Scanner;
public class d3ex4{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the char :");
		int vowels=scanner.next().charAt(0);
		
		switch(vowels){
			
			case 'a':System.out.println("it is vowel");
			       break;
			case 'i':System.out.println("it is vowel");
			       break;
			case 'e':System.out.println("it is vowel");	   
			       break;
			case 'o':System.out.println("it is vowel");   
			       break;
			case 'u':System.out.println("it is vowel");
			       break;
			case 'A':System.out.println("it is vowel");
			       break;
			case 'E':System.out.println("it is vowel");
			       break;
			case 'I':System.out.println("it is vowel");	   
			       break;
			case 'O':System.out.println("it is vowel");   
			       break;
			case 'U':System.out.println("it is vowel");
			       break;	   
			default :System.out.println("it is not vowel");
		}
	}
}	