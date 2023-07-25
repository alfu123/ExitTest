package predicate;

import java.util.*;

public class Supplier {
    public static void main(String[] args) {
//        List<String> s= Arrays.asList("b","a");
//        System.out.println(s.stream().findAny().orElseGet(()->"hi jbva"));

//        List<String> st=new ArrayList<>();
//        st.add("alf");
//        st.add("sho");
//        st.add("faiz");
//        st.stream().filter(s-> s.startsWith("s")).forEach(t-> System.out.println(t));

        Map<Integer,String> ma=new HashMap<>();
        ma.put(1,"a");
        ma.put(2,"b");
        ma.put(3,"c");
        ma.put(4,"d");
        ma.entrySet().stream().filter(t->t.getKey()%2==0).forEach(t-> System.out.println(t.getValue()));
    }
}
