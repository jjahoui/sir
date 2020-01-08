package jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Date {

private Long id;
private Utilisateur utilisateur;
private int annee;
private int mois;
private int jours;


public Date() {

}

public Date(Utilisateur utilisateur, int annee, int mois, int jours) {
	super();
	this.utilisateur = utilisateur;
	this.annee = annee;
	this.mois = mois;
	this.jours = jours;
}

@Id
@GeneratedValue
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public int getAnnee() {
	return annee;
}
public void setAnnee(int annee) {
	this.annee = annee;
}
public int getMois() {
	return mois;
}
public void setMois(int mois) {
	this.mois = mois;
}
public int getJours() {
	return jours;
}
public void setJours(int jours) {
	this.jours = jours;
}

@Override
public String toString() {
	return "Date [id=" + id + ", utilisateur=" + utilisateur + ", annee=" + annee + ", mois=" + mois + ", jours="
			+ jours + "]";
}



}
