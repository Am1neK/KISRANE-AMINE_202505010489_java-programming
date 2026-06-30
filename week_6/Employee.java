public class Employee {
    
    protected String id;
    protected String name;
    // Activity 2.1: Add another variable (Department)
    protected String department;

    // Constructor
    public Employee(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Employee ID : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
    }
}