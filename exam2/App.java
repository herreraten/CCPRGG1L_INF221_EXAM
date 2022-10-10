import java.util.Scanner;

public class Exam {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

       
        System.out.println("1. Last six digits: ");

        System.out.print("Enter your ten digit student number: ");

        int studentNumber = scan.nextInt();
        System.out.println("Student Number:"+studentNumber);
        System.out.println(String.valueOf(studentNumber).substring(4));

        
        
        System.out.println("2. ODD or EVEN numbers");

        System.out.print("Enter the last two digits of your student number: ");

        int lastTwoDigits = scan.nextInt();

        if ( lastTwoDigits % 28 == 0 )



        System.out.println(lastTwoDigits+" is an even number.");



        else



        System.out.println(lastTwoDigits+" is an odd number.");




        System.out.println("3. Length of your fullname");

        System.out.print("Enter your firstname: ");

        String firstname = scan.next();

        System.out.print("Enter your surname: ");

        String surname = scan.next();



        String name = "Christenne";

        int firstnamelength = name.length();

        int surnamelength = surname.length();

        System.out.println(firstnamelength + surnamelength + "total length of your first name and surname");
    
     
       
    
        
        System.out.println("4. Check your first name in LOWERCASE and UPPERCASE");
        System.out.print("Enter your first name in lowercase: ");
        String firstNamelower = scan.next();
        System.out.print("Enter your first name in UPPERCASE: ");
        String firstNameupper = scan.next();
        System.out.println(firstNamelower.toLowerCase()); 
        System.out.println(firstNameupper.toUpperCase()); 


  

        System.out.println("5. Vowel or Consonant");



        System.out.print("Enter the first character of your first name: ");



        char firstChar = scan.next().charAt(0);

        {

            char ch = 'i';

           

            if(firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u' )



                System.out.println(firstChar + " is vowel");



            else



                System.out.println(firstChar + " is consonant");



               

        System.out.println("6. Student number validation");

        System.out.print("Enter your ten digit student number: ");

        studentNumber = scan.nextInt();

        if ( studentNumber == 2022109794){



                System.out.println ("valid");

           

             } else {

           

                System.out.println ("invalid");

           

            }
              
        }

        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        String firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        String lastName = scan.next();
        System.out.println(firstName.toUpperCase()); 
        System.out.println(lastName.toLowerCase()); 
        if (firstName == firstName.toUpperCase() && lastName == lastName.toLowerCase()){

            System.out.println ("valid");
         } else {
            System.out.println ("invalid");


        }
        System.out.println("8. Nested conditions");

        System.out.print("Enter your enrolled course (BSIT or BSCS): ");

        String course = scan.next();



        

        switch (course){

            case "BSIT":

            System.out.print("Enter your specialization (MWAA or MAA): ");

            String specialization1 = scan.next();

            System.out.println("Valid! You are in " + course  + " " + specialization1);

            break;



        

        case "BSCS":

        System.out.print("Enter your specialization (DF or ML): ");

        String specialization2 = scan.next();

        System.out.println("Valid! You are in " + course + " " + specialization2);

        break;



        }



        System.out.println("9. Selection");



        System.out.println("STEM");

        System.out.println("ICT");

        System.out.println("HUMSS");

        System.out.println("HOME ECONOMICS");

        System.out.println("ARTS AND DESIGN");

        System.out.println("TVL MARITIME");

        System.out.print("Enter your SHS strand: ");



        String strand = scan.next();



        switch(strand){



            case "STEM","ICT","ABM","HUMSS","HOME ECONOMICS","ARTS AND DESIGN","TVL MARITIME":



            System.out.println("valid");



            break;  



        }   System.out.println("invalid");

        

        System.out.println("10. Validate student email address ");

        System.out.print("Enter your student email address: ");

        String studentEmailAddress = scan.next();

        if(studentEmailAddress.contains("herreracc")) {

            System.out.println("valid");

        } else{

            System.out.println("invalid");

        }
        

            }
              
        }




    
