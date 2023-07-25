package MapvsFlatmap;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Customermain {
    public static void main(String[] args) {
        List<Customer> cust =CustomerDao.getdata();
        cust.stream().filter(t->t.getEmail()
        		.equals("alf@gmail.com"))
        .collect(Collectors.toList())
        .forEach(Customer::getName);
//        cust.stream().map(t->t.getEmail()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
