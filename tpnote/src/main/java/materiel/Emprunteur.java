package materiel;

import java.util.ArrayList;
import java.util.List;

public class Emprunteur {
    protected List<Empruntable> stock;

    public Emprunteur() {
        this.stock = new ArrayList<Empruntable>();
    }

    public void ajouterAuStock(Empruntable e) {
        this.stock.add(e);
    }

    public List<Empruntable> listeMateriel() {
        return this.stock;
    }

    public boolean perdreMateriel(Empruntable e) {
        if (this.stock.contains(e)) {
            this.stock.remove(e);
            return true;
        } else {
            return false;
        }
    }
}
