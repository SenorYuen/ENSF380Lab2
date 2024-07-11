package ENSF380Lab2;

public class Employee {
    private String employeeName;
    private int employeeId;
    private int managerId;
    private Employee[] supervisedEmployees;

    // Constructor for employee
    public Employee(String name, int employeeId) {
        this.employeeName = name;
        this.employeeId = employeeId;
        this.supervisedEmployees = new Employee[0]; 
    }

    // Constructor for manager 
    public Employee(String name, int employeeId, int managerID) throws InvalidIdException {
        if (employeeId <= 0) {
            throw new InvalidIdException("Invalid Employee ID");
        }
        this.employeeName = name;
        this.employeeId = employeeId;
        this.managerId = managerID;
        this.supervisedEmployees = new Employee[0]; 
    }

    // Getter and Setter for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Getter and Setter for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter and Setter for managerId
    public int getManagerID() {
        return managerId;
    }

    public void setManagerID(int managerID) {
        this.managerId = managerID;
    }

    // Getter for supervisedEmployees and method to add a new supervised employee
    public Employee[] getSupervisedEmployees() {
        return supervisedEmployees;
    }

    public void addSupervisedEmployee(Employee newEmployee) {
        // Create a new array with increased size
        Employee[] newSupervisedEmployees = new Employee[supervisedEmployees.length + 1];
        // Copy existing employees to the new array
        System.arraycopy(supervisedEmployees, 0, newSupervisedEmployees, 0, supervisedEmployees.length);
        // Add the new employee at the end
        newSupervisedEmployees[supervisedEmployees.length] = newEmployee;
        // Update the supervisedEmployees array
        supervisedEmployees = newSupervisedEmployees;
    }
}
