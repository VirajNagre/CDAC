class Person{
	int age;
	float height;
	float weight;
	
	Person(){
	}

	Person(int ag,float hei,float wei){
		age=ag;
		height=hei;
		weight=wei;
	}

	Person(int ag,float wei){
		age=ag;
		weight=wei;		
	}

	Person(int ag){
		age=ag;		
	}          

	void display(){
		System.out.println("Details -" );
		System.out.println("age "+age);
		System.out.println("height "+height);
		System.out.println("weight "+weight);
		System.out.println(" ");
	}

	public static void main(String arg[]){
		Person p1 = new Person();
		p1.display();
		p1 = new Person(15,140f,55.5f);
		p1.display();
		p1 = new Person(17,62f);
		p1.display();
		p1 = new Person(25);
		p1.display();
		
	}
}