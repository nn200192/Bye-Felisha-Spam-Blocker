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

public class CallBlockerMine1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        String string;
        int lineNumber = 0;
        int phoneNumber;
        
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
    System.out.print("Enter the phone number to check if it is a spam number that is our system: ");
    int number = input.nextInt();
    
    
      int x = 3;
    int counter = 0;

    // Read all the numbers in the file, and count how many times x appears.
   // while(sc.hasNextInt()) 
    {
        int list = sc.nextInt();
        if(list == number)
        {
            System.out.println("Call is a scam. Call Blocked.");
        }
        
        else if (list != number)
        {
            System.out.println("Number is not in the system, call is not blocked.");
        }
                
    }
    
  /*  while(sc.hasNextInt()) 
    {
      //  int number = input.nextInt();
        if(number == )
            counter++;
    }*/

   
        
    }
}
