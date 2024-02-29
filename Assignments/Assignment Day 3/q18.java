import java.util.Scanner;

class Q18{
	public static void main(String []arg){
		System.out.println("Simple calculator");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st num");
		int num1 = sc.nextInt();

		System.out.println("Enter 2nd num");
		int num2 = sc.nextInt();
		
		System.out.println("Choose operation");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter your choice");

		int op = sc.nextInt();
		switch (op){
			case 1:System.out.println(num1+" + "+num2+" = "+(num1+num2));break;
			case 2:System.out.println(num1+" - "+num2+" = "+(num1-num2));break;
			case 3:System.out.println(num1+" x "+num2+" = "+(num1*num2));break;
			case 4:System.out.println(num1+" / "+num2+" = "+(num1/num2));break;
		}

	}
}