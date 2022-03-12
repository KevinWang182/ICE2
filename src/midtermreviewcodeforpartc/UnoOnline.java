package midtermreviewcodeforpartc;

import java.util.Scanner;

/**
 * The signIn page for UnoOnline.
 * Takes in a user name and password and then
 * validates the password before creating a new user in the list
 * of possible users.
 */
public class UnoOnline 
{
    private User users[] = new User[100];//room for 100 online players!

    public static void main(String[] args) 
     {
       UnoOnline newPortal = new UnoOnline();
       newPortal.run();
    }
     /**
     * method that takes in the User's name and chosen password
     * and then continues prompting until the password is valid based on the
     * following two rules:
     * 1. The password must be at least length 8
     * 2. The password must contain at least one "special character"
     * 
     */
    private void run()
    {
        int userCount=0;//keep track of number of users for array
        
        User newUser = new User();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("please enter your desired user name:");
        newUser.setName(sc.next());
        
        while(true) {
            
            System.out.println("Please enter your desired password:");
            PasswordValidator pass = new PasswordValidator(sc.next());
            
            if(pass.validPass()) {
                newUser.setPassword(pass.getPassword());
                break;
            }
            
            System.out.println("Passwords must have at least 8 characters"
                    + "\nPasswords must have at least one special character");
        }
        
        users[userCount] = newUser;//add the new user to the user list
        userCount++;
        System.out.println("New User Added");
        System.out.println("UserName: " + newUser.getName());
        System.out.println("Password: just kidding can't show password");
    }//end run method
   
    
}//end class
