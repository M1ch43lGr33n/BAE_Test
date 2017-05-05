package mainCode;

import java.util.ArrayList;

public class Boat implements Vehicle{

	//instance variables
	String name;
	String country;
	int size;
	int speed;
	ArrayList<Person> members = new ArrayList<Person>(); // an array of type Person - who is on which boat.
	Marina marina;

	
	//default constructor
	public Boat(){
		this.name = name;
		this.country = country;
		this.size = size;
		this.speed = speed;
		this.marina = marina;
	}
	
	//constructor allowing inputs
	public Boat(String inputName, String inputCountry, int inputSize, int inputSpeed, Marina inputMarina){
		this.name = inputName;
		this.country = inputCountry;
		this.size = inputSize;
		this.speed = inputSpeed;
		this.marina = inputMarina;
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
	
	//added methods to add people to boats and deny if 2 captains
	public void addMember(Person p1){
		if(members.size() == 0){
			members.add(p1);
		}
		else if(p1.getCapOrCrew().equals("Captain")) {
			for(int i = 0; i < members.size(); i++){
				if(members.get(i).getCapOrCrew().equals("Captain")){
					return;
				}
			}
			members.add(p1);
		}
		else{
			members.add(p1);
		}
	}
	
	public int getMemberCount(){
		return members.size();
	}

	//sets the marina the boat is in - can't be in two places at once.
	public void setMarina(Marina m1) {
			this.marina = m1;
	}
	
	public Marina getMarina(){
		return marina;
	}
}
