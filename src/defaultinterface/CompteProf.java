package defaultinterface;

public class CompteProf implements ICompte,ICompte2 {


    @Override
    public int calculTauxCredit(int taux) {
    return 0;
    }

    @Override
    public void calucluerSolde(){
        System.out.println("new Implementation");
    }

}
