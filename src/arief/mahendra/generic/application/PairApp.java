package arief.mahendra.generic.application;

import arief.mahendra.generic.Pair;

public class PairApp {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>();
        pair.setFirst("Arief");
        pair.setSecond(12345);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }


}
