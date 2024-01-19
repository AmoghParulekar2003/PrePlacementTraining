
class Employee{
    int eno,esal;
    String ename,city;
    void work(){
        System.out.println("Working...");
    }
    void getSalary(){
        System.out.println("Salary is: "+esal);
    }
    void addEmployee(){
        System.out.println("Adding Employee");
    }
}

class HR extends Employee{
    HR(){
        esal = 1000;
    }
    void work(){
        System.out.println("I am doing HR work...");
    }

    void showEmployee(){
        System.out.println("I am showing employee");
    }
}
public class P16 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.work();
        employee.getSalary();
        employee.addEmployee();

        HR hr = new HR();
        hr.work();
        hr.getSalary();
        hr.addEmployee();
        hr.showEmployee();
    }
}