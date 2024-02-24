package models;

public class EmployeeInformationManagementWithDatatables {
    //employeeID	firstName	lastName	department	position	salary
    //101	            John	Smith	    Sales	 Sales Associate	$60,000

    private int employeeID;
    private String firstName;
    private String lastName;
    private String department;
    private String position;
    private double salary;

    public EmployeeInformationManagementWithDatatables(int employeeID, String firstName, String lastName, String department, String position, double salary) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
