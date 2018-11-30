package materiel;

public abstract class Empruntable {
    protected Integer id;
    protected boolean limitationPretAuxAgences;
    protected boolean defectueux;

    public Empruntable() {
        this.id = null;
        this.limitationPretAuxAgences = false;
        this.defectueux = false;
    }

    public void rendre(Empruntable e) {

    }

    public void declarerDefectueux() {
        this.defectueux = true;
    }

    public boolean isDefectueux() {
        return defectueux;
    }

    public boolean isLimitationPretAuxAgences() {
        return limitationPretAuxAgences;
    }

    public void setLimitationPretAuxAgences(boolean limitationPretAuxAgences) {
        this.limitationPretAuxAgences = limitationPretAuxAgences;
    }
}
