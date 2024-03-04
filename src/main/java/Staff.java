//subclass of Employee for staff members
public class Staff extends Employee {
    private String title;

    //constructor
    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    //toString method
    public String toString() {
        return "Class: Staff, Name: " + super.getName();
    }

    //accessors
    public String getTitle() {
        return title;
    }

    //mutators
    public void setTitle(String title) {
        this.title = title;
    }
}