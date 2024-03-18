package arief.mahendra.generic.application;

import arief.mahendra.generic.MyData;

public class GenericClassApp {
    public static void main(String[] args) {

        var names = new MyData<String>("Aief Mahendra");
        String data = names.getData();
        System.out.println(data);

        MyData<Integer> myData = new MyData<Integer>();
        myData.setData(123456789);
        Integer numberValueOfData = myData.getData();
        System.out.println(numberValueOfData);

    }
}
