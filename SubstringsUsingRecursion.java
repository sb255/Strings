//-- FINDING ALL POSSIBLE SUBSTRINGS OF A STRING USING RECURSION 

public class Test{
    
    public static void findSubstring(String s, int start, int end){
    
        //-- BASE CASE
        if(start>end){
        }
        
        else if(start<end){
            System.out.println(s.substring(start, end));
            findSubstring(s,start+1,end);
        }
        
        else{
            findSubstring(s, 0, end-1);
        }
        
            
    }

    public static void main(String[] args){
        
        String test = "He was a great java programmer";
        findSubstring(test, 0, test.length());
    }
    
}
