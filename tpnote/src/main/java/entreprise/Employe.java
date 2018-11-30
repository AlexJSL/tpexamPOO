package entreprise;

import materiel.Emprunteur;

public class Employe extends Emprunteur {

    protected Agence agence;
    protected Entreprise entreprise;

    public Employe(Agence a, Entreprise e) {
        this.agence = a;
        this.entreprise = e;
    }
}
