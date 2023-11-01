package org.example;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
       //Create an instance of that class
        LinkedList<String> list=new LinkedList<>();


        //Append(add)
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        list.add("Pineapple");

        //Display all elements of a linkedList
        for(String item:list)
        {System.out.println(item);}

        //Remove(delete) items of a linked list
        list.remove("Orange");
        list.removeFirst();
        list.removeLast();
        System.out.println("Element after removing");
        for (String item:list)
        {System.out.println(item);}

        //Get method- Display an element at a particular index position
        String fruit=list.get(1);
        System.out.println("The fruit at index 1 is: "+fruit);

        //Check if LL is empty
        int size = list.size();
        System.out.printf("LL has %d items in \n",size);

        //Remove all elements(clear)
        list.clear();
        boolean m = list.isEmpty();
        System.out.println("After clear is list empty? "+m);


    }
}