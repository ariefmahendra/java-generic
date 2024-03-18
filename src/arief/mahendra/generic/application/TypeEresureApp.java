package arief.mahendra.generic.application;

import arief.mahendra.generic.MyData;

public class TypeEresureApp {
    public static void main(String[] args) {
        MyData myData = new MyData("Eko");

        MyData<Integer> myData2 = (MyData<Integer>) myData;
        Integer data = myData2.getData();

        System.out.println(data);
    }
}
