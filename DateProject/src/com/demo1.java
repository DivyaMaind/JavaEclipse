package com;

import java.util.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
class A {

    A() {

        Date d = new Date();
        System.out.println(d);
        
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("Tommorow is : "+tomorrow);
        
        DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();

        int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();
    }
}

class demo1 {

    public static void main(String[] args) {
        A a = new A();
    }
}
