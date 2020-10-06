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
public class PointCalculation extends PCS {
    
    Scanner input = new Scanner(System.in);
    String name, surName, gender, fullName;
    String subject1, subject2, subject3, subject4, subject5, subject6;
    String grade1, grade2, grade3, grade4, grade5, grade6;
    int value1 = 0, value2 = 0, value3 = 0, value4 = 0, value5 = 0, value6 = 0;
    int totalPoint1 = 0, totalPoint2 = 0, totalPoint3 = 0, totalPoint4 = 0, totalPoint5 = 0;
    String field1, field2;
    
    
    
    public void PointCalculation() throws InterruptedException {
        
        System.out.println("******************************************");
        System.out.println("*                   PCS                  *");
        System.out.println("******************************************");
        System.out.println();
        System.out.print("Enter learner's name and surname : ");
        name = input.next();
        surName = input.next();
        
        System.out.print("Enter learnr's gender : ");
        gender = input.next();
        
        if (gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("male")){
            gender = "Mr.";
        }
        else if (gender.equalsIgnoreCase("f") || gender.equalsIgnoreCase("female")){
            gender = "Mrs.";
        }
        else {
            gender = "Mr./Mrs.";
        }
        System.out.println("Enter 6 subjects followed by symbols : ");
        System.out.println("P.S. All Subjects Should be in one word use CamelCase if multiple word and Math for Mathematics");
        System.out.println();
        
        Insert();
        
        GradeCheck();
        
        Calculation();
        
        
        
        
    }
    
    public void Insert(){
        System.out.print("1. ");
        subject1 = input.next();
        grade1 = input.next();
        if(grade1.equalsIgnoreCase("A+") || grade1.equalsIgnoreCase("A") || grade1.equalsIgnoreCase("B") || grade1.equalsIgnoreCase("C") || grade1.equalsIgnoreCase("D") || grade1.equalsIgnoreCase("E") || grade1.equalsIgnoreCase("F") || grade1.equalsIgnoreCase("G") || grade1.equalsIgnoreCase("U") || grade1.equalsIgnoreCase("1") || grade1.equalsIgnoreCase("2") || grade1.equalsIgnoreCase("3") || grade1.equalsIgnoreCase("4")){
            grade1 = grade1;
        }
        else {
            System.out.println("Not a valid symbols [Symbols are A+ | A | B | C | D | E | F | G | 1 | 2 | 3 | 4 | U]");
            System.out.print("Please enter valid grade : ");
            grade1 = input.next();
        }
        System.out.print("2. ");
        subject2 = input.next();
        grade2 = input.next();
        if(grade2.equalsIgnoreCase("A+") || grade2.equalsIgnoreCase("A") || grade2.equalsIgnoreCase("B") || grade2.equalsIgnoreCase("C") || grade2.equalsIgnoreCase("D") || grade2.equalsIgnoreCase("E") || grade2.equalsIgnoreCase("F") || grade2.equalsIgnoreCase("G") || grade2.equalsIgnoreCase("U") || grade2.equalsIgnoreCase("1") || grade2.equalsIgnoreCase("2") || grade2.equalsIgnoreCase("3") || grade2.equalsIgnoreCase("4")){
            grade2 = grade2;
        }
        else {
            System.out.println("Not a valid symbols [Symbols are A+ | A | B | C | D | E | F | G | 1 | 2 | 3 | 4 | U]");
            System.out.print("Please enter valid grade : ");
            grade2 = input.next();
        }
        System.out.print("3. ");
        subject3 = input.next();
        grade3 = input.next();
        if(grade3.equalsIgnoreCase("A+") || grade3.equalsIgnoreCase("A") || grade3.equalsIgnoreCase("B") || grade3.equalsIgnoreCase("C") || grade3.equalsIgnoreCase("D") || grade3.equalsIgnoreCase("E") || grade3.equalsIgnoreCase("F") || grade3.equalsIgnoreCase("G") || grade3.equalsIgnoreCase("U") || grade3.equalsIgnoreCase("1") || grade3.equalsIgnoreCase("2") || grade3.equalsIgnoreCase("3") || grade3.equalsIgnoreCase("4")){
            grade3 = grade3;
        }
        else {
            System.out.println("Not a valid symbols [Symbols are A+ | A | B | C | D | E | F | G | 1 | 2 | 3 | 4 | U]");
            System.out.print("Please enter valid grade : ");
            grade3 = input.next();
        }
        System.out.print("4. ");
        subject4 = input.next();
        grade4 = input.next();
        if(grade4.equalsIgnoreCase("A+") || grade4.equalsIgnoreCase("A") || grade4.equalsIgnoreCase("B") || grade4.equalsIgnoreCase("C") || grade4.equalsIgnoreCase("D") || grade4.equalsIgnoreCase("E") || grade4.equalsIgnoreCase("F") || grade4.equalsIgnoreCase("G") || grade4.equalsIgnoreCase("U") || grade4.equalsIgnoreCase("1") || grade4.equalsIgnoreCase("2") || grade4.equalsIgnoreCase("3") || grade4.equalsIgnoreCase("4")){
            grade4 = grade4;
        }
        else {
            System.out.println("Not a valid symbols [Symbols are A+ | A | B | C | D | E | F | G | 1 | 2 | 3 | 4 | U]");
            System.out.print("Please enter valid grade : ");
            grade4 = input.next();
        }
        System.out.print("5. ");
        subject5 = input.next();
        grade5 = input.next();
        if(grade5.equalsIgnoreCase("A+") || grade5.equalsIgnoreCase("A") || grade5.equalsIgnoreCase("B") || grade5.equalsIgnoreCase("C") || grade5.equalsIgnoreCase("D") || grade5.equalsIgnoreCase("E") || grade5.equalsIgnoreCase("F") || grade5.equalsIgnoreCase("G") || grade5.equalsIgnoreCase("U") || grade5.equalsIgnoreCase("1") || grade5.equalsIgnoreCase("2") || grade5.equalsIgnoreCase("3") || grade5.equalsIgnoreCase("4")){
            grade5 = grade5;
        }
        else {
            System.out.println("Not a valid symbols [Symbols are A+ | A | B | C | D | E | F | G | 1 | 2 | 3 | 4 | U]");
            System.out.print("Please enter valid grade : ");
            grade5 = input.next();
        }
        System.out.print("6. ");
        subject6 = input.next();
        grade6 = input.next();
        if(grade6.equalsIgnoreCase("A+") || grade6.equalsIgnoreCase("A") || grade6.equalsIgnoreCase("B") || grade6.equalsIgnoreCase("C") || grade6.equalsIgnoreCase("D") || grade6.equalsIgnoreCase("E") || grade6.equalsIgnoreCase("F") || grade6.equalsIgnoreCase("G") || grade6.equalsIgnoreCase("U") || grade6.equalsIgnoreCase("1") || grade6.equalsIgnoreCase("2") || grade6.equalsIgnoreCase("3") || grade6.equalsIgnoreCase("4")){
            grade6 = grade6;
        }
        else {
            System.out.println("Not a valid symbols [Symbols are A+ | A | B | C | D | E | F | G | 1 | 2 | 3 | 4 | U]");
            System.out.print("Please enter valid grade : ");
            grade6 = input.next();
        }
        System.out.println();
        System.out.println("Field of Studies and their codes \n"
                + "Management Sciences : MS | Human Sciences : HS | Computing and Informatics : CI | Engineering Sciences : ES | "
                + "Health and Applied Sciences : HAS | Natural Resources and Spacial Sciences : NRSS");
        System.out.println();
        System.out.print("Field of study 1 : ");
        field1 = input.next();
        System.out.print("Field of study 2 : ");
        field2 = input.next();
    }
    
