import java.io.*;    // for File
import java.util.*;  // for Scanner


//here is our main program
public class ByeFelishaMainProgram{
    public static void main(String[] args){
        File areaCode = new File("areaCode.txt"); //list of area codes and the U.S. state associated with the code
        File database = new File("database.txt"); //create a new file and will output scam numbers from blacklist to this file
        PrintStream database = new PrintStream(database);
        List<String> AREA_CODE = new ArrayList<>(); //will push all the area codes from text file to this arraylist
        List<String> SCAM_NUMBER = new ArrayList<>(); //this list will hold all the random scam phone numbers

    }
        }



//here is our class
public class ByeFelisha {

    public ByeFelisha() //constructor for Shasak to set up username and stuffs
    {
    }

    //adding scam phone numbers from blacklist to database
    public void addScamNumber(Scanner input, List<String> AREA_CODE, List<String> SCAM_NUMBER) {
        while (input.hasNext()) {
            if (input.hasNextInt()) {
                String area = input.nextInt();
                AREA_CODE.add(String.valueOf(area));
            } // adding all the area codes from text file to the arrayList AREA_CODE
            else input.next();
        }
         //create random number by (1) taking a random area code from AREA_CODE and (2) randomly generate 7 digit number
        Random rand = new Random();
        for (int i = 0; i < 500; i++) {//generate 500 random scam numbers
            int randomArea = rand.nextInt(AREA_CODE.size()); //random from 0-the number of area codes available
            String numberGenerated = "";
            numberGenerated = numberGenerated + AREA_CODE.get(randomArea); //choose a random area code
            for (int i = 0; i < 7; i++) {  //generate 7 digit number following after area code
                int randomNumber = rand.nextInt(10);  //random from 0-9
                numberGenerated = numberGenerated + String.valueOf(randomNumber);
            }
            SCAM_NUMBER.add(numberGenerated); //add the full 9-digit number to this list, this is considered the database blacklist we are going to use
        }
    }
    
    
    
}
 
