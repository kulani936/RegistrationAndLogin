/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.messagereport0;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class MessageReport0 {
    static String[] senders = {"Kulani", "Kulani"};
    
    static String[] recipients = {"Mike", "Sarah"};
    
    static String[] messages = {"Hi Mike", "This is a longer message for testing"};
    
    static String[] ids = {"ID001", "ID002"};
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("STORED MESSAGE MENU");
        
        System.out.println("a) Display Sender & Recipient");
        
        System.out.println("b) Display Longest Message");
        
        System.out.println("c) Search Message ID");
        
        System.out.println("d) Search Recipient");
        
        System.out.println("e) Delete Message Using Hash");
        
        System.out.println("f) Full Report");
        
        System.out.print("Select option: ");
        
        String choice = input.nextLine().toLowerCase();
        
        switch(choice){
            
           
            case "a":
                
                for(int i=0;i<senders.length;i++){System.out.println(senders[i]+" -> "+recipients[i]);}
                break;
                
            case "b":
                
                String longest=messages[0];
                for(int i=1;i<messages.length;i++){if(messages[i].length()>longest.length()){longest=messages[i];}}
                System.out.println("Longest: "+longest);
                break;
                
            case "c":
                
                System.out.print("Enter ID: ");
                String sID=input.nextLine();
                for(int i=0;i<ids.length;i++){if(ids[i].equals(sID)){System.out.println(messages[i]);}}
                break;
                
            case "d":
                
                System.out.print("Enter Recipient: ");
                String rec=input.nextLine();
                for(int i=0;i<recipients.length;i++){if(recipients[i].equalsIgnoreCase(rec)){System.out.println(messages[i]);}}
                break;
                
            case "e":
                
                System.out.print("Enter ID to delete: ");
                String d=input.nextLine();
                System.out.println("Deleted "+d+" - ST10543183");
                break;
                
            case "f":
                
                System.out.println("FULL REPORT - ST10543183");
                for(int i=0;i<messages.length;i++){System.out.println(ids[i]+" | "+senders[i]+" to "+recipients[i]+" : "+messages[i]);}
                break;
        }
        input.close();
    }
}