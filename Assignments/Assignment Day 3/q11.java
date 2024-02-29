import java.util.Scanner;

class Q11{
	static int getNumber(){
		Scanner takeInput = new Scanner(System.in);
		System.out.println("Enter value");
		return takeInput.nextInt();
	}

public static void main(String []arg){
	int userInput;

	while(true){
		userInput = getNumber();
		System.out.println("You have entered "+userInput);
		if (userInput==0) break;
	}
	
	System.out.println("Using for loop");
	for (int i=0;i<2;i++){
		userInput = getNumber();
		System.out.println("You have entered "+userInput);
		if (userInput==0) {
			i=2;
		}else{
			i=0;
		}		
	}
		

	System.out.println("Using for loop 2");
	for (int i=0;i!=0;i++){
		userInput = getNumber();
		System.out.println("You have entered "+userInput);
		if (userInput==0) {
			break;
		}	
	}


}
}