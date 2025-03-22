import java.util.Scanner;
class ex3{
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String firstName = scanner.nextLine();
		
		System.out.print("Enter Your Last Name: ");
		String lastName = scanner.next();
		
		System.out.print("Enter Your Age: ");
		int Age= scanner.nextInt();
		
		System.out.println("Full Name: "+ firstName +" "+ lastName +"\nAge: "+Age);
	}
}