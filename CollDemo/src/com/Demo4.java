package com;

import java.util.*;

public class Demo4 {

     public static void main(String[] args) {
        
      
    	  HashMap map= new HashMap<>();//no duplicates
    	 //LinkedHashMap map= new LinkedHashMap<>();//no dup +user enter order
    	 //TreeMap map = new  TreeMap<>();//no dup + sorted
    	 
         
         map.put(100,"Suresh");
         map.put(555,"Ramesh");
         map.put(666,"Abi");
         map.put(234,"Pratha");
         map.put(777,"mansi");
         map.put(666,"chandan");
        
        Set s =map.entrySet();
         Iterator i= s.iterator(); 
         while(i.hasNext()) {
             System.out.println(i.next());
         }     
     }
}
