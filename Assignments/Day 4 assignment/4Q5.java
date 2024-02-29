class Q5{
	public static void main(String []arg){
		int m1[][] = {{1,2,3},{4,15,6},{7,8,19}};
		int m2[][] = {{1,2,3},{4,15,6},{7,8,9}};

		m1 = new int[][]{{12,2},{3,5}};
		m2 = new int[][]{{1,2},{3,4}};

		int rows = m1.length;
		int cols = m1[0].length;	
		for(int i = 0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(m1[i][j]!=m2[i][j]){
					System.out.println("Matrices are not equal at pos "+ (i+1) + " " +(j+1));
					return;
				}
			}
		}
		System.out.println("Matrices are equal");
	}
}