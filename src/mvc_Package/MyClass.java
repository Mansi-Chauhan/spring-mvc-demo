package mvc_Package;

import java.util.LinkedHashMap;

public class MyClass {
	
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String,String> countryList;
	private String gender;
	private String[] food;
	
	
	MyClass(){
		
		countryList=new LinkedHashMap<>();
		countryList.put("India", "ind");
		countryList.put("Aus", "Australia");
		
	}
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}
	public void setCountryList(LinkedHashMap<String, String> countryList) {
		this.countryList = countryList;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getFood() {
		return food;
	}
	public void setFood(String[] food) {
		this.food = food;
	}
	
	
}

	