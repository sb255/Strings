/* 
 * use of split(" ") in Strings 
 * 
 */

import java.util.*;

public class SplitString{
        
    public static void main(String[] args){
        
        String s = "Hello Welcome to the String World"; 
        
        Stack<String> ss = new Stack<>(); 
        
        for(String x : s.split(" ")){
            
            ss.push(x);
            
        }
        
        int size = ss.size(); 
        
        for(int i=0; i<size; i++){
        
            System.out.print(ss.pop()+" ");
        
        }
        
    }
        
}


