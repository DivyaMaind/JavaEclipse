package com;
import java.util.*;

public class Demo3 {

     public static void main(String[] args) {
        
         //LinkedList al= new LinkedList();
         //set
    	 //HashSet al=new HashSet<>();
    	 //LinkedHashSet al = new LinkedHashSet<>();
    	 TreeSet al = new TreeSet();
         
         al.add(100);
         al.add(200);
         al.add(300);
         al.add(400);
         al.add(500);
         al.add(700);
         al.add(700);
         al.add(600);
         //al.add("ABC");
         //al.add("XYZ");
         //al.add("DEF");
        
         Iterator i=al.iterator(); 
         while(i.hasNext()) {
             System.out.println(i.next());
         }     
     }
}

//list                               sets

//duplicates                      not allow
//will maintain the order     hash set no order
//                            linked hashset no dup + user enter order
//                            no dup + sorted order