    public void GradeCheck() {
        
        //Ordinary Level A+
        if(grade1.equalsIgnoreCase("A+")){
            value1 = 8;
            grade1 = "A+";
        }
        if(grade2.equalsIgnoreCase("A+")){
            value2 = 8;
            grade2 = "A+";
        }
        if(grade3.equalsIgnoreCase("A+")){
            value3 = 8;
            grade3 = "A+";
        }
        if(grade4.equalsIgnoreCase("A+")){
            value4 = 8;
            grade4 = "A+";
        }
        if(grade5.equalsIgnoreCase("A+")){
            value5 = 8;
            grade5 = "A+";
        }
        if(grade6.equalsIgnoreCase("A+")){
            value6 = 8;
            grade6 = "A+";
        }
        
        //Ordinary Level A
        if(grade1.equalsIgnoreCase("A")){
            value1 = 7;
            grade1 = "A";
        }
        if(grade2.equalsIgnoreCase("A")){
            value2 = 7;
            grade2 = "A";
        }
        if(grade3.equalsIgnoreCase("A")){
            value3 = 7;
            grade3 = "A";
        }
        if(grade4.equalsIgnoreCase("A")){
            value4 = 7;
            grade4 = "A";
        }
        if(grade5.equalsIgnoreCase("A")){
            value5 = 7;
            grade5 = "A";
        }
        if(grade6.equalsIgnoreCase("A")){
            value6 = 7;
            grade6 = "A";
        }
        
        //Ordinary Level B
        if(grade1.equalsIgnoreCase("B")){
            value1 = 6;
            grade1 = "B";
        }
        if(grade2.equalsIgnoreCase("B")){
            value2 = 6;
            grade2 = "B";
        }
        if(grade3.equalsIgnoreCase("B")){
            value3 = 6;
            grade3 = "B";
        }
        if(grade4.equalsIgnoreCase("B")){
            value4 = 6;
            grade4 = "B";
        }
        if(grade5.equalsIgnoreCase("B")){
            value5 = 6;
            grade5 = "B";
        }
        if(grade6.equalsIgnoreCase("B")){
            value6 = 6;
            grade6 = "B";
        }
        
        //Ordinary Level C
        if(grade1.equalsIgnoreCase("C")){
            value1 = 5;
            grade1 = "C";
        }
        if(grade2.equalsIgnoreCase("C")){
            value2 = 5;
            grade2 = "C";
        }
        else if(grade3.equalsIgnoreCase("C")){
            value3 = 5;
            grade3 = "C";
        }
        if(grade4.equalsIgnoreCase("C")){
            value4 = 5;
            grade4 = "C";
        }
        if(grade5.equalsIgnoreCase("C")){
            value5 = 5;
            grade5 = "C";
        }
        if(grade6.equalsIgnoreCase("C")){
            value6 = 5;
            grade6 = "C";
        }
        
        //Ordinary Level D
        if(grade1.equalsIgnoreCase("D")){
            value1 = 4;
            grade1 = "D";
        }
        if(grade2.equalsIgnoreCase("D")){
            value2 = 4;
            grade2 = "D";
        }
        if(grade3.equalsIgnoreCase("D")){
            value3 = 4;
            grade3 = "D";
        }
        if(grade4.equalsIgnoreCase("D")){
            value4 = 4;
            grade4 = "D";
        }
        if(grade5.equalsIgnoreCase("D")){
            value5 = 4;
            grade5 = "D";
        }
        if(grade6.equalsIgnoreCase("D")){
            value6 = 4;
            grade6 = "D";
        }
        
        //Ordinary Level E
        if(grade1.equalsIgnoreCase("E")){
            value1 = 3;
            grade1 = "E";
        }
        if(grade2.equalsIgnoreCase("E")){
            value2 = 3;
            grade2 = "E";
        }
        if(grade3.equalsIgnoreCase("E")){
            value3 = 3;
            grade3 = "E";
        }
        if(grade4.equalsIgnoreCase("E")){
            value4 = 3;
            grade4 = "E";
        }
        if(grade5.equalsIgnoreCase("E")){
            value5 = 3;
            grade5 = "E";
        }
        if(grade6.equalsIgnoreCase("E")){
            value6 = 3;
            grade6 = "E";
        }
        
        //Ordinary Level F
        if(grade1.equalsIgnoreCase("F")){
            value1 = 2;
            grade1 = "F";
        }
        if(grade2.equalsIgnoreCase("F")){
            value2 = 2;
            grade2 = "F";
        }
        if(grade3.equalsIgnoreCase("F")){
            value3 = 2;
            grade3 = "F";
        }
        if(grade4.equalsIgnoreCase("F")){
            value4 = 2;
            grade4 = "F";
        }
        if(grade5.equalsIgnoreCase("F")){
            value5 = 2;
            grade5 = "F";
        }
        if(grade6.equalsIgnoreCase("F")){
            value6 = 2;
            grade6 = "F";
        }
        
        //Ordinary Level G
        if(grade1.equalsIgnoreCase("G")){
            value1 = 1;
            grade1 = "G";
        }
        if(grade2.equalsIgnoreCase("G")){
            value2 = 1;
            grade2 = "G";
        }
        if(grade3.equalsIgnoreCase("G")){
            value3 = 1;
            grade3 = "G";
        }
        if(grade4.equalsIgnoreCase("G")){
            value4 = 1;
            grade4 = "G";
        }
        if(grade5.equalsIgnoreCase("G")){
            value5 = 1;
            grade5 = "G";
        }
        if(grade6.equalsIgnoreCase("G")){
            value6 = 1;
            grade6 = "G";
        }
        
        //Ordinary OR Higher Level U
        if(grade1.equalsIgnoreCase("U")){
            value1 = 0;
            grade1 = "U";
        }
        if(grade2.equalsIgnoreCase("U")){
            value2 = 0;
            grade2 = "U";
        }
        if(grade3.equalsIgnoreCase("U")){
            value3 = 0;
            grade3 = "U";
        }
        if(grade4.equalsIgnoreCase("U")){
            value4 = 0;
            grade4 = "U";
        }
        if(grade5.equalsIgnoreCase("U")){
            value5 = 0;
            grade5 = "U";
        }
        if(grade6.equalsIgnoreCase("U")){
            value6 = 0;
            grade6 = "U";
        }
        
        //Higher Level 1
        if(grade1.equalsIgnoreCase("1")){
            value1 = 10;
            grade1 = "1";
        }
        if(grade2.equalsIgnoreCase("1")){
            value2 = 10;
            grade2 = "1";
        }
        if(grade3.equalsIgnoreCase("1")){
            value3 = 10;
            grade3 = "1";
        }
        if(grade4.equalsIgnoreCase("1")){
            value4 = 10;
            grade4 = "1";
        }
        if(grade5.equalsIgnoreCase("1")){
            value5 = 10;
            grade5 = "1";
        }
        if(grade6.equalsIgnoreCase("1")){
            value6 = 10;
            grade6 = "1";
        }
        
        //Higher Level 2
        if(grade1.equalsIgnoreCase("2")){
            value1 = 9;
            grade1 = "2";
        }
        if(grade2.equalsIgnoreCase("2")){
            value2 = 9;
            grade2 = "2";
        }
        if(grade3.equalsIgnoreCase("2")){
            value3 = 9;
            grade3 = "2";
        }
        if(grade4.equalsIgnoreCase("2")){
            value4 = 9;
            grade4 = "2";
        }
        if(grade5.equalsIgnoreCase("2")){
            value5 = 9;
            grade5 = "2";
        }
        if(grade6.equalsIgnoreCase("2")){
            value6 = 9;
            grade6 = "2";
        }
        
        //Higher Level 3
        if(grade1.equalsIgnoreCase("3")){
            value1 = 8;
            grade1 = "3";
        }
        if(grade2.equalsIgnoreCase("3")){
            value2 = 8;
            grade2 = "3";
        }
        if(grade3.equalsIgnoreCase("3")){
            value3 = 8;
            grade3 = "3";
        }
        if(grade4.equalsIgnoreCase("3")){
            value4 = 8;
            grade4 = "3";
        }
        if(grade5.equalsIgnoreCase("3")){
            value5 = 8;
            grade5 = "3";
        }
        if(grade6.equalsIgnoreCase("3")){
            value6 = 8;
            grade6 = "3";
        }
        
        //Higher Level 4
        if(grade1.equalsIgnoreCase("4")){
            value1 = 7;
            grade1 = "4";
        }
        if(grade2.equalsIgnoreCase("4")){
            value2 = 7;
            grade2 = "4";
        }
        if(grade3.equalsIgnoreCase("4")){
            value3 = 7;
            grade3 = "4";
        }
        if(grade4.equalsIgnoreCase("4")){
            value4 = 7;
            grade4 = "4";
        }
        if(grade5.equalsIgnoreCase("4")){
            value5 = 7;
            grade5 = "4";
        }
        if(grade6.equalsIgnoreCase("4")){
            value6 = 7;
            grade6 = "4";
        }
    }
    
