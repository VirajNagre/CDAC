class Vehicle{
	float price;
	String color;
	String modelName;

	Vehicle(float p,String c,String m){
		price = p;
		color = c;
		modelName = m;		
	}

	void display(){
		System.out.println(color+" "+modelName+" is priced at Rs." + price +" lac");
	}

	public static void main(String arg[]){
		Vehicle carens = new Vehicle(17.5f,"White","Carens");
		carens.display();
	}
}