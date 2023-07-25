package Stream;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    public static List<Employee> getEmployee(){
        List<Employee> emp=new ArrayList<>();
        emp.add(new Employee(1,"alfahad","IT",45000));
        emp.add(new Employee(2,"shobhit","HR",55000));
        emp.add(new Employee(3,"Faiz","Product",65000));
        emp.add(new Employee(4,"aqil","Sales",50000));
        return emp;
    }
}
