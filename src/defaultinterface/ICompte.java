package defaultinterface;


public interface ICompte {

     int calculTauxCredit(int taux);


     default  void  calucluerSolde(){
         System.out.println("Calcul de solde commun entre tous types de Comptes");
     }

}
