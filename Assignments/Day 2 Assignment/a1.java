class Room{
	int height;
	int width;
	int breadth;

	public static void main(String arg[]){
		int height;
		int width;
		int breadth;
		
		Room roomObj = new Room(2,3,4);
		roomObj.getVolume();
	}

	Room(int h,int w,int b){
		height = h;
		width = w;
		breadth = b;
	}
	
	void getVolume(){
		System.out.println("Voume of the room is "+height*width*breadth);
	};


	
}