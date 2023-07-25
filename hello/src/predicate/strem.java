package predicate;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class strem {
    public static void main(String[] args) {
//        Predicate<Integer> predicate=t->t%2==0;
        List<Integer> a= Arrays.asList(1,2,3,4,5);
        a.stream().filter(t->t%2==0).forEach(t-> System.out.println("Even"+t));

    }
}
