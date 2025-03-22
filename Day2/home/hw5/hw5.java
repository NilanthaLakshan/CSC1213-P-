import java.util.Scanner;

class hw5{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length: ");
		double length = scanner.nextDouble();
		
		System.out.printf("Square: %.2f\n", length * length);
		System.out.printf("Cube: %.3f\n", length * length * length);
		System.out.printf("Power of fourth: %.4f\n",Math.pow(length,4));
		
	}
}
		