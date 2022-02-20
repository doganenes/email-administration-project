package emailApp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "dgncompany.com";

    /**
     * Constructor receive the firstName and lastName
     *
     * @param firstName get the parameter
     * @param lastName  get the parameter
     */
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //  System.out.println("Email was created: " + this.firstName + " " + this.lastName);

        // Call the method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Call the method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Password: " + this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
        System.out.println("Your email is: " + email);
    }

    /**
     * Get the department name from the user
     *
     * @return department name.
     */
    private String setDepartment() {

        System.out.println("Enter the department code:\n1 for sales\n2 for Development\n3 for Accounting\n0 for none");

        Scanner scan = new Scanner(System.in);
        int departmentChoice = scan.nextInt();

        if (departmentChoice == 1) {
            return "Sales";
        }
        if (departmentChoice == 2) {

            return "Dev";
        }
        if (departmentChoice == 3) {
            return "Acct";
        } else {
            return "";
        }
    }

    /**
     * @param length default length.
     * @return the random password from the user.
     */
    private String randomPassword(int length) {

        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";

        char[] password = new char[length];

        for (int i = 0; i < password.length; i++) {

            int randomValue = (int) (Math.random() * passwordSet.length());

            password[i] = passwordSet.charAt(randomValue);
        }
        return new String(password); // char to String for the method
    }

    /**
     * Set the mailbox capacity.
     *
     * @param capacity
     */
    public void setMailboxCapacity(int capacity) {

        this.mailboxCapacity = capacity;
    }


    /**
     * Set the alternate email.
     *
     * @param altEmail
     */
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    /**
     * @param password new password with set methods.
     */
    public void setChangePassword(String password) {

        this.password = password;

    }

    // ** getter methods **

/**
 * we already called mailbox capacity in the showInfo() method.
 */ /*  public int getMailboxCapacity() {
        return mailboxCapacity;
    }*/

    /**
     * @return alternate email from the user.
     */
    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }


    public String showInfo() {

        return "Display name: " + firstName + " " + lastName + " Company Email: " + email + " Mailbox Capacity:" + mailboxCapacity + "mb";
    }


}
