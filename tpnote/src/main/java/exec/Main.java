package exec;

import entreprise.Administrateur;
import entreprise.Agence;
import entreprise.Employe;
import entreprise.Entreprise;
import materiel.Empruntable;
import materiel.implementation.Clavier;
import materiel.implementation.Ecran;
import materiel.implementation.Souris;
import materiel.implementation.UC;

public class Main {

    public static void main(String[] args) {
        System.out.println("SAlut");

        Entreprise e = new Entreprise("Salut les Cocoricos");
        Agence a1 = new Agence("Agence du Sud");
        Agence a2 = new Agence("Agence du Nord");

        e.getAgences().add(a1);
        e.getAgences().add(a2);

        Empruntable e1 = new UC(true);
        Empruntable e2 = new Ecran();
        Empruntable e3 = new Souris();
        Empruntable e4 = new Clavier();
        Empruntable e5 = new Clavier();
        Empruntable e6 = new Ecran();

        e.ajouterAuStock(e1);
        e.ajouterAuStock(e2);
        e.ajouterAuStock(e3);
        e.ajouterAuStock(e4);
        e.ajouterAuStock(e5);
        e.ajouterAuStock(e6);


        Employe admin = new Administrateur(a1, e);
        Employe emp1 = new Employe(a1, e);
        Employe emp2 = new Employe(a1, e);
        Employe emp3 = new Employe(a2, e);
        Employe emp4 = new Employe(a2, e);

        a1.getEmployes().add(admin);
        a1.getEmployes().add(emp1);
        a1.getEmployes().add(emp2);

        a2.getEmployes().add(emp3);
        a2.getEmployes().add(emp4);

        ((Administrateur) admin).transfererMateriel(e, e1, admin);
        ((Administrateur) admin).transfererMateriel(e, e2, admin);
        ((Administrateur) admin).transfererMateriel(e, e3, admin);
        ((Administrateur) admin).transfererMateriel(e, e4, admin);
        ((Administrateur) admin).transfererMateriel(e, e6, a2);

        ((Administrateur) admin).transfererMateriel(admin, e1, a1);
        ((Administrateur) admin).transfererMateriel(e, e1, a2);


        e5.declarerDefectueux();
        e6.declarerDefectueux();

        ((Administrateur) admin).supprimerMaterielDefectueuxEntreprise();
        ((Administrateur) admin).supprimerMaterielDefectueuxAgence(a2);

        System.out.println("Goodbye");
    }
}
