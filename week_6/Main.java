public class Main {
    public static void main(String[] args) {
        // Create a lecturer instance using the expected output data
        Lecturer lecturer = new Lecturer(
            "L100", 
            "Dr Ahmad", 
            "Faculty of Information Technology", 
            "Java Programming"
        );

        // Display the inherited employee details along with the department
        lecturer.displayInfo();
        
        // Display the specific subject details
        lecturer.displaySubject();
    }
}