    public void Calculation() throws InterruptedException{
        
        String fullName = name + " " + surName;
        
        if ((subject1.equalsIgnoreCase("english") && value1 < 3) || (subject2.equalsIgnoreCase("english") && value2 < 3) || (subject3.equalsIgnoreCase("english") && value3 < 3) || (subject4.equalsIgnoreCase("english") && value4 < 3) || (subject5.equalsIgnoreCase("english") && value5 < 3) || (subject6.equalsIgnoreCase("english") && value6 < 3)) {
            System.out.println("Dear "+ gender + " "+ fullName +", Your English is Lower than E therefore you are not eligible to do your tertiary studies in Namibia \n\n"
                    + "Please do go and emprove");
            System.out.print("System Exiting.");
            Thread.sleep(300);
            System.out.print(".");
            Thread.sleep(300);
            System.out.print(".");
            Thread.sleep(300);
            System.out.print(".");
            System.exit(0);
            
        }
        else {
            if (subject1.equalsIgnoreCase("english")){
                    
                    Sub_1();
            }
            
            //English is Subject 2
            if (subject2.equalsIgnoreCase("english")){
                    
                Sub_2();
            }
            
            //English is Subject 3
            if (subject3.equalsIgnoreCase("english")){
                Sub_3();
            }
            
            //English is Subject 4
            if (subject4.equalsIgnoreCase("english")){
                Sub_4();
            }
            
            //English is Subject 5
            if (subject5.equalsIgnoreCase("english")){
                Sub_5();
            }
            
            //English is Subject 6
            if (subject6.equalsIgnoreCase("english")){
                Sub_6();
            }
        }
    }
    
