package mainCode;

public class Person {
	
	//instance variables
	String name;
	String surname;
	String dob;
	String nationality;
	String visaInfo;
	String capOrCrew;
	Boolean owner;
	
	//default constructor
	public Person(){
		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.nationality = nationality;
		this.visaInfo = visaInfo;
		this.capOrCrew = capOrCrew;
		this.owner = false;
	}
	
	//constructor with allowed user inputs
	public Person(String inputName, String inputSurname, String inputDOB, String inputNationality, String inputCapOrCrew, Boolean inputOwner){
		this.name = inputName;
		this.surname = inputSurname;
		this.dob = inputDOB;
		this.nationality = inputNationality;
		this.visaInfo =visaInfo;
		this.capOrCrew = inputCapOrCrew;
		this.owner = inputOwner;
	}

	// gets and sets for the info.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getVisaInfo() {
		return visaInfo;
	}

	public void setVisaInfo(String visaInfo) {
		if(this.nationality.equals("Uk")){
			this.visaInfo = "Uk National";
		}
		else{
			this.visaInfo = "VisaInfo";
		}
	}
	
	//added methods for gets/sets for captain or crew.
	public void setCapOrCrew(String inputCapOrCrew){
		if(inputCapOrCrew.equals("Captain") || inputCapOrCrew.equals("Crew")){
			this.capOrCrew = inputCapOrCrew;
		}
		else{
			this.capOrCrew = null;
		}
	}
	
	public String getCapOrCrew(){
		return capOrCrew;
	}

	//added methods for gets/sets if person is owner or not.
	public void setOwner(boolean inputOwner){
		this.owner = inputOwner;
	}
	
	public boolean getOwner(){
		return owner;
	}
}
