//subclass of Person for employees and parent class of Faculty and Staff
public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    //constructor
    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    //toString method
    public String toString() {
        return "Class: Employee, Name: " + super.getName();
    }

    //accessors
    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    //mutators
    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }
}