    public void Sub_1(){
        totalPoint1 = value1 + value2 + value3 + value4 + value5;
                    totalPoint2 = value1 + value2 + value3 + value4 + value6;
                    totalPoint3 = value1 + value2 + value3 + value6 + value5;
                    totalPoint4 = value1 + value2 + value6 + value4 + value5;
                    totalPoint5 = value1 + value6 + value3 + value4 + value5;
                    
                    fullName = name + " " + surName;
                    
                    if (totalPoint1 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint1 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint2 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint2 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint3 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint3 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint4 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint4 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint5 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint5 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    
                    //Management Sciences Check Field 1
                    if (field1.equalsIgnoreCase("MS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject1.equalsIgnoreCase("english") && value1 < 4)) {
                                
                                if ((subject2.equalsIgnoreCase("math") && value2 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                if ((!"math".equalsIgnoreCase(subject1) ) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (D)");
                                }
                            }
                            else {
                                if ((subject2.equalsIgnoreCase("math") && value2 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)");
                                }
                                if ((!"math".equalsIgnoreCase(subject1) ) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Management Sciences");
                                    
                                }
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Management Sciences Check Fieldn 2
                    if (field2.equalsIgnoreCase("MS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject1.equalsIgnoreCase("english") && value1 < 4)) {
                                
                                if ((subject2.equalsIgnoreCase("math") && value2 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                if ((!"math".equalsIgnoreCase(subject1) ) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (D)");
                                }
                            }
                            else {
                                if ((subject2.equalsIgnoreCase("math") && value2 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)");
                                }
                                if ((!"math".equalsIgnoreCase(subject1) ) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Management Sciences");
                                }
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Human Sciences Field 1
                    if (field1.equalsIgnoreCase("HS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject1.equalsIgnoreCase("english") && value1 < 5)) {
                                
                                System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                
                            }
                            else {
                                System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Human Sciences");
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Human Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Human Sciences Field 2
                    if (field2.equalsIgnoreCase("HS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject1.equalsIgnoreCase("english") && value1 < 5)) {
                                
                                System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                
                            }
                            else {
                                System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Human Sciences");
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Human Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Comuting and Informatics Check Field 1
                    if (field1.equalsIgnoreCase("CI")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject1.equalsIgnoreCase("english") && value1 < 3)) {
                                
                                System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (E)");
                            }
                            else {
                                if ((subject2.equalsIgnoreCase("math") && value2 < 5) || (subject3.equalsIgnoreCase("math") && value3 < 5) || (subject4.equalsIgnoreCase("math") && value4 < 5) || (subject5.equalsIgnoreCase("math") && value5 < 5) || (subject6.equalsIgnoreCase("math") && value6 < 5)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (C)");
                                }
                                if ((!"math".equalsIgnoreCase(subject1) ) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Computing and Informatics");
                                }
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Computing and Informatics. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Comuting and Informatics Check Field 2
                    if (field2.equalsIgnoreCase("CI")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject2.equalsIgnoreCase("math") && value2 < 5) || (subject3.equalsIgnoreCase("math") && value3 < 5) || (subject4.equalsIgnoreCase("math") && value4 < 5) || (subject5.equalsIgnoreCase("math") && value5 < 5) || (subject6.equalsIgnoreCase("math") && value6 < 5)) {
                                System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (C)");
                                }
                            if ((!"math".equalsIgnoreCase(subject1) ) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                            else {
                                System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Computing and Informatics");
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Computing and Informatics. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Engineering Sciences Check Field 1
                    if (field1.equalsIgnoreCase("ES")) {
                        if ((totalPoint1 >= 37) ||  (totalPoint2 >= 37) || (totalPoint3 >= 37) || (totalPoint4 >= 37) || (totalPoint5 >= 37)){
                            if ((subject1.equalsIgnoreCase("english") && value1 < 7)) {
                                
                                if ((subject2.equalsIgnoreCase("math") && value2 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject5.equalsIgnoreCase("math") && value5 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if ((!"math".equalsIgnoreCase(subject1) ) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                if ((subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if ((!"PhysicalScience".equalsIgnoreCase(subject1) ) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: English is Lower than the Required Grade (L4)");
                                }
                            }
                            else {
                                if ((subject2.equalsIgnoreCase("math") && value2 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject5.equalsIgnoreCase("math") && value5 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)");
                                }
                                if ((!"math".equalsIgnoreCase(subject1) ) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                if ((subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if ((!"PhysicalScience".equalsIgnoreCase(subject1) ) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Engineering Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Your Total Point is lower than 37");
                        }
                    }
                    
                    //Engineering Sciences Check Field 2
                    if (field2.equalsIgnoreCase("ES")) {
                        if ((totalPoint1 >= 37) ||  (totalPoint2 >= 37) || (totalPoint3 >= 37) || (totalPoint4 >= 37) || (totalPoint5 >= 37)){
                            
                            if ((subject1.equalsIgnoreCase("english") && value1 < 7)) {
                                
                                if ((subject2.equalsIgnoreCase("math") && value2 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject5.equalsIgnoreCase("math") && value5 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if ((!"math".equalsIgnoreCase(subject1) ) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                if ((subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if ((!"PhysicalScience".equalsIgnoreCase(subject1) ) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: English is Lower than the Required Grade (L4)");
                                }
                            }
                            else {
                                if ((subject2.equalsIgnoreCase("math") && value2 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject5.equalsIgnoreCase("math") && value5 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)");
                                }
                                if ((!"math".equalsIgnoreCase(subject1) ) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                
                                if ((subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if ((!"PhysicalScience".equalsIgnoreCase(subject1) ) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Engineering Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Your Total Point is lower than 37");
                        }
                    }
                    
                    //Health nd Applied Sciences Check Field 1
                    if (field1.equalsIgnoreCase("HAS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject1.equalsIgnoreCase("english") && value1 < 5)) {
                                
                                if ((subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"math".equalsIgnoreCase(subject1) ) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"Biology".equalsIgnoreCase(subject1) ) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"PhysicalScience".equalsIgnoreCase(subject1) ) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"math".equalsIgnoreCase(subject1) ) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"Biology".equalsIgnoreCase(subject1) ) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"PhysicalScience".equalsIgnoreCase(subject1) ) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Health and Applied Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Health nd Applied Sciences Check Field 2
                    if (field2.equalsIgnoreCase("HAS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject1.equalsIgnoreCase("english") && value1 < 5)) {
                                
                                if ((subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"math".equalsIgnoreCase(subject1) ) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"Biology".equalsIgnoreCase(subject1) ) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"PhysicalScience".equalsIgnoreCase(subject1) ) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"math".equalsIgnoreCase(subject1) ) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"Biology".equalsIgnoreCase(subject1) ) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"PhysicalScience".equalsIgnoreCase(subject1) ) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Health and Applied Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Health nd Applied Sciences Check Field 1
                    if (field1.equalsIgnoreCase("NRSS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject1.equalsIgnoreCase("english") && value1 < 5)) {
                                
                                if ((subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"math".equalsIgnoreCase(subject1) ) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"Geography".equalsIgnoreCase(subject1) ) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"math".equalsIgnoreCase(subject1) ) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"Geography".equalsIgnoreCase(subject1) ) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Natural Resources and Spacial Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Health nd Applied Sciences Check Field 2
                    if (field2.equalsIgnoreCase("NRSS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject1.equalsIgnoreCase("english") && value1 < 5)) {
                                
                                if ((subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"math".equalsIgnoreCase(subject1) ) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"Geography".equalsIgnoreCase(subject1) ) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"math".equalsIgnoreCase(subject1) ) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if ((!"Geography".equalsIgnoreCase(subject1) ) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Natural Resources and Spacial Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //else
                    else if ((!"MS".equalsIgnoreCase(field1) ) && (!"HS".equalsIgnoreCase(field1) ) && (!"CI".equalsIgnoreCase(field1) ) && (!"ES".equalsIgnoreCase(field1) ) && (!"HAS".equalsIgnoreCase(field1) ) && (!"NRSS".equalsIgnoreCase(field1) )){
                        System.out.println("Field of Study 1: " + field1 + " is not offered at NUST");
                    }
                    
                    else if ((!"MS".equalsIgnoreCase(field2) ) && (!"HS".equalsIgnoreCase(field2) ) && (!"CI".equalsIgnoreCase(field2) ) && (!"ES".equalsIgnoreCase(field2) ) && (!"HAS".equalsIgnoreCase(field2) ) && (!"NRSS".equalsIgnoreCase(field2) )){
                        System.out.println("Field of Study 2: " + field1 + " is not offered at NUST");
                    }
    }
    
    public void Sub_2() {
        
        fullName = name + " " + surName;
        
        totalPoint1 = value1 + value2 + value3 + value4 + value5;
        totalPoint2 = value1 + value2 + value3 + value4 + value6;
        totalPoint3 = value1 + value2 + value3 + value6 + value5;
        totalPoint4 = value1 + value2 + value6 + value4 + value5;
        totalPoint5 = value6 + value2 + value3 + value4 + value5;
                    
                    if (totalPoint1 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint1 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint2 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint2 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint3 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint3 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint4 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint4 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint5 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint5 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    
                    //Management Sciences Check Field 1
                    if (field1.equalsIgnoreCase("MS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject2.equalsIgnoreCase("english") && value2 < 4)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (D)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Management Sciences");
                                    
                                }
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Management Sciences Check Fieldn 2
                    if (field2.equalsIgnoreCase("MS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject2.equalsIgnoreCase("english") && value2 < 4)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (D)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Management Sciences");
                                }
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Human Sciences Field 1
                    if (field1.equalsIgnoreCase("HS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject2.equalsIgnoreCase("english") && value2 < 5)) {
                                
                                System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                
                            }
                            else {
                                System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Human Sciences");
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Human Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Human Sciences Field 2
                    if (field2.equalsIgnoreCase("HS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject2.equalsIgnoreCase("english") && value2 < 5)) {
                                
                                System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                
                            }
                            else {
                                System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Human Sciences");
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Human Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Comuting and Informatics Check Field 1
                    if (field1.equalsIgnoreCase("CI")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject2.equalsIgnoreCase("english") && value2 < 3)) {
                                
                                System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (E)");
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 5) || (subject3.equalsIgnoreCase("math") && value3 < 5) || (subject4.equalsIgnoreCase("math") && value4 < 5) || (subject5.equalsIgnoreCase("math") && value5 < 5) || (subject6.equalsIgnoreCase("math") && value6 < 5)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Computing and Informatics");
                                }
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Computing and Informatics. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Comuting and Informatics Check Field 2
                    if (field2.equalsIgnoreCase("CI")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject1.equalsIgnoreCase("math") && value1 < 5) || (subject3.equalsIgnoreCase("math") && value3 < 5) || (subject4.equalsIgnoreCase("math") && value4 < 5) || (subject5.equalsIgnoreCase("math") && value5 < 5) || (subject6.equalsIgnoreCase("math") && value6 < 5)) {
                                System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (C)");
                                }
                            if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                            else {
                                System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Computing and Informatics");
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Computing and Informatics. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Engineering Sciences Check Field 1
                    if (field1.equalsIgnoreCase("ES")) {
                        if ((totalPoint1 >= 37) ||  (totalPoint2 >= 37) || (totalPoint3 >= 37) || (totalPoint4 >= 37) || (totalPoint5 >= 37)){
                            if ((subject2.equalsIgnoreCase("english") && value2 < 7)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject5.equalsIgnoreCase("math") && value5 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: English is Lower than the Required Grade (L4)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject5.equalsIgnoreCase("math") && value5 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Engineering Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Your Total Point is lower than 37");
                        }
                    }
                    
                    //Engineering Sciences Check Field 2
                    if (field2.equalsIgnoreCase("ES")) {
                        if ((totalPoint1 >= 37) ||  (totalPoint2 >= 37) || (totalPoint3 >= 37) || (totalPoint4 >= 37) || (totalPoint5 >= 37)){
                            
                            if ((subject2.equalsIgnoreCase("english") && value2 < 7)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject5.equalsIgnoreCase("math") && value5 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: English is Lower than the Required Grade (L4)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject5.equalsIgnoreCase("math") && value5 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Engineering Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Your Total Point is lower than 37");
                        }
                    }
                    
                    //Health nd Applied Sciences Check Field 1
                    if (field1.equalsIgnoreCase("HAS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject2.equalsIgnoreCase("english") && value2 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Health and Applied Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Health nd Applied Sciences Check Field 2
                    if (field2.equalsIgnoreCase("HAS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject2.equalsIgnoreCase("english") && value2 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Health and Applied Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Natural Resources and Spacial Sciences Check Field 1
                    if (field1.equalsIgnoreCase("NRSS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject2.equalsIgnoreCase("english") && value2 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Natural Resources and Spacial Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Natural Resources and Spacial Sciences Check Field 2
                    if (field2.equalsIgnoreCase("NRSS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject2.equalsIgnoreCase("english") && value2 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Natural Resources and Spacial Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //else
                    else if ((!"MS".equalsIgnoreCase(field1) ) && (!"HS".equalsIgnoreCase(field1) ) && (!"CI".equalsIgnoreCase(field1) ) && (!"ES".equalsIgnoreCase(field1) ) && (!"HAS".equalsIgnoreCase(field1) ) && (!"NRSS".equalsIgnoreCase(field1) )){
                        System.out.println("Field of Study 1: " + field1 + " is not offered at NUST");
                    }
                    
                    else if ((!"MS".equalsIgnoreCase(field2) ) && (!"HS".equalsIgnoreCase(field2) ) && (!"CI".equalsIgnoreCase(field2) ) && (!"ES".equalsIgnoreCase(field2) ) && (!"HAS".equalsIgnoreCase(field2) ) && (!"NRSS".equalsIgnoreCase(field2) )){
                        System.out.println("Field of Study 2: " + field1 + " is not offered at NUST");
                    }
    }
    
    public void Sub_3() {
        
        fullName = name + " " + surName;
        
        totalPoint1 = value1 + value2 + value3 + value4 + value5;
        totalPoint2 = value1 + value2 + value3 + value4 + value6;
        totalPoint3 = value1 + value2 + value3 + value6 + value5;
        totalPoint4 = value1 + value6 + value3 + value4 + value5;
        totalPoint5 = value6 + value2 + value3 + value4 + value5;
                    
                    if (totalPoint1 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint1 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint2 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint2 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint3 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint3 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint4 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint4 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint5 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint5 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    
                    //Management Sciences Check Field 1
                    if (field1.equalsIgnoreCase("MS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject3.equalsIgnoreCase("english") && value3 < 4)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject2.equalsIgnoreCase("math") && value2 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (D)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject2.equalsIgnoreCase("math") && value2 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Management Sciences");
                                    
                                }
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Management Sciences Check Fieldn 2
                    if (field2.equalsIgnoreCase("MS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject3.equalsIgnoreCase("english") && value3 < 4)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject2.equalsIgnoreCase("math") && value2 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (D)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject2.equalsIgnoreCase("math") && value2 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Management Sciences");
                                }
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Human Sciences Field 1
                    if (field1.equalsIgnoreCase("HS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject3.equalsIgnoreCase("english") && value3 < 5)) {
                                
                                System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                
                            }
                            else {
                                System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Human Sciences");
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Human Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Human Sciences Field 2
                    if (field2.equalsIgnoreCase("HS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject3.equalsIgnoreCase("english") && value3 < 5)) {
                                
                                System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                
                            }
                            else {
                                System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Human Sciences");
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Human Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Comuting and Informatics Check Field 1
                    if (field1.equalsIgnoreCase("CI")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject3.equalsIgnoreCase("english") && value3 < 3)) {
                                
                                System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (E)");
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 5) || (subject2.equalsIgnoreCase("math") && value2 < 5) || (subject4.equalsIgnoreCase("math") && value4 < 5) || (subject5.equalsIgnoreCase("math") && value5 < 5) || (subject6.equalsIgnoreCase("math") && value6 < 5)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Computing and Informatics");
                                }
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Computing and Informatics. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Comuting and Informatics Check Field 2
                    if (field2.equalsIgnoreCase("CI")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject1.equalsIgnoreCase("math") && value1 < 5) || (subject2.equalsIgnoreCase("math") && value2 < 5) || (subject4.equalsIgnoreCase("math") && value4 < 5) || (subject5.equalsIgnoreCase("math") && value5 < 5) || (subject6.equalsIgnoreCase("math") && value6 < 5)) {
                                System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (C)");
                                }
                            if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                            else {
                                System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Computing and Informatics");
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Computing and Informatics. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Engineering Sciences Check Field 1
                    if (field1.equalsIgnoreCase("ES")) {
                        if ((totalPoint1 >= 37) ||  (totalPoint2 >= 37) || (totalPoint3 >= 37) || (totalPoint4 >= 37) || (totalPoint5 >= 37)){
                            if ((subject3.equalsIgnoreCase("english") && value3 < 7)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject2.equalsIgnoreCase("math") && value2 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject5.equalsIgnoreCase("math") && value5 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: English is Lower than the Required Grade (L4)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject2.equalsIgnoreCase("math") && value2 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject5.equalsIgnoreCase("math") && value5 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Engineering Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Your Total Point is lower than 37");
                        }
                    }
                    
                    //Engineering Sciences Check Field 2
                    if (field2.equalsIgnoreCase("ES")) {
                        if ((totalPoint1 >= 37) ||  (totalPoint2 >= 37) || (totalPoint3 >= 37) || (totalPoint4 >= 37) || (totalPoint5 >= 37)){
                            
                            if ((subject3.equalsIgnoreCase("english") && value3 < 7)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject2.equalsIgnoreCase("math") && value2 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject5.equalsIgnoreCase("math") && value5 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: English is Lower than the Required Grade (L4)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject2.equalsIgnoreCase("math") && value2 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject5.equalsIgnoreCase("math") && value5 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Engineering Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Your Total Point is lower than 37");
                        }
                    }
                    
                    //Health nd Applied Sciences Check Field 1
                    if (field1.equalsIgnoreCase("HAS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject3.equalsIgnoreCase("english") && value3 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Health and Applied Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Health nd Applied Sciences Check Field 2
                    if (field2.equalsIgnoreCase("HAS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject3.equalsIgnoreCase("english") && value3 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Health and Applied Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Natural Resources and Spacial Sciences Check Field 1
                    if (field1.equalsIgnoreCase("NRSS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject3.equalsIgnoreCase("english") && value3 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Natural Resources and Spacial Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Natural Resources and Spacial Sciences Check Field 2
                    if (field2.equalsIgnoreCase("NRSS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject3.equalsIgnoreCase("english") && value3 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Natural Resources and Spacial Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //else
                    else if ((!"MS".equalsIgnoreCase(field1) ) && (!"HS".equalsIgnoreCase(field1) ) && (!"CI".equalsIgnoreCase(field1) ) && (!"ES".equalsIgnoreCase(field1) ) && (!"HAS".equalsIgnoreCase(field1) ) && (!"NRSS".equalsIgnoreCase(field1) )){
                        System.out.println("Field of Study 1: " + field1 + " is not offered at NUST");
                    }
                    
                    else if ((!"MS".equalsIgnoreCase(field2) ) && (!"HS".equalsIgnoreCase(field2) ) && (!"CI".equalsIgnoreCase(field2) ) && (!"ES".equalsIgnoreCase(field2) ) && (!"HAS".equalsIgnoreCase(field2) ) && (!"NRSS".equalsIgnoreCase(field2) )){
                        System.out.println("Field of Study 2: " + field1 + " is not offered at NUST");
                    }
    }
    
    public void Sub_4() {
        
        fullName = name + " " +surName;
        
        totalPoint1 = value1 + value2 + value3 + value4 + value5;
                    totalPoint2 = value1 + value2 + value3 + value4 + value6;
                    totalPoint3 = value1 + value2 + value6 + value4 + value5;
                    totalPoint4 = value1 + value6 + value3 + value4 + value5;
                    totalPoint5 = value6 + value2 + value3 + value4 + value5;
                    
                    if (totalPoint1 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint1 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint2 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint2 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint3 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint3 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint4 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint4 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint5 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint5 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    
                    //Management Sciences Check Field 1
                    if (field1.equalsIgnoreCase("MS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject4.equalsIgnoreCase("english") && value4 < 4)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject2.equalsIgnoreCase("math") && value2 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (D)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject2.equalsIgnoreCase("math") && value2 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Management Sciences");
                                    
                                }
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Management Sciences Check Fieldn 2
                    if (field2.equalsIgnoreCase("MS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject4.equalsIgnoreCase("english") && value4 < 4)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject2.equalsIgnoreCase("math") && value2 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (D)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject2.equalsIgnoreCase("math") && value2 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Management Sciences");
                                }
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Human Sciences Field 1
                    if (field1.equalsIgnoreCase("HS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject4.equalsIgnoreCase("english") && value4 < 5)) {
                                
                                System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                
                            }
                            else {
                                System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Human Sciences");
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Human Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Human Sciences Field 2
                    if (field2.equalsIgnoreCase("HS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject4.equalsIgnoreCase("english") && value4 < 5)) {
                                
                                System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                
                            }
                            else {
                                System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Human Sciences");
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Human Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Comuting and Informatics Check Field 1
                    if (field1.equalsIgnoreCase("CI")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject4.equalsIgnoreCase("english") && value4 < 3)) {
                                
                                System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (E)");
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 5) || (subject2.equalsIgnoreCase("math") && value2 < 5) || (subject3.equalsIgnoreCase("math") && value3 < 5) || (subject5.equalsIgnoreCase("math") && value5 < 5) || (subject6.equalsIgnoreCase("math") && value6 < 5)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Computing and Informatics");
                                }
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Computing and Informatics. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Comuting and Informatics Check Field 2
                    if (field2.equalsIgnoreCase("CI")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject1.equalsIgnoreCase("math") && value1 < 5) || (subject2.equalsIgnoreCase("math") && value2 < 5) || (subject3.equalsIgnoreCase("math") && value3 < 5) || (subject5.equalsIgnoreCase("math") && value5 < 5) || (subject6.equalsIgnoreCase("math") && value6 < 5)) {
                                System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (C)");
                                }
                            if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                            else {
                                System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Computing and Informatics");
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Computing and Informatics. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Engineering Sciences Check Field 1
                    if (field1.equalsIgnoreCase("ES")) {
                        if ((totalPoint1 >= 37) ||  (totalPoint2 >= 37) || (totalPoint3 >= 37) || (totalPoint4 >= 37) || (totalPoint5 >= 37)){
                            if ((subject4.equalsIgnoreCase("english") && value4 < 7)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject2.equalsIgnoreCase("math") && value2 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject5.equalsIgnoreCase("math") && value5 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: English is Lower than the Required Grade (L4)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject2.equalsIgnoreCase("math") && value2 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject5.equalsIgnoreCase("math") && value5 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Engineering Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Your Total Point is lower than 37");
                        }
                    }
                    
                    //Engineering Sciences Check Field 2
                    if (field2.equalsIgnoreCase("ES")) {
                        if ((totalPoint1 >= 37) ||  (totalPoint2 >= 37) || (totalPoint3 >= 37) || (totalPoint4 >= 37) || (totalPoint5 >= 37)){
                            
                            if ((subject4.equalsIgnoreCase("english") && value4 < 7)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject2.equalsIgnoreCase("math") && value2 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject5.equalsIgnoreCase("math") && value5 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: English is Lower than the Required Grade (L4)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject2.equalsIgnoreCase("math") && value2 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject5.equalsIgnoreCase("math") && value5 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Engineering Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Your Total Point is lower than 37");
                        }
                    }
                    
                    //Health nd Applied Sciences Check Field 1
                    if (field1.equalsIgnoreCase("HAS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject4.equalsIgnoreCase("english") && value4 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Health and Applied Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Health nd Applied Sciences Check Field 2
                    if (field2.equalsIgnoreCase("HAS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject4.equalsIgnoreCase("english") && value4 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Health and Applied Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Natural Resources and Spacial Sciences Check Field 1
                    if (field1.equalsIgnoreCase("NRSS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject4.equalsIgnoreCase("english") && value4 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Natural Resources and Spacial Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Natural Resources and Spacial Sciences Check Field 2
                    if (field2.equalsIgnoreCase("NRSS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject4.equalsIgnoreCase("english") && value4 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Natural Resources and Spacial Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    
                    //else
                    else if ((!"MS".equalsIgnoreCase(field1) ) && (!"HS".equalsIgnoreCase(field1) ) && (!"CI".equalsIgnoreCase(field1) ) && (!"ES".equalsIgnoreCase(field1) ) && (!"HAS".equalsIgnoreCase(field1) ) && (!"NRSS".equalsIgnoreCase(field1) )){
                        System.out.println("Field of Study 1: " + field1 + " is not offered at NUST");
                    }
                    
                    else if ((!"MS".equalsIgnoreCase(field2) ) && (!"HS".equalsIgnoreCase(field2) ) && (!"CI".equalsIgnoreCase(field2) ) && (!"ES".equalsIgnoreCase(field2) ) && (!"HAS".equalsIgnoreCase(field2) ) && (!"NRSS".equalsIgnoreCase(field2) )){
                        System.out.println("Field of Study 2: " + field1 + " is not offered at NUST");
                    }
    }
    
    public void Sub_5() {
        
        fullName = name + " " + surName;
        
        totalPoint1 = value1 + value2 + value3 + value4 + value5;
                    totalPoint2 = value1 + value2 + value3 + value6 + value5;
                    totalPoint3 = value1 + value2 + value6 + value4 + value5;
                    totalPoint4 = value1 + value6 + value3 + value4 + value5;
                    totalPoint5 = value6 + value2 + value3 + value4 + value5;
                    
                    if (totalPoint1 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint1 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint2 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint2 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint3 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint3 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint4 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint4 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint5 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint5 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    
                    //Management Sciences Check Field 1
                    if (field1.equalsIgnoreCase("MS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject5.equalsIgnoreCase("english") && value5 < 4)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject2.equalsIgnoreCase("math") && value2 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (D)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject2.equalsIgnoreCase("math") && value2 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Management Sciences");
                                    
                                }
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Management Sciences Check Fieldn 2
                    if (field2.equalsIgnoreCase("MS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject5.equalsIgnoreCase("english") && value5 < 4)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject2.equalsIgnoreCase("math") && value2 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (D)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject2.equalsIgnoreCase("math") && value2 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject6.equalsIgnoreCase("math") && value6 < 3)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Management Sciences");
                                }
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Human Sciences Field 1
                    if (field1.equalsIgnoreCase("HS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject5.equalsIgnoreCase("english") && value5 < 5)) {
                                
                                System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                
                            }
                            else {
                                System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Human Sciences");
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Human Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Human Sciences Field 2
                    if (field2.equalsIgnoreCase("HS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject5.equalsIgnoreCase("english") && value5 < 5)) {
                                
                                System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                
                            }
                            else {
                                System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Human Sciences");
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Human Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Comuting and Informatics Check Field 1
                    if (field1.equalsIgnoreCase("CI")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject5.equalsIgnoreCase("english") && value5 < 3)) {
                                
                                System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (E)");
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 5) || (subject2.equalsIgnoreCase("math") && value2 < 5) || (subject3.equalsIgnoreCase("math") && value3 < 5) || (subject4.equalsIgnoreCase("math") && value4 < 5) || (subject6.equalsIgnoreCase("math") && value6 < 5)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Computing and Informatics");
                                }
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Computing and Informatics. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Comuting and Informatics Check Field 2
                    if (field2.equalsIgnoreCase("CI")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject1.equalsIgnoreCase("math") && value1 < 5) || (subject2.equalsIgnoreCase("math") && value2 < 5) || (subject3.equalsIgnoreCase("math") && value3 < 5) || (subject4.equalsIgnoreCase("math") && value4 < 5) || (subject6.equalsIgnoreCase("math") && value6 < 5)) {
                                System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (C)");
                                }
                            if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                            else {
                                System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Computing and Informatics");
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Computing and Informatics. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Engineering Sciences Check Field 1
                    if (field1.equalsIgnoreCase("ES")) {
                        if ((totalPoint1 >= 37) ||  (totalPoint2 >= 37) || (totalPoint3 >= 37) || (totalPoint4 >= 37) || (totalPoint5 >= 37)){
                            if ((subject5.equalsIgnoreCase("english") && value5 < 7)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject2.equalsIgnoreCase("math") && value2 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: English is Lower than the Required Grade (L4)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject2.equalsIgnoreCase("math") && value2 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Engineering Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Your Total Point is lower than 37");
                        }
                    }
                    
                    //Engineering Sciences Check Field 2
                    if (field2.equalsIgnoreCase("ES")) {
                        if ((totalPoint1 >= 37) ||  (totalPoint2 >= 37) || (totalPoint3 >= 37) || (totalPoint4 >= 37) || (totalPoint5 >= 37)){
                            
                            if ((subject5.equalsIgnoreCase("english") && value5 < 7)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject2.equalsIgnoreCase("math") && value2 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: English is Lower than the Required Grade (L4)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject2.equalsIgnoreCase("math") && value2 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject6.equalsIgnoreCase("math") && value6 <8)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 7)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Engineering Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Your Total Point is lower than 37");
                        }
                    }
                    
                    //Health nd Applied Sciences Check Field 1
                    if (field1.equalsIgnoreCase("HAS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject5.equalsIgnoreCase("english") && value5 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Health and Applied Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Health nd Applied Sciences Check Field 2
                    if (field2.equalsIgnoreCase("HAS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject5.equalsIgnoreCase("english") && value5 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject6.equalsIgnoreCase("Biology") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject6) )|| (!"Biology".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject6.equalsIgnoreCase("PhysicalScience") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject6) )|| (!"PhysicalScience".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Health and Applied Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Natural Resources and Spacial Sciences Check Field 1
                    if (field1.equalsIgnoreCase("NRSS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject5.equalsIgnoreCase("english") && value5 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Natural Resources and Spacial Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Natural Resources and Spacial Sciences Check Field 2
                    if (field2.equalsIgnoreCase("NRSS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject5.equalsIgnoreCase("english") && value5 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject6.equalsIgnoreCase("math") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject6) )|| (!"Math".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject6.equalsIgnoreCase("Geography") && value6 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject6) )|| (!"Geography".equalsIgnoreCase(subject6) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Natural Resources and Spacial Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    //else
                    else if ((!"MS".equalsIgnoreCase(field1) ) && (!"HS".equalsIgnoreCase(field1) ) && (!"CI".equalsIgnoreCase(field1) ) && (!"ES".equalsIgnoreCase(field1) ) && (!"HAS".equalsIgnoreCase(field1) ) && (!"NRSS".equalsIgnoreCase(field1) )){
                        System.out.println("Field of Study 1: " + field1 + " is not offered at NUST");
                    }
                    
                    else if ((!"MS".equalsIgnoreCase(field2) ) && (!"HS".equalsIgnoreCase(field2) ) && (!"CI".equalsIgnoreCase(field2) ) && (!"ES".equalsIgnoreCase(field2) ) && (!"HAS".equalsIgnoreCase(field2) ) && (!"NRSS".equalsIgnoreCase(field2) )){
                        System.out.println("Field of Study 2: " + field1 + " is not offered at NUST");
                    }
    }
    
    public void Sub_6() {
        
        fullName = name + " " +surName;
        
        totalPoint1 = value6 + value2 + value3 + value4 + value5;
                    totalPoint2 = value6 + value2 + value3 + value4 + value1;
                    totalPoint3 = value6 + value2 + value3 + value1 + value5;
                    totalPoint4 = value6 + value2 + value1 + value4 + value5;
                    totalPoint5 = value6 + value1 + value3 + value4 + value5;
                    
                    if (totalPoint1 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint1 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint2 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint2 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint3 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint3 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint4 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint4 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    else if (totalPoint5 >= 25) {
                        System.out.println("Dear "+ gender + " "+ fullName +", You have " + totalPoint5 + " points in 5 subjects. Congratulations you are eligible for tertiary studies in Namibia");
                    }
                    
                    //Management Sciences Check Field 1
                    if (field1.equalsIgnoreCase("MS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject6.equalsIgnoreCase("english") && value6 < 4)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject2.equalsIgnoreCase("math") && value2 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (D)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject2.equalsIgnoreCase("math") && value2 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Management Sciences");
                                    
                                }
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Management Sciences Check Fieldn 2
                    if (field2.equalsIgnoreCase("MS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject6.equalsIgnoreCase("english") && value6 < 4)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject2.equalsIgnoreCase("math") && value2 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (D)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 3) || (subject2.equalsIgnoreCase("math") && value2 < 3) || (subject3.equalsIgnoreCase("math") && value3 < 3) || (subject4.equalsIgnoreCase("math") && value4 < 3) || (subject5.equalsIgnoreCase("math") && value5 < 3)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (E)\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Management Sciences");
                                }
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Human Sciences Field 1
                    if (field1.equalsIgnoreCase("HS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject6.equalsIgnoreCase("english") && value6 < 5)) {
                                
                                System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                
                            }
                            else {
                                System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Human Sciences");
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Human Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Human Sciences Field 2
                    if (field2.equalsIgnoreCase("HS")) {
                        if ((totalPoint1 >= 26) ||  (totalPoint2 >= 26) || (totalPoint3 >= 26) || (totalPoint4 >= 26) || (totalPoint5 >= 26)){
                            
                            if ((subject6.equalsIgnoreCase("english") && value6 < 5)) {
                                
                                System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                
                            }
                            else {
                                System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Human Sciences");
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Human Sciences. \n Comment: Your Total Point is lower than 26");
                        }
                    }
                    
                    //Comuting and Informatics Check Field 1
                    if (field1.equalsIgnoreCase("CI")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject6.equalsIgnoreCase("english") && value6 < 3)) {
                                
                                System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: English is Lower than the Required Grade (E)");
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 5) || (subject2.equalsIgnoreCase("math") && value2 < 5) || (subject3.equalsIgnoreCase("math") && value3 < 5) || (subject4.equalsIgnoreCase("math") && value4 < 5) || (subject5.equalsIgnoreCase("math") && value5 < 5)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Computing and Informatics");
                                }
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Computing and Informatics. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Comuting and Informatics Check Field 2
                    if (field2.equalsIgnoreCase("CI")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject1.equalsIgnoreCase("math") && value1 < 5) || (subject2.equalsIgnoreCase("math") && value2 < 5) || (subject3.equalsIgnoreCase("math") && value3 < 5) || (subject4.equalsIgnoreCase("math") && value4 < 5) || (subject5.equalsIgnoreCase("math") && value5 < 5)) {
                                System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematics is Lower than the Required Grade (C)");
                                }
                            if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) ))) {
                                System.out.println("Field of Study 2: Unfortunately you have not been admitted into Management Sciences. \n Comment: Mathematic is not listed on the lst of work");
                                }
                            else {
                                System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Computing and Informatics");
                            }
                            
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                            
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Computing and Informatics. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Engineering Sciences Check Field 1
                    if (field1.equalsIgnoreCase("ES")) {
                        if ((totalPoint1 >= 37) ||  (totalPoint2 >= 37) || (totalPoint3 >= 37) || (totalPoint4 >= 37) || (totalPoint5 >= 37)){
                            if ((subject6.equalsIgnoreCase("english") && value6 < 7)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject2.equalsIgnoreCase("math") && value2 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject5.equalsIgnoreCase("math") && value5 <8)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: English is Lower than the Required Grade (L4)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject2.equalsIgnoreCase("math") && value2 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject5.equalsIgnoreCase("math") && value5 <8)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Engineering Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Your Total Point is lower than 37");
                        }
                    }
                    
                    //Engineering Sciences Check Field 2
                    if (field2.equalsIgnoreCase("ES")) {
                        if ((totalPoint1 >= 37) ||  (totalPoint2 >= 37) || (totalPoint3 >= 37) || (totalPoint4 >= 37) || (totalPoint5 >= 37)){
                            
                            if ((subject6.equalsIgnoreCase("english") && value6 < 7)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject2.equalsIgnoreCase("math") && value2 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject5.equalsIgnoreCase("math") && value5 <8)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: English is Lower than the Required Grade (L4)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 8) || (subject2.equalsIgnoreCase("math") && value2 < 8) || (subject3.equalsIgnoreCase("math") && value3 < 8) || (subject4.equalsIgnoreCase("math") && value4 < 8) || (subject5.equalsIgnoreCase("math") && value5 <8)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematics is Lower than the Required Grade (L3)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 7) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 7) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 7) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 7) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 7)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (L4)\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (L4)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Engineering Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Engineering Sciences. \n Comment: Your Total Point is lower than 37");
                        }
                    }
                    
                    //Health nd Applied Sciences Check Field 1
                    if (field1.equalsIgnoreCase("HAS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject6.equalsIgnoreCase("english") && value6 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Health and Applied Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Health nd Applied Sciences Check Field 2
                    if (field2.equalsIgnoreCase("HAS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject6.equalsIgnoreCase("english") && value6 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Biology") && value1 < 4) || (subject2.equalsIgnoreCase("Biology") && value2 < 4) || (subject3.equalsIgnoreCase("Biology") && value3 < 4) || (subject4.equalsIgnoreCase("Biology") && value4 < 4) || (subject5.equalsIgnoreCase("Biology") && value5 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Biology".equalsIgnoreCase(subject1) )|| (!"Biology".equalsIgnoreCase(subject1) )) && ((!"Biology".equalsIgnoreCase(subject2) )|| (!"Biology".equalsIgnoreCase(subject2) )) && ((!"Biology".equalsIgnoreCase(subject3) )|| (!"Biology".equalsIgnoreCase(subject3) )) && ((!"Biology".equalsIgnoreCase(subject4) )|| (!"Biology".equalsIgnoreCase(subject4) )) && ((!"Biology".equalsIgnoreCase(subject5) )|| (!"Biology".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Biology is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("PhysicalScience") && value1 < 4) || (subject2.equalsIgnoreCase("PhysicalScience") && value2 < 4) || (subject3.equalsIgnoreCase("PhysicalScience") && value3 < 4) || (subject4.equalsIgnoreCase("PhysicalScience") && value4 < 4) || (subject5.equalsIgnoreCase("PhysicalScience") && value5 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Sciecne is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"PhysicalScience".equalsIgnoreCase(subject1) )|| (!"PhysicalScience".equalsIgnoreCase(subject1) )) && ((!"PhysicalScience".equalsIgnoreCase(subject2) )|| (!"PhysicalScience".equalsIgnoreCase(subject2) )) && ((!"PhysicalScience".equalsIgnoreCase(subject3) )|| (!"PhysicalScience".equalsIgnoreCase(subject3) )) && ((!"PhysicalScience".equalsIgnoreCase(subject4) )|| (!"PhysicalScience".equalsIgnoreCase(subject4) )) && ((!"PhysicalScience".equalsIgnoreCase(subject5) )|| (!"PhysicalScience".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Physical Science is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Health and Applied Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Health and Applied Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Natural Resources and Spacial Sciences Check Field 1
                    if (field1.equalsIgnoreCase("NRSS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject6.equalsIgnoreCase("english") && value6 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4)) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 1: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Natural Resources and Spacial Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 1: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //Natural Resources and Spacial Sciences Check Field 2
                    if (field2.equalsIgnoreCase("NRSS")) {
                        if ((totalPoint1 >= 30) ||  (totalPoint2 >= 30) || (totalPoint3 >= 30) || (totalPoint4 >= 30) || (totalPoint5 >= 30)){
                            
                            if ((subject6.equalsIgnoreCase("english") && value6 < 5)) {
                                
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: English is Lower than the Required Grade (C)");
                                }
                            }
                            else {
                                if ((subject1.equalsIgnoreCase("math") && value1 < 4) || (subject2.equalsIgnoreCase("math") && value2 < 4) || (subject3.equalsIgnoreCase("math") && value3 < 4) || (subject4.equalsIgnoreCase("math") && value4 < 4) || (subject5.equalsIgnoreCase("math") && value5 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematics is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"math".equalsIgnoreCase(subject1) )|| (!"Math".equalsIgnoreCase(subject1) )) && ((!"math".equalsIgnoreCase(subject2) )|| (!"Math".equalsIgnoreCase(subject2) )) && ((!"math".equalsIgnoreCase(subject3) )|| (!"Math".equalsIgnoreCase(subject3) )) && ((!"math".equalsIgnoreCase(subject4) )|| (!"Math".equalsIgnoreCase(subject4) )) && ((!"math".equalsIgnoreCase(subject5) )|| (!"Math".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Mathematic is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                if ((subject1.equalsIgnoreCase("Geography") && value1 < 4) || (subject2.equalsIgnoreCase("Geography") && value2 < 4) || (subject3.equalsIgnoreCase("Geography") && value3 < 4) || (subject4.equalsIgnoreCase("Geography") && value4 < 4) || (subject5.equalsIgnoreCase("Geography") && value5 < 4)) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is Lower than the Required Grade (D)\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                if (((!"Geography".equalsIgnoreCase(subject1) )|| (!"Geography".equalsIgnoreCase(subject1) )) && ((!"Geography".equalsIgnoreCase(subject2) )|| (!"Geography".equalsIgnoreCase(subject2) )) && ((!"Geography".equalsIgnoreCase(subject3) )|| (!"Geography".equalsIgnoreCase(subject3) )) && ((!"Geography".equalsIgnoreCase(subject4) )|| (!"Geography".equalsIgnoreCase(subject4) )) && ((!"Geography".equalsIgnoreCase(subject5) )|| (!"Geography".equalsIgnoreCase(subject5) ))) {
                                    System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Geography is not listed on the lst of work\n\n Comment: English is Lower than the Required Grade (C)");
                                }
                                
                                else {
                                    System.out.println("Field of Study 2: Dear "+ fullName + ", \n\nCongratulations!!! \nYour have been admitted in the faculty of Natural Resources and Spacial Sciences");
                                }
                            }
                            
//                            System.out.println("1. " + value1);
//                            System.out.println("2. " + value2);
//                            System.out.println("3. " + value3);
//                            System.out.println("4. " + value4);
//                            System.out.println("5. " + value5);
//                            System.out.println("6. " + value6);
                        }
                        else {
                            System.out.println("Field of Study 2: Unfortunately you have not been admitted into Natural Resources and Spacial Sciences. \n Comment: Your Total Point is lower than 30");
                        }
                    }
                    
                    //else
                    else if ((!"MS".equalsIgnoreCase(field1) ) && (!"HS".equalsIgnoreCase(field1) ) && (!"CI".equalsIgnoreCase(field1) ) && (!"ES".equalsIgnoreCase(field1) ) && (!"HAS".equalsIgnoreCase(field1) ) && (!"NRSS".equalsIgnoreCase(field1) )){
                        System.out.println("Field of Study 1: " + field1 + " is not offered at NUST");
                    }
                    
                    else if ((!"MS".equalsIgnoreCase(field2) ) && (!"HS".equalsIgnoreCase(field2) ) && (!"CI".equalsIgnoreCase(field2) ) && (!"ES".equalsIgnoreCase(field2) ) && (!"HAS".equalsIgnoreCase(field2) ) && (!"NRSS".equalsIgnoreCase(field2) )){
                        System.out.println("Field of Study 2: " + field1 + " is not offered at NUST");
                    }
    }
}
