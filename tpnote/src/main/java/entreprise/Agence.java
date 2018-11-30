package entreprise;

import materiel.Emprunteur;

import java.util.ArrayList;
import java.util.List;

public class Agence extends Emprunteur {

    private List<Employe> employes;
    private String nom;

    public Agence(String nomAgence) {
        super();
        this.employes = new ArrayList<Employe>();
        this.nom = nomAgence;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }
}
