class MinMax{
	public static void main(String []arg){
		int a[] = {5,4,3,9,1,7,9,999,1,-8};
		int min=a[0],max=a[0];
		
		for (int i = 0;i<a.length;i++){
			if(a[i]>max) max=a[i];
			if(a[i]<min) min=a[i];
		}	
		System.out.println("Max is "+ max);
		System.out.println("Min is "+ min);
	}
}