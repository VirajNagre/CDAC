class Q5{

	public static void main(String []arg){
		
		int userInp = -5;
		int i = userInp;
		while(i<10){
			i++;
			int j = userInp;
			if (j==0) break;
			else if(j==1) continue;
			System.out.println(""+i+" "+j);
		}
			System.out.println("Finished");
	}
}