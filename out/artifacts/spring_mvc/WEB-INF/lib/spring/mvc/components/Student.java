package spring.mvc.components;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {

	private String country;
	private String firstName;
	private String lastName;
	private String favoriteLanguage;
	private Map<String, String> countryOptions;

	private String[] operationSystem;
	public Student() {
		countryOptions = new LinkedHashMap<>();

		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States");
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String[] operationSystem) {
		this.operationSystem = operationSystem;
	}
}
