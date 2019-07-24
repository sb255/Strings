/* String Question
 *
 * Uppercaseing the selected letters in a Stirng!
 *
 * Input: helloworld
 *
 * Output: HelloWorld
*/

import java.util.*;


public class UpperCaseSelectedLetters{

    
    public static void main(String[] args){

        String input = "helloworld"; 
        
        String output = input.substring(0,1).toUpperCase() + input.substring(1,5) + 
                        
                        input.substring(5,6).toUpperCase() + input.substring(6); 
        
        System.out.println(output);
    }
        
}


