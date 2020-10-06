/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcs;

import java.util.Scanner;

/**
 *
 * @author Wilhit
 */
public class PCS {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        PointCalculation pc = new PointCalculation();
        String learnerID;
        int password, choice;
        
        System.out.println("******************************************");
        System.out.println("*             WELCOME TO PCS             *");
        System.out.println("******************************************");
        System.out.println();
        input.useDelimiter("\n");
        System.out.println("Please Login");
        System.out.print("Learner ID: ");
        learnerID = input.next();
        System.out.print("Password: ");
        try {
            password = input.nextInt();
        }
        catch(Exception e){
            System.out.println("The Password should be a digit");
            System.out.println();
            System.out.print("System Exiting.");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            System.exit(0);
        }
        if (learnerID.equalsIgnoreCase(" ")) {
            System.out.println("The Learners ID cannot be empty");
            System.out.println();
            System.out.print("System Exiting.");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            System.exit(0);
        }
        else {
            System.out.println();
            System.out.print("Loading.");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            System.out.println();
            System.out.println("******************************************");
            System.out.println("*                PCS MENU                *");
            System.out.println("******************************************");
            System.out.println();
            System.out.println("1. Calculate Points");
            System.out.println("2. Exit");
            System.out.print("Select your Choice: ");
            choice = input.nextInt();
            switch(choice) {
                case 1:
                    pc.PointCalculation();
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice");
                    System.out.println();
                    System.out.print("System Exiting.");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                    System.exit(0);
            }
            
        }
        
    }

    
}
