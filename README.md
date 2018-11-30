# tpexamPOO


Ce dossier comporte le projet maven du TP examen de POO. 
Cependant, suite à un erreur de manipulation, j'ai perdu tout mon travail. 
Ainsi, le projet "tpnote" ici présent est celui du professeur Monsieur Thibault SMITH.


Etape 15 : Réponse aux questions 

a) et b) : Modification de la classe Groupe pour que='elle soit utilisable par la méthode main (voir FIGURE 1: méthode main)
public class Groupe {
  private List < Integer > liste = new ArrayList <Integer>() ;
  private Integer repere ;
  
  public Groupe (String str) {
    Integer r = (Integer) str;
    repere = r;
  }
  public void setMembre (String str) {
    Integer m = (Integer)str;
    liste .add(m);
  }
  public void afficher () {
    for ( Integer membre : liste ) {
      if( this . isCorrect ( membre )) {
        System .out . println ( membre );
      }
    }
   }
  private boolean isCorrect ( Integer membre ) {
    return (( membre != null ) && (membrecompareTo(repere)>0);
  }
}

FIGURE 1 : méthode main
public static void main ( String [] args ) {
  Groupe groupe1 = new Groupe ("2");
  groupe1 . setMembre ("3");
  groupe1 . setMembre ("2");
  groupe1 . setMembre ("1");
  groupe1 . afficher ();
}


d)

e) Artifactory 

