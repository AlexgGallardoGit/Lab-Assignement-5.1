//subclass of Person for students
public class Student extends Person {
    public static final String FRESHMAN = "freshman";
    public static final String SOPHOMORE = "sophomore";
    public static final String JUNIOR = "junior";
    public static final String SENIOR = "senior";
    private String status;

    //constructor
    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    //toString method
    public String toString() {
        return "Class: Student, Name: " + super.getName();
    }

    //accessors
    public String getStatus() {
        return status;
    }

    //mutators
    public void setStatus(String status) {
        this.status = status;
    }
}