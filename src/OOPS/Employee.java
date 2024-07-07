package OOPS;

public class Employee {
    int employeeId;

    Employee(int id){
        employeeId = id;
    }

    public static void main(String[] args) {
        Employee obj = new Employee(10);
        System.out.println(obj.employeeId);
    }



}
