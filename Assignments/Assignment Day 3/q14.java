import java.util.Scanner;

class Q14{
	public static void main(String []arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int fact = 1;
		for(int i=n;i>0;i--){
			fact = fact * i;
		}
		System.out.println("Factorial is "+fact);
	}
}