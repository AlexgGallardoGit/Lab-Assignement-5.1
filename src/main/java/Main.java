import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //create a scanner object
        Scanner sc = new Scanner(System.in);
        while (true) {
            //prompt the user to enter their desired question
            System.out.println("Menu:");
            System.out.println("1) Question 1");
            System.out.println("2) Question 2");
            System.out.println("3) Exit");
            System.out.print("Make your choice: ");
            int choice = checkPositiveInteger(sc.nextLine());
            //run what they chose
            switch (choice) {
                case -1:
                    System.out.println();
                    break;
                case 1:
                    System.out.println();
                    q1();
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    q2();
                    System.out.println();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println(choice + " is not a valid option!");
                    System.out.println();
            }
        }
    }

    //question 1
    public static void q1(){
        Scanner sc = new Scanner(System.in);
        //create a triangle object
        Triangle tri = new Triangle();
        //create a boolean to store if it is a valid triangle or not
        boolean  validTriangle = false;
        while (!validTriangle) {
            System.out.println("Enter the 3 sides of the triangle");
            do {
                System.out.print("Side 1: ");
                tri.setSide1(checkPositiveDouble(sc.nextLine()));
            } while (tri.getSide1() < 0);
            do {
                System.out.print("Side 2: ");
                tri.setSide2(checkPositiveDouble(sc.nextLine()));
            } while (tri.getSide2() < 0);
            do {
                System.out.print("Side 3: ");
                tri.setSide3(checkPositiveDouble(sc.nextLine()));
            } while (tri.getSide3() < 0);
            //validate the sides to ensure they are from a triangle
            if (tri.getSide1() + tri.getSide2() > tri.getSide3() &&
                    tri.getSide1() + tri.getSide3() > tri.getSide2() &&
                    tri.getSide2() + tri.getSide3() > tri.getSide1()) {
                validTriangle = true;
            } else {
                System.out.println("Invalid triangle sides!\nThe sum of the lengths of any two sides must be greater than the length of the remaining side.");
            }
        }
        System.out.print("What is the color of the triangle: ");
        tri.setColor(sc.nextLine().trim());
        while(true) {
            System.out.print("Is the triangle filled(true or false): ");
            String filled = sc.nextLine().trim().toLowerCase();
            if (filled.equals("true")) {
                tri.setFilled(true);
                break;
            } else if (filled.equals("false")) {
                tri.setFilled(false);
                break;
            }
            else {
                System.out.println("Invalid Input!\nPlease enter true or false");
            }
        }
        //display the info on the triangle
        System.out.println("Triangle: area = " + tri.getArea() + " perimeter = " + tri.getPerimeter() + " color: " + tri.getColor() + " filled: " + tri.isFilled());
    }
    //question 2
    public static void q2(){
        //create a Person object
        Person person = new Person("Jhon", "1233 Baker Street", "514-297-1548", "jhon@somemail.com");
        //create a Student
        Student student = new Student("Bob", "2342 Maple Street", "514-297-1548", "bob@somemail.com", Student.FRESHMAN);
        //create a MyDate instance for the date hired
        MyDate dateHired = new MyDate(1, 1, 2020);
        //create an Employee object
        Employee employee = new Employee("Norman", "3453 Cedar Street", "514-297-8461", "norman@somemail.com", "Office 1", 50000, dateHired);
        //create a Faculty object
        Faculty faculty = new Faculty("Emily", "4561 Water Street", "514-297-1346", "emily@somemail.com", "Office 2", 60000, dateHired, "9am-5pm", "Professor");
        //create a Staff object
        Staff staff = new Staff("George", "5637 Lava Street", "514-297-4354", "george@somemail.com", "Office 3", 40000, dateHired, "Administrator");

        //print the strings using their toString()
        System.out.println(person.toString()); //display Person's details
        System.out.println(student.toString()); //display Student's details
        System.out.println(employee.toString()); //display Employee's details
        System.out.println(faculty.toString()); //display Faculty's details
        System.out.println(staff.toString()); //display Staff's details
    }
    //check if the input is a positive integer
    public static int checkPositiveInteger(String input) {
        //check if the input string is null or empty
        if (input == null || input.isEmpty()) {
            return -1;
        }
        //trim the string
        input = input.trim();
        //check each character of the string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            //check if the character is not a digit
            if (!Character.isDigit(c)) {
                System.out.println("Enter a positive Integer!");
                return -1;
            }
        }
        return Integer.parseInt(input);
    }
    //check if the value is a positive double
    public static double checkPositiveDouble(String input) {
        //check if the input string is null or empty
        if (input == null || input.isEmpty()) {
            return -1;
        }
        double number = 0.0;
        boolean decimalPointFound = false;
        double decimalMultiplier = 0.1;
        //check if the character is a digit and add up the values
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            //check if the character is a digit
            if (Character.isDigit(c)) {
                //if the decimal point is found add the digit to the decimal part
                if (decimalPointFound) {
                    number += (c - '0') * decimalMultiplier;
                    decimalMultiplier *= 0.1;
                } else {
                    //if the decimal point is not found yet add the digit to the integer part
                    number = number * 10 + (c - '0');
                }
                //check if the char is a decimal point
            } else if (c == '.') {
                decimalPointFound = true;
            } else {
                System.out.println("Enter a positive number!");
                return -1;
            }
        }
        return number;
    }
}
