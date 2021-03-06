# Email Administration Project

Scenario: You are an IT Support Administrator Specialist and are charged with the task of creating email accounts for new hires.

---
Application should do following:

* Generate an email with the following syntax: Like this: firstname.lastname@department.company.com 
* Determine the department (sales, development, accounting) 
* Generate a random **String** password 
* Have set methods to change the password, set the mailbox capacity, and define an alternate email address.
* Have get methods to display the <b>name</b>, <b>email</b>, and <b> mailbox capacity</b>.	
* <b>NOTE:</b> We used new String(password) for converting char array to String.

  **For example:** 

 ```java
 char[] c1 = {'e', 'n', 'e', 's'};
 String s = new String(c1);
 System.out.println(s); // OUTPUT: enes
  ```
