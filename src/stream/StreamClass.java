package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClass {


    public static void main(String[] args) {

        Personne p1 = new Personne(15, "Chaima");
        Personne p2 = new Personne(55, "Nesrine");

        List<Personne> personnes = new ArrayList<>();
        List<Personne> personnes2 = new ArrayList<>();

        personnes.add(p1);
        personnes.add(p2);

        // java 7 , OLD way

        for (Personne p : personnes) {
            if (p.getAge() > 15) {
                System.out.println(p.getName());
            }
        }

        // java 8 Stream en utilisant l'operateur filter <Predicate>

        personnes.stream().filter(x -> x.getAge() > 15).forEach(x -> System.out.println(x.getName()));
        personnes2 = personnes.stream().filter(x -> x.getAge() > 15).collect(Collectors.toList());


        // java 8 Stream en utilisant l'operateur map <Function>

        personnes.stream().filter(p -> p.getAge() > 15)
                .map(p -> p.getAge() * 2).forEach(System.out::println);


    }
}
