// calculate sum of multiples of 3 in seq of numbers

import java.util.Scanner;

class Q3{
	public static void main(String []arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a +ve number");
		int n = sc.nextInt();
		if (n<0){
			System.out.println("Negative number is not allowed");
			return;		
		}
		int sum=0,t=0;
		for(int i=0;i<n;i++){
			t = 2*(i-1);
			t=i;
			System.out.println("t "+ t + " " + t%3);
			if (t%3==0){
				sum+=i;
			}
		}
		System.out.println("Sum is "+ sum);
	}
}