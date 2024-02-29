import java.util.Scanner;


class Q16{

	public static void main(String []arg){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 1 || num == 2){
				System.out.println("Prime");
				return;	
		}
		for (int i = 2;i<num;i++){
			if(num%i==0){
				System.out.println("Not a prime");
				break;
			}else{
				System.out.println("Prime");
				break;	
			}
		}		
	}
}