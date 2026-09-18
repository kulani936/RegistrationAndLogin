/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.registrationandlogin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginIT {
    
    public LoginIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "kyl_1";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Selena@90";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String phone = "+27838968976";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkCellPhoneNumber(phone);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "kyl_1";
        String password = "Selena@90";
        String phone ="+27838968976" ;
        Login instance = new Login();
        String expResult ="User is successfully registered";
        String result = instance.registerUser(username, password, phone);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String storedUsername = "kyl_1";
        String storedPassword = "Selena@90";
        String enteredUsername = "kyl_1";
        String enteredPassword = "Selena@90";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginUser(storedUsername, storedPassword, enteredUsername, enteredPassword);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean loginStatus = true;
        String firstName = "kulani";
        String lastName = "ndlovu";
        Login instance = new Login();
        String expResult = "Welcome kulani ndlovu, it is great to see you again.";
        String result = instance.returnLoginStatus(loginStatus, firstName, lastName);
        assertEquals(expResult, result);
        
    }
    
}
