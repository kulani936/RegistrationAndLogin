/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationandlogin;
import java.util.Scanner;
/**
 *
 * @author Kulani
 */
public class RegistrationAndLogin {

    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in);
        
        System.out.println("Registration");
        
        System.out.print("Please enter your first name:");
        String firstName =
                
                input.nextLine();
        
        System.out.print("Please enter your last name:");
        String lastName =
                
                input.nextLine();
        
        System.out.print("Please enter your username:");
        String username =
                
                input.nextLine();
        
        System.out.print("Please enter your password:");
        String password =
                
                input.nextLine();
        
        System.out.print("Please enter your cellphone number:");
        String cellphoneNumber =
                    
                input.nextLine();
        
        Login user = new Login();
        
        boolean validUsername = 
                user.checkUserName(username);
        boolean validPassword = 
                user.checkPasswordComplexity(password);
        boolean validPhone =
                user.checkCellPhoneNumber(cellphoneNumber);


        if (validUsername) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted please ensure that your username contains an underscore and is no more than five characters in length.");
        }


        if (validPassword) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        }

        if (validPhone) {
            System.out.println("Phone number successfully captured.");
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
        }


        if (validUsername && validPassword && validPhone) {
            
            System.out.println("Registration successful.");
            
            System.out.println("LOGIN ");
            
            System.out.print("Enter Username: ");
            
            String enteredUsername = input.nextLine();
            
            System.out.print("Enter Password: ");
            
            String enteredPassword = input.nextLine();
            
            boolean loginStatus = 
                    user.loginUser(username, password,enteredUsername,enteredPassword);

            System.out.println( user.returnLoginStatus( loginStatus,firstName, lastName));


        input.close();
    }
    }
}