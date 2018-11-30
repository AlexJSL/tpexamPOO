package materiel.implementation;

import materiel.Empruntable;

public class UC extends Empruntable {
    public UC() {
        super();
    }

    public UC(boolean limiteAgence) {
        super();
        this.limitationPretAuxAgences = limiteAgence;
    }
}
