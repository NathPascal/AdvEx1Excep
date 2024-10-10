package fr.fms.ExceptionCity; //1.2

public class City { 

	private String name;
	private String country;
	private int nbInhabitants;
	
	public City (String name, String country, int nbInhabitants) { //1.1
		this.name = name;
		this.country = country;
		this.nbInhabitants = nbInhabitants;
	}
	
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

	public int getNbInhabitants() {
		return nbInhabitants;
	}
	
	public void setNbInhabitants(int nbInhabitants) {
		this.nbInhabitants = nbInhabitants;
		if (nbInhabitants < 0) 
			throw new RuntimeException("le nombre ne peut pas être négatif");
		this.nbInhabitants = nbInhabitants;
	}
	
	public String toString(){
		return "name: " + getName() + "\t" +  //1.2
		"country: " + getCountry() + "\t" +
		"population: " + getNbInhabitants();
	}
}
		