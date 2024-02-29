class Student{
	String name;
	int phyMarks;
	int chemMarks;
	int mathMarks;


	void addDetails(String n,int p,int c,int m){
		name = n;
		phyMarks = p;
		chemMarks = c;
		mathMarks = m;		
	}

	float calculateAvg(){
		float avg = (phyMarks+chemMarks+mathMarks)/3;	
		return avg;
	}
	
	String getName(){
		return name;
	}
	
	int getTotalMarks(){
		return phyMarks+chemMarks+mathMarks;
	}
	void getDetails(){
		System.out.println("Student details");
		System.out.println("Name- "+ getName());
		System.out.println("Total Marks - "+getTotalMarks());
		System.out.println("Average - "+ calculateAvg());
	}

	public static void main(String []args){
		Student studObj = new Student();
		studObj.addDetails("Viraj",82,83,90);
		studObj.calculateAvg();
		studObj.getDetails();

	}
}