// matrix addition

class Q4{

	public static void main(String []arg){
		int m1[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int m2[][] = {{9,8,7},{6,5,4},{3,2,1}};

		//int m1[][] = {{1,2,3},{4,5,6}};
		//int m2[][] = {{9,8,7},{6,5,4}};

		int col = m1[0].length;
		int row = m1.length;

		int sumMatrix[][] = new int[row][col];


		for (int i= 0;i<row;i++){
			for (int j=0;j<col;j++){
				sumMatrix[i][j] = m1[i][j] + m2[i][j];
			}
		
		}

		for (int i= 0;i<row;i++){
			for (int j=0;j<col;j++){
				System.out.print(sumMatrix[i][j]+" ");
				//sumMatrix[i][j] = m1[i][j] + m2[i][j];
			}
		System.out.println(" ");
		}
		
	}
}
