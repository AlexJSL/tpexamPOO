package entreprise;

import materiel.Empruntable;
import materiel.Emprunteur;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Administrateur extends Employe {

    public Administrateur(Agence a, Entreprise e) {
        super(a, e);
    }

    public void attribuerMateriel(Empruntable e, Emprunteur m) {
        m.ajouterAuStock(e);
    }

    public void recupererMateriel(Empruntable e, Emprunteur m) {
        if (m.perdreMateriel(e)) {
            this.stock.add(e);
        }
    }

    public List<Empruntable> stockEntreprise() {
        return this.entreprise.listeMateriel();
    }

    public List<Empruntable> stockAgence() {
        return this.agence.listeMateriel();
    }

    public void transfererMateriel(Emprunteur source, Empruntable materiel, Emprunteur cible) {
        if (materiel.isLimitationPretAuxAgences()) {
            if (cible instanceof Agence) {

                if (source.perdreMateriel(materiel)) {
                    attribuerMateriel(materiel, cible);
                }
            }
        } else {
            if (source.perdreMateriel(materiel)) {
                attribuerMateriel(materiel, cible);
            }
        }

    }
    
    public void supprimerMaterielDefectueuxEntreprise() {
        
    	supprimerMaterielDefectueuxDe(entreprise, this.entreprise.listeMateriel());
    }

    public void supprimerMaterielDefectueuxAgence() {
        supprimerMaterielDefectueuxDe(this.agence, this.agence.listeMateriel());
    }

    private void supprimerMaterielDefectueuxDe(Emprunteur emprunteur, List<Empruntable> empruntables) {
        List<Empruntable> toRemove = new ArrayList<Empruntable>();
        Iterator<Empruntable> ite = empruntables.iterator();

        while (ite.hasNext()) {
            Empruntable emp = ite.next();
            if (emp.isDefectueux()) {
                toRemove.add(emp);
            }
        }

        for (Empruntable emp : toRemove) {
            // On le récupère dans la liste de l'admin, et il le supprime
            this.transfererMateriel(emprunteur, emp, this);
            this.supprimerMateriel(emp);
        }
    }

    private void supprimerMateriel(Empruntable aSupprimer) {
        this.stock.remove(aSupprimer);
    }

    public void supprimerMaterielDefectueuxAgence(Agence a2) {
        supprimerMaterielDefectueuxDe(a2, a2.listeMateriel());
    }
}
