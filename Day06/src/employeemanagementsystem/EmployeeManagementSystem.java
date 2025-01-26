package employeemanagementsystem;

import java.util.ArrayList;

class EmployeeManagementSystem{
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        FullTimeEmployee fulltime = new FullTimeEmployee(1, "Niraj", 1000, 100000);
        fulltime.assignedDepartment("HR");
        employees.add(fulltime);

        PartTimeEmployee parttime = new PartTimeEmployee(2, "Abhii", 100, 100, 10);
        parttime.assignedDepartment("Sales");
        employees.add(parttime);

        //Disply the employeeDetails
        for(Employee employee : employees){
            employee.displayDetails();
            System.out.println();
        }
    }
}
