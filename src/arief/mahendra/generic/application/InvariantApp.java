package arief.mahendra.generic.application;

import arief.mahendra.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Hello");
        // doIt(stringMyData); // akan terjadi error
    }

    public static void doIt(MyData<Object> myData) {
        // do anything
    }
}
