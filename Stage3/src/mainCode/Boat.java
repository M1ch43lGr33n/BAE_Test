package mainCode;

public class Boat implements Vehicle{

	//instance variables
	String name;
	String country;
	int size;
	int speed;
	
	//default constructor
	public Boat(){
		this.name = name;
		this.country = country;
		this.size = size;
		this.speed = speed;
	}
	
	//constructor allowing inputs
	public Boat(String inputName, String inputCountry, int inputSize, int inputSpeed){
		this.name = inputName;
		this.country = inputCountry;
		this.size = inputSize;
		this.speed = inputSpeed;
	}

	//gets & sets for the info in boat
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	

	//override the accelerate method in the interface
	public void accelerate() {
		//code increase speed?
		this.speed = this.speed + 1;
	}
	

	//override the deccelerate method in the interface
	public void deccelerate() {
		//code to decrease speed?
		this.speed = this.speed - 1;
	}
	
	
}
