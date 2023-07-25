package MapvsFlatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDao {
    public static List<Customer> getdata(){
        return Stream.of(new Customer(1,"alfahad","alf@gmail.com", Arrays.asList("9875674","87987564")),
                (new Customer(2,"shobhit","sho@gmail.com",Arrays.asList("987678756,89764567"))),
                (new Customer(3,"faiz","faiz@gmail.com",Arrays.asList("86793456","92387456"))))
                .collect(Collectors.toList());
    }
}
