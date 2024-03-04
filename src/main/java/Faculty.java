//subclass of Employee for faculty members
public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    //constructor
    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    //toString method
    public String toString() {
        return "Class: Faculty, Name: " + super.getName();
    }

    //accessors
    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    //mutators
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}