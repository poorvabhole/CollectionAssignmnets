package com.collectionpart2.questionseven.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sublist {
    public void userInput(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        String nextElement="";

        //input for list2
        do{
            System.out.println("Enter element for list 1");
            list1.add(scanner.nextInt());
            System.out.println("Do you want to add then type 'y' : ");
            nextElement=scanner.next();
        }
        while (nextElement.equalsIgnoreCase("y"));

        //input for list2
        do{
            System.out.println("Enter element for list 2");
            list2.add(scanner.nextInt());
            System.out.println("Do you want to add then type 'y' : ");
            nextElement=scanner.next();
        }
        while (nextElement.equalsIgnoreCase("y"));
        sublistOrNot(list1, list2);
    }
    private void sublistOrNot(List<Integer> list1, List<Integer> list2){
//        System.out.println(list2.retainAll(list1));
        if ( list1.containsAll(list2) && (list1.size() > list2.size()) )
        {
            System.out.println("List2 is sublist of list1");
        } else if (list2.containsAll(list1) && (list2.size() > list1.size()))
        {
            System.out.println("List1 is sublist of list2");
        } else if (list1.size()==list2.size() && list1.containsAll(list2) && list2.containsAll(list1))
        {
            System.out.println("List1 and List2 are equal");
        }else
        {
            System.out.println("List1 is not a superlist of, sublist of or equal to List2\n");
        }
    }
}
