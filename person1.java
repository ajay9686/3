package Ajay33;

public class person1 {

    public static void main (String[] args) {
        // Hardcoded input using constructors
        String name = "JEEVIKA";
        String dob = "2005-05-04"; 
        int empId = 8800;
        double salary = 12345.50;
        Employee emp = new Employee (name, empId, salary);
        emp.displayEmployeeDetails();
        emp.displayAge(dob);
    }
}




