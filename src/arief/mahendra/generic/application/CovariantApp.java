package arief.mahendra.generic.application;

import arief.mahendra.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Hello");
        process(stringMyData);
    }

    public static void process(MyData<? extends Object> myData){
        System.out.println(myData.getData());
    }
}
