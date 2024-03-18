package arief.mahendra.generic.application;

import arief.mahendra.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<String>("Hello World"));
        print(new MyData<Integer>(100));
    }

    public static void print(MyData<?> myData){
        System.out.println(myData.getData());
    }
}
