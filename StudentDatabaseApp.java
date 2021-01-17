package StudentManagementSystem;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
//        Student stu1 = new Student();
//        stu1.enroll();
//        stu1.payTuition();
//       // stu1.showInfo();
//        System.out.println(stu1.toString());

        // Ask how many new student's we want to add
        System.out.println("Enter number of new student to enroll: ");
        Scanner in = new Scanner(System.in);// creating an array of object for student.
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];


        //Create n number of new students
        for (int n = 0; n <numOfStudents ; n++) {
            students[n] = new Student();//putting student inside an array
            students[n].enroll();
            students[n].payTuition();
            //System.out.println( students[n].toString());
        }
//        System.out.println(students[0].toString());
//        System.out.println(students[1].toString());
//        System.out.println(students[2].toString());

        for (int n = 0; n < numOfStudents; n++) {
            System.out.println(students[n].toString()); // to collect input of all users
        }

    }




}