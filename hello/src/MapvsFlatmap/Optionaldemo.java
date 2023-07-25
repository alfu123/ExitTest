package MapvsFlatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optionaldemo {
    public static void main(String[] args) {
//        Customer customer=new Customer(1,"aqil",null, Arrays.asList("98576898","98456743"));
//        Optional<String> opt=Optional.ofNullable(customer.getEmail());
//        System.out.println(opt.orElseGet(() -> "defaultemail"));
        System.out.println(getcustbyemail("sho@gmail.com"));
    }
    public static Customer getcustbyemail(String s){
        List<Customer> data = CustomerDao.getdata();
        return data.stream().filter(customer -> customer.getEmail().equals(s)).findAny().orElseGet(() -> null);
    }
}
