package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String companySuffix = "company.com";


//        Constructor to receive the first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(this.firstName + " " + this.lastName);

        // A method asking for the department...return the department
        this.department = setDepartment();
        //System.out.println("Department: " + this.department );

        // A method that return a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password is:" + this.password);

        //combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +  "." + companySuffix;
        //System.out.println("Your Email is: " + email);
    }


    //  Asking for the department
    public String setDepartment() {
        System.out.print("New worker:" + firstName + ",DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code: ");
         Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if(depChoice ==1) { return "sales";}
        else if (depChoice == 2)  {return "dev";}
        else if (depChoice == 3) {return "acct";}
        else  {return "";}
    }

    //Generating a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*+_-";
        char[]password = new char[length];
        for (int i = 0; i <length ; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    // Set the mailbox capacity

    public void setMailboxCapacity(int Capacity) {
        this.mailboxCapacity = Capacity;
    }

        // Set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change the Password

    public void ChangePassword(String password) {
        this.password = password;
    }

    //Getting method of mailbox, alternativeEmail, change Password
    public int getMailboxCapacity() {return mailboxCapacity;}
    public String getAlternateEmail() {return alternateEmail; }
    public String getPassword() {return password;}

    
    // Display to show user input...
    public String showinfo(){
        return "Display Name: " + firstName + " " + lastName +
                "\nCompany Email:" + email +
                "\nMailBox Capacity: " + mailboxCapacity + "mb";

    }
}
