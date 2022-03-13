package com.greatlearning.EmailApp.main;

import java.util.Scanner;

import com.greatlearning.EmailApp.service.CredentialService;



public class DriverClass {

	public static void main(String[] args) {
		
		
		int choice;
        
		Scanner sc = new Scanner(System.in);
		
		
		Employee employee=null;
		
		
		do {
		
		System.out.println("Please enter the department from the following \n" + "1. Technical \n"

                    + "2. Admin \n" + "3. Human Resource \n"

                    + "4. Legal \n" + "--> Enter 0 to Exit.\n");

           
		System.out.println();
            
            
            choice =sc.nextInt();
           

            switch (choice) {

                case 0:
                    choice = 0;
                    return;

             case 1:
                    
                     employee=new Employee("Manjunath","Patil","tech");
                     break;
                    
                    

             case 2:
                	
                	employee=new Employee("Manjunath","Patil","admin");
                    break;
                
                   
                	
                
              case 3:
                	employee=new Employee("Manjunath","Patil","hr");
                    break;
                
                
                  
              case 4:
        	  
        	       employee=new Employee("Manjunath","Patil","lg");
                   break;
                
                  
                   default:
                    System.out.println("Invalid choice. Enter a valid no.\n");

           }
            
            CredentialService service=new CredentialService();
            
            String emailid=service.generateEmailAddress(employee);
            String password=service.generatePassword();
            service.showCredentials(employee, password, emailid);


        } while (choice != 0);

        System.out.println("Exited Successfully!!!");

        sc.close();
	}

}
