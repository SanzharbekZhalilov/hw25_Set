import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        System.out.println("------------------");
        System.out.println("Symmetric Difference: " + symmetricDifference(set1, set2));
        System.out.println("Set1: " + set1 + " //Методко параметр катары берилген setтерди өзгөртүүгө жол берилбейт");
        System.out.println("Set2: " + set2 + " //Методко параметр катары берилген setтерди өзгөртүүгө жол берилбейт");
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> intersec = new HashSet<>(set1);
        intersec.retainAll(set2);

        Set<Integer> symDif = new HashSet<>(set1);
        symDif.addAll(set2);
        symDif.removeAll(intersec);
        return symDif;
    }
}