/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

/**
 *
 * @author s
 */
public class Employe {
 private int id;
private String nom;
private String prenom;
public Employe(String nom, String prenom) {
this.nom = nom;
this.prenom = prenom;
}
public Employe(int id, String nom, String prenom) {
this.id = id;
this.nom = nom;
this.prenom = prenom;
}
public String getNom() {
return nom;
}
public String getPrenom() {
return prenom;
}
public int getId() {
return id;
}
public void setNom(String nom) {
this.nom = nom;
}
public void setPrenom(String prenom) {
this.prenom = prenom;
}   
}
