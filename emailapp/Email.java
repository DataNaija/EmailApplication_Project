package emailapp;

import java.util.Map;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String userPassword;
    private String userEmail;
    private String alternateEmail;
    private int defaultPasswordLength = 8;
    private  String companyName = "dreambig.com";
    private int mailBoxCapacity = 1000;


    // Constructor
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Sample Email Created: " + this.firstName + " " + this.lastName);

        // calling a method asking for the department and return the department
        this.department = setDepartment();
       // System.out.println("Department: " + this.department);

        // calling a method that return a random password
        this.userPassword = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.userPassword);

        // Combine element to generate email
        userEmail = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyName;
        //System.out.println("Your email is: " +  this.userEmail);

    }

    // Ask for the department
    private String setDepartment() {
        System.out.print("List of Departments\n1 for DevOps\n2 for Human Resources\n3 for Sales\n4 for IT\n5 for Customer Service\n6 for Accounting\n0 for None\n Select your department: ");
        Scanner input = new Scanner(System.in);
        int choiceDepartment = input.nextInt();
        if (choiceDepartment == 1) {
            return "DevOps";
        } else if (choiceDepartment == 2) {
            return "Human Resources";
        } else if (choiceDepartment == 3) {
            return "Sales";
        } else if (choiceDepartment == 4) {
            return "IT";
        } else if (choiceDepartment == 5) {
            return "Customer Service";
        } else if (choiceDepartment == 6) {
            return "Accounting";
        } else {
            return " ";
        }
    }


    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] userPassword = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            userPassword[i] = passwordSet.charAt(rand);

        }
        return new String(userPassword);

    }

    // Set the mailbox capacity
    public void setMailBoxCapacity(int mailBoxCapacity){
        this.mailBoxCapacity = mailBoxCapacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }

    // Change the password
    public void changePassword(String userPassword){
        this.userPassword = userPassword;
    }

    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getUserPassword(){
        return userPassword;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + userEmail +
                "\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb";
    }


}


