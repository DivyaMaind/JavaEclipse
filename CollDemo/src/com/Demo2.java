package com;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.Iterator;
import java.util.Date;

public class Demo2 {
     public static void main(String[] args) {
         //ArrayList al = new ArrayList<>();
         // good for search application 
         // bad for insert and delete applications

         LinkedList al= new LinkedList();
         // good for add and deleted operion application 
         // bad for search appplication 

         //Vector al = new Vector<>(); legacy class : old class : 1995 , limeted methods 
         //Stack al = new Stack<>();

         al.add(100);
         al.add(200);
         al.add("Abc");
         al.add(3, "Thanesh");
         al.add(true);
         al.add(new Date());
         al.add(600);
         //al.addFirst(11111111);
         //al.addLast(9999);

 

         Iterator i=al.iterator(); 

         while(i.hasNext()) {

             System.out.println(i.next());
         }     
     }

}