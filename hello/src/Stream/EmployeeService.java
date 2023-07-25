package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
    public static EmployeeDao empdao;
    public static List<Employee> getEmpwith(Integer id){
        List<Employee> l=empdao.getEmployee().stream().filter(t->t.getId()==id).collect(Collectors.toList());
        return l;
    }

    public static void main(String[] args) {

        System.out.println(getEmpwith(4));
    }
}
