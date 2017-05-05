package mainCode;

public class Person {
	
	//instance variables
	String name;
	String surname;
	String dob;
	String nationality;
	String visaInfo;
	
	//default constructor
	public Person(){
		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.nationality = nationality;
		this.visaInfo = visaInfo;
	}
	
	//constructor with allowed user inputs
	public Person(String inputName, String inputSurname, String inputDOB, String inputNationality){
		this.name = inputName;
		this.surname = inputSurname;
		this.dob = inputDOB;
		this.nationality = inputNationality;
		this.visaInfo =visaInfo;
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

}
