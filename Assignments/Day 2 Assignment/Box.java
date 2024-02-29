class Box{
	float height;
	float width;
	float breadth;
	
	Box(float h,float w,float b){
		height = h;
		width = w;
		breadth = b;
	}
	
	float getVolume(){
		return height*width*breadth;
	}

	float getSurfaceArea(){
		return 2*((width*breadth) + (width*height) + (breadth*height));	
	}

	void getDetails(){
		System.out.print("Volume- "+getVolume()+" ");
		System.out.println("| Surface Area- "+getSurfaceArea());
	}
	
	public static void main(String arg[]){
		Box box1 = new Box(2.0f,3.0f,4.0f);
		box1.getDetails();

		Box box2 = new Box(5.0f,9.0f,12.0f);
		box2.getDetails();

		
		
	}
}