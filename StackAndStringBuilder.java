/* 
 *   String Question
 *
 *   Input: "TOY"
 *
 *   Output: return a String "Y-O" for the given input.
 *
*/
 
import java.util.*;


public class StackAndStringBuilder{

    static String StringManipulation(String s){
    
        Stack<Character> st = new Stack<>(); 
        
        for(int i=0; i<s.length(); i++){
            st.push(s.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder(); 
        
        sb.append(st.pop()); 
        sb.append("-"); 
        sb.append(st.pop()); 
        
        return sb.toString();
    }
    
    public static void main(String[] args){
        
       String input = "TOY";
       
       System.out.print(StringManipulation(input));
        
    }
        
}


