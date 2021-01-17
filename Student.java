package StudentManagementSystem;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 70000;
    private static int id = 2000;

    // Constructor: Prompt user to enter student,s name and year
    public Student() {
        Scanner in = new Scanner(System.in);// TO accept input from user
        System.out.println("Enter Student FirstName: ");
        this.firstName = in.nextLine();


        System.out.println("Enter Student lastName");
        this.lastName = in.nextLine();

        System.out.println("1 - Fresher\n2 - Returning\nEnter Student Class level: ");
        this.gradeYear = in.nextInt();

        setStudentId();
        //System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }

    // Generate an ID

    public void setStudentId() {
        // Grade level + ID
        id++;
        this.studentID = gradeYear + " " + 2000;
    }


    // Enroll In Course
    public void enroll() {

        // Get inside a loop, user hits@
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                //System.out.println("BREAK!");
                break;
            }
        }
            while (1 != 0) ;
           // System.out.println("ENROLLED IN: " + courses);
        }

        //View Balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    // Pay Tuition
    public void  payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $ " + payment);
        viewBalance();
    }

    // Show status
    public String toString(){
        return "Name: " + firstName + "" + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudentID: " + studentID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance;
    }

}

