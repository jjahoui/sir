package jpa;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Pause extends Date{
	private List<String> preferenceAlimentaire;
	private List<String> allergies;
	
	
	public Pause() {
		super();
	}


	public Pause(List<String> preferenceAlimentaire, List<String> allergies) {
		super();
		this.preferenceAlimentaire = preferenceAlimentaire;
		this.allergies = allergies;
	}


	public List<String> getPreferenceAlimentaire() {
		return preferenceAlimentaire;
	}


	public void setPreferenceAlimentaire(List<String> preferenceAlimentaire) {
		this.preferenceAlimentaire = preferenceAlimentaire;
	}


	public List<String> getAllergies() {
		return allergies;
	}


	public void setAllergies(List<String> allergies) {
		this.allergies = allergies;
	}


	@Override
	public String toString() {
		return "Pause [preferenceAlimentaire=" + preferenceAlimentaire + ", allergies=" + allergies + "]";
	}
	

}
