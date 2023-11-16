package views;

import collections.ArrayListCollection;

public class ArrayListView {

    public ArrayListView(){

    }
    public static void writeArrayList(ArrayListCollection arrayListCollection){
//        for(int i = 0; i < arrayListCollection.length(); i++){
//            System.out.println(arrayListCollection);
//    }
        System.out.println(arrayListCollection.readAll());
}
}

