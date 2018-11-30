# tpexamPOO


Ce dossier comporte le projet maven du TP examen de POO. 
Cependant, suite à un erreur de manipulation lors du passage vers github, j'ai perdu tout mon travail (il ne fallait pas cliquer sur "Also delete working tree" ... je le saurai à présent !)
Ainsi, le projet "tpnote" ici présent est celui du professeur Monsieur Thibault SMITH, qui me l'a accordé en échange des 3/4 des points sur la partie développement.
La seule modification apportée à ce projet est le dépôt sur mon github depuis eclipse.


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


d)Annotations pour Hibernate :
- @Id
- @OneToMany
- @JoinColumn 
- @Entity
- @Version
- @GeneratedValue
- @Column

e) Artifactory est un produit de JFrog qui est un gestionnaire de dépôts d'objets binaires, plus concrètement un système de gestion de logiciels. Il sert de référentiel universel, afin d'avoir une base commune et ce pour des équipes de développement dispersées n'importe où dans le monde !
C'est un système universel, c'est à dire qu'il s'intègre à tous les outils de build.
Il peut fonctionner en multi-disponibilité (effectuer plusieurs push en parallèle), répliquer des artefacts en simultané vers plusieurs cibles,et il catalogue les package en méta données afin d'optimiser la qualité, la performance, et la sécurité des codes.


