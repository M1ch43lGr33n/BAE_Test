package mainCode;

public class Marina {

	//instance variables
	String name;
	String address;
	int volume;
	String location;
	int boatCount;
	
	//defualt constructor
	public Marina(){
		this.name = name;
		this.address = address;
		this.volume = volume;
		this.location =location;
		this.boatCount = boatCount;
	}
	
	//constructor that allows user inputs.
	public Marina(String inputName, String inputAddress, int inputVolume, String inputlocation, int inputBoatCount){
		this.name = inputName;
		this.address = inputAddress;
		this.volume = inputVolume;
		this.location = inputlocation;
		this.boatCount = inputBoatCount;
	}

	//gets and sets for the info
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public void setBoatCount(int boatCount) {
		this.boatCount = boatCount;
	}
	
	
}
