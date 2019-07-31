package functional.interfafce;

import stream.Personne;

import java.util.function.Function;
import java.util.function.Predicate;

public class TestFunctionalInterface {

    public String transform1(Personne p){
        return p.getName();
    }

    public static void main(String[] args) {

        Personne p1 = new Personne(20,"Yousra");
        Function<Personne,String>  transform = (Personne p) -> p.getName().concat(" Boumaiza");

        Predicate<Personne> ouinon = (Personne p) -> p.getAge() > 20;

        //System.out.println(ouinon.test(p1));

        //System.out.println(transform.apply(p1));

        niceJava8(ouinon,transform,p1);


    }



    public static  void niceJava8 (Predicate<Personne> p , Function<Personne,String> f , Personne personne){
        System.out.println(p.test(personne));
        System.out.println(f.apply(personne));
    }
}
