package defaultinterface;

public interface ICompte2 {

     default void calucluerSolde(){
         System.out.println("Calcul de solde commun entre tous types de Comptes");
     }

}
