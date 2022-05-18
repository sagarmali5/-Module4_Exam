
class  RaceTrack{
	public static void main(String []args){
	Car c1=new Car(2010,"Porsche",25.00);
	//Currnt stutus of object
	System.out.println("Year of manufacturing is =="+c1.getYear());
	System.out.println("Name of car is =="+c1.getMake());
	System.out.println("Speed of car is =="+c1.getSpedd());
	c1.accelerate();
	System.out.println("Speed of car after acceleratation is =="+c1.getSpedd());
	}
	
}