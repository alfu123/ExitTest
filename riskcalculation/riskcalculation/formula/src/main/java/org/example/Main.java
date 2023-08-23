package org.example;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String,Integer> map= new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);

        for(Map.Entry<String,Integer> val : map.entrySet()){
            System.out.println(val.getKey());
            System.out.println(val.getValue());
        }

        Set<String> keySet=map.keySet();
     /*   for (String k:keySet) {
            System.out.println(k);
        }*/
        System.out.println(keySet);







    }
}
