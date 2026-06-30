public class Lecturer extends Employee {

    private String subject;

    // Constructor
    public Lecturer(String id, String name, String department, String subject) {
        // Calls the parent (Employee) constructor
        super(id, name, department); 
        this.subject = subject;
    }

    public void displaySubject() {
        System.out.println("Subject     : " + subject);
    }
}