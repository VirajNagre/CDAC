class Q4{

	public static void main(String []arg){
		int a[] = {5,4,3,9,1,7,9};
		double avg=0.0f;
		float sum=0;
		for (int i = 0;i<a.length;i++){
			sum+=a[i];
		}

		avg = sum/a.length;
		System.out.println("Avg is "+ avg);
	}
}