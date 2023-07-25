package MapvsFlatmap;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Bifunc {

    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("basant",5000);
        map.put("sant",6000);
        map.put("nasant",7000);
        BiFunction<String,Integer,Integer> incsal=(key,value)->value+1000;
//        map.forEach(System.out::println).(replaceAll)->incsal;

    }
}
