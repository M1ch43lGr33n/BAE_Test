package mainCode;

import java.util.ArrayList;

public class Marina {

	//instance variables
	String marinaName;
	String address;
	int volume;
	String location;
	int boatCount;
	ArrayList<Boat> boatList = new ArrayList<Boat>();
	
	//defualt constructor
	public Marina(){
		this.marinaName = marinaName;
		this.address = address;
		this.volume = volume;
		this.location =location;
		this.boatCount = boatCount;
	}
	
	//constructor that allows user inputs.
	public Marina(String inputName, String inputAddress, int inputVolume, String inputlocation, int inputBoatCount){
		this.marinaName = inputName;
		this.address = inputAddress;
		this.volume = inputVolume;
		this.location = inputlocation;
		this.boatCount = inputBoatCount;
	}

	//gets and sets for the info
	public String getMarinaName() {
		return marinaName;
	}

	public void setMarinaName(String name) {
		this.marinaName = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getBoatCount() {
		return boatCount;
	}

	//code to add boat to marina providing there is people on board.
	public void setBoatCount(int boatCount) {
		this.boatCount = boatCount;
	}
	
	public void addBoat(Boat b1){
		
		if(b1.getMemberCount() > 0 && boatList.size() < this.boatCount){
			boatList.add(b1);
		}
		else{
			return;
		}
	}
	
	public int getBoatListSize(){
		return boatList.size();
	}
}
