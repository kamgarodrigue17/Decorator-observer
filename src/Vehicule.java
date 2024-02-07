import java.util.ArrayList;

public class Vehicule extends Sujet {
 public String  name,marque,couleur, description;
 public int id;
 public double prix;



 
public Vehicule(String name, String marque, String couleur, String description, int id, double prix) {
    this.name = name;
    this.marque = marque;
    this.couleur = couleur;
    this.description = description;
    this.id = id;
    this.prix = prix;
    
}



@Override
public String toString() {
    return "Vehicule [name=" + name + ", marque=" + marque + ", couleur=" + couleur + ", description=" + description
            + ", id=" + id + ", prix=" + prix + "]";
}



public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
    this.notifie();
}
public String getMarque() {
    return marque;
   
}
public void setMarque(String marque) {
    this.marque = marque;
    this.notifie();
}
public String getCouleur() {
    return couleur;
    
}
public void setCouleur(String couleur) {
    this.couleur = couleur;
    this.notifie();
}
public String getDescription() {
    return description;
}
public void setDescription(String description) {
    this.description = description;
    this.notifie();
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public double getPrix() {
    return prix;
}
public void setPrix(double prix) {
    this.prix = prix;
    this.notifie();
} 
 
    
}
