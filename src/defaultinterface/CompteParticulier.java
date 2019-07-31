package defaultinterface;

public class CompteParticulier implements ICompte {


    @Override
    public int calculTauxCredit(int taux) {
        return 1;
    }
}
