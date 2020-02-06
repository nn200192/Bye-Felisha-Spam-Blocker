// Author: vw-liane
// File Name: usecase5.java
// Submission: Project Release #1-Individual Draft

// Description: Within ByeFelisha program system, when user chooses option 4
//  (see <sketch-of-program.txt>) "Display Blocked Calls", program reads file
//  created by usecase1. The file name to read is:  <user_log_blocked_calls.txt>

import java.nio.file.*;
import java.io.*;
import java.util.stream.Stream;
import java.util.*;  

public class usecase5 
{
    // number of calls blocked from calling user
    static int numBlock = 0; 

    public static void main(String[] args) throws IOException
    {
        // find file with list of user blocked calls
        Path path1 = Paths.get("user_log_blocked_calls.txt");

        // try opening file
        try (Stream<String> content = Files.lines(path1))
        {
            // do stuff with each line
            content.forEach((String line) -> 
            {
                numBlock++;
                System.out.println(line);
            } // END CONTENT.FOREACH
            );
            System.out.println("These phone numbers have been blocked "
                    + "from calling you.");
            System.out.println("\nYou have a total of " + numBlock + 
                    " blocked calls.");
        }// END TRY STREAM   
    } // END MAIN-USECASE-five

} // END PUBLIC CLASS
