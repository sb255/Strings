# String Methods: 


## Replace: 

```java
s = s.replaceAll("name", "firstName");
```
  
### It will replace all the occurance of the word having value 'name' with 'firstName'.

------------------------------------------------------------------------------------------------------------------------------------------
2. Comparison:-
  ( (s.isEmpty()) ? "Empty String" : s);
------------------------------------------------------------------------------------------------------------------------------------------
3. Taking the input from user:-
  Scanner in = new Scanner(System.in);
  String s = in.next(); {Spaces will not be tackled}  OR 
  String s=in.nextLine(); {The letters in the entire line will be considered including spaces}
------------------------------------------------------------------------------------------------------------------------------------------
4. Equlaity and Inequality operation in String:-
  if(!test.equals("SOS")) {.equlas method is used to check whether to Strings are equal or not}
------------------------------------------------------------------------------------------------------------------------------------------
5. Substring method:-
  test = sb.substring(0,3); {Remember that the index '3' will not be considered on the substring, it is omitted}
------------------------------------------------------------------------------------------------------------------------------------------
6. charAt(i):- This is method for a String
  Usage:- if(test.charAt(0)!='S') where 'test' is a String
------------------------------------------------------------------------------------------------------------------------------------------
7. Creating an Character Array from a String:-
  char name[] = s.toLowerCase().toCharArray(); {where 's' is a String}
8. Getting the character for a particular Ascii value:-
  char character= (char) i;
  where i can be between 97 and 122 for a-z and can be between 65 and 90 for A-Z
------------------------------------------------------------------------------------------------------------------------------------------
9. Getting the Ascii value for a particular character in a String
  char character = sb.charAt(i); 
  int ascii = (int) character; {(int) is a type casting which is not required} {we are just trying to get the int value of character}
 ------------------------------------------------------------------------------------------------------------------------------------------  
10. Setting the character at particular index in the string
   sb.setCharAt(i,newsc);  {where sb is the string and i is the index}
-----------------------------------------------------------------------------------------------------------------------------------------









