/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callblockermine1;

/**
 *
 * @author jencd
 */
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.*;    // for File
import java.util.*;  // for Scanner

/*public class CallBlockerMine1
{

    /**
     * @param args the command line arguments
     */

/*
    public static void main(String[] args) throws Exception
    {
        String string;
        int lineNumber = 0;
        int phoneNumber;
        int count = 0;
        
        // TODO code application logic here
        File file = new File("C:\\Users\\jencd\\Documents\\Jencie Daniel1\\Texas Tech University\\Software Engineering I\\"
                + "Call Blocker\\CallBlockerMine1\\Numbers.txt");
        
       BufferedReader reader = new BufferedReader(new FileReader(file));
       
       while ((string = reader.readLine()) != null)
       {
           lineNumber++;
           
       }
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(file); 
  
    //while (sc.hasNextLine()) 
      //System.out.println(sc.nextLine()); 
    
    System.out.println("");
    System.out.print("Enter the phone number to check if it is a spam number that is our system: ");
    int number = input.nextInt();
    
    
   //   int x = 3;
   //   int counter = 0;
    
     /*   for(; number != 0; number/=10, ++count) 
        {   
        } */

    // Read all the numbers in the file, and count how many times x appears.
  /*  while(sc.hasNextInt() == true) 
    {
        int list = sc.nextInt();
        if(list == number)
        {
            System.out.println("Call is a scam. Call Blocked.");
            break;
           
        }
        
        if(sc.hasNextInt() == false)
        {
            System.out.println("Number is not in the system, call is not blocked.");
            
        }
        
     /*   else if (count != 10)
        {
            System.out.println("Invalid number.");
        } 8
                
    }
    
  /*  while(sc.hasNextInt()) 
    {
      //  int number = input.nextInt();
        if(number == )
        
            counter++;
    }*/

   
  /*      
    }
    }
}
*/




//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
public class CallBlockerMine1
{
*/
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */

/*
    public static void main(String[] args) throws Exception
    {
        
        String string;
        int lineNumber = 0;
        double phoneNumber;
        int count = 0;
        
        
        // TODO code application logic here
        File file = new File("C:\\Users\\jencd\\Documents\\Jencie Daniel1\\Texas Tech University\\Software Engineering I\\"
                + "Call Blocker\\CallBlockerMine1\\Numbers.txt");
        
       BufferedReader reader = new BufferedReader(new FileReader(file));
       
       
       
       while ((string = reader.readLine()) != null)
       {
           lineNumber++;
           
       }
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(file); 
  
 //   while (sc.hasNextLine()) 
  //    System.out.println(sc.nextLine()); 
    
    System.out.println("");
   /* do 
        {
        try 
            {
                System.out.print("Enter the phone number to check if it is a spam number that is our system: ");
                int number = input.nextInt(); 
                while(number != 0)
            {       
                    number /= 10;
                    ++count;
            }
                while(sc.hasNextInt() == true)
                {
                    int list = sc.nextInt();
                    if(list == number)
                    {
                        System.out.println("Call is a scam. Call Blocked.");
                        break;
                    }
        
                    else if (sc.hasNextInt() == false)
                    {
                        System.out.println("Number is not in the system, call is not blocked.");
                    }
                
                }    
            } 
    catch (InputMismatchException e) 
    {
        while (count <= 10)
        {
            System.out.print("Enter valid phone number ");
        }
    }
    input.nextLine(); // clears the buffer
    */
   
    
   /*
    System.out.print("Enter the phone number to check if it is a spam number that is our system: ");
        long number = input.nextLong(); 
                
    while(number != 0)
    {
        number /= 10;
        count++;
    }

   //  Read all the numbers in the file, and count how many times x appears.
    while(sc.hasNextLong() == true) 
    {
        long list = sc.nextLong();
        if(list == number && count == 10)
        {
            System.out.println("Call is a scam. Call Blocked.");
            break;
        }
        
        else if (sc.hasNextLong() == false && count == 10)
        {
            System.out.println("Number is not in the system, call is not blocked.");
        }
        
        else if(count != 10)
        {
            System.out.println("Invalid Number.");
            break;
        }
                
    }  
    try
        {
            if(count != 10)
            {
                 while(number != 0)
                {       
                    number /= 10;
                    ++count;
                }
            }
        }
    catch(InputMismatchException e)
            {
                System.out.println("Invalid number, the value you entered has: " + e.getMessage());
            }
    }
        
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

*/

public class CallBlockerMine1
{
    

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */


    public static void main(String[] args) throws Exception
    {
        
        String string;
        String number;
        int lineNumber = 0;
        double phoneNumber;
        int count = 0;
        
        
        // TODO code application logic here
        File file = new File("C:\\Users\\jencd\\Documents\\Jencie Daniel1\\Texas Tech University\\Software Engineering I\\"
                + "Call Blocker\\CallBlockerMine1\\Numbers.txt");
        
       BufferedReader reader = new BufferedReader(new FileReader(file));
       
       
       
       while ((string = reader.readLine()) != null)
       {
           lineNumber++;
           
       }
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(file); 
  
 //   while (sc.hasNextLine()) 
  //    System.out.println(sc.nextLine()); 
    
    System.out.println("");
   /* do 
        {
        try 
            {
                System.out.print("Enter the phone number to check if it is a spam number that is our system: ");
                int number = input.nextInt(); 
                while(number != 0)
            {       
                    number /= 10;
                    ++count;
            }
                while(sc.hasNextInt() == true)
                {
                    int list = sc.nextInt();
                    if(list == number)
                    {
                        System.out.println("Call is a scam. Call Blocked.");
                        break;
                    }
        
                    else if (sc.hasNextInt() == false)
                    {
                        System.out.println("Number is not in the system, call is not blocked.");
                    }
                
                }    
            } 
    catch (InputMismatchException e) 
    {
        while (count <= 10)
        {
            System.out.print("Enter valid phone number ");
        }
    }
    input.nextLine(); // clears the buffer
    */
   
    
   
    System.out.print("Enter the phone number to check if it is a spam number that is our system: ");
        number = input.nextLine(); 
                
    
     for (int i = 0, len = number.length(); i < len; i++) 
     {
        if (Character.isDigit(number.charAt(i))) 
        {
            count++;
        }
     }
     
   //  Read all the numbers in the file, and count how many times x appears.
    while(sc.hasNextLine() == true) 
    {
        String list = sc.nextLine();
        if((list).equals(number) && count == 10)
        {
            System.out.println("Call is a scam. Call Blocked.");
            break;
        }
        
        else if (sc.hasNextLine() == false && count == 10)
        {
            System.out.println("Number is not in the system, call is not blocked.");
        }
        
        else if(count != 10)
        {
            System.out.println("Invalid Number.");
            break;
        }
                
    }  
 /*   try
        {
            if(count != 10)
            {
                 while(number != "")
                {       
                     for (int i = 0, len = number.length(); i < len; i++) 
                     {
                        if (Character.isDigit(number.charAt(i))) 
                        {
                            count++;
                        }
                    }
                }
            }
        }
    catch(InputMismatchException e)
            {
                System.out.println("Invalid number, the value you entered has: " + e.getMessage());
            }
*/
    }
        
}
