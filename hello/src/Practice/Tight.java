package Practice;

import java.util.HashSet;
import java.util.Set;

public class Tight {
    String bankName;
    Set<Employee> emp;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Set<Employee> getEmp() {
        return emp;
    }

    public void setEmp(Set<Employee> emp) {
        this.emp = emp;
    }

    public Tight(String bankName) {
        this.bankName = bankName;

    }
}
class Employee{
    String empName;

    public Employee(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
class GFG{
    public static void main(String[] args) {
        Employee emp=new Employee("prakhar");
        Employee emp1=new Employee("prak");
        Tight bank=new Tight("hdfc");
        Set<Employee> em=new HashSet<>();
        em.add(emp);
        em.add(emp1);
        bank.setEmp(em);
        System.out.println(emp.getEmpName()+"     "+bank.getEmp());
    }
}

