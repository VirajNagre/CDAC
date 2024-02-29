import java.util.Scanner;

class Q13{
	
	public static void main(String []arg){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");
		int n = sc.nextInt();

		System.out.println("Table of "+n);
		for(int i=1;i<=10;i++){
			System.out.println(n+" x "+i+" = "+n*i);
		}
	
	}
}