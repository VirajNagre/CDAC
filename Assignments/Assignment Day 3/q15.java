import java.util.Scanner;

class Q15{
	public static void main(String []arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int summ = 0,rem;
		
		while (n!=0){
			summ += n%10;
			n = n/10;
		}
		System.out.println("summ of all digits- "+summ);
	}
}