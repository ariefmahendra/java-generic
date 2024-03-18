package arief.mahendra.generic.application;

import arief.mahendra.generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"eko", "budi", "joko"};
        Integer[] numbers =  { 1, 2, 3, 4, 5};

        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.count(numbers));
    }
}
