# String Methods: --- 

***Stacks** and **HashMaps** are the two important Data Structures for solving String questions, always consider 'em, have a look at some String methods:* 

* #### Replace: 

```java
s = s.replaceAll("name", "firstName");
```
  
#### It will replace all the occurance of the word having value 'name' with 'firstName'.

------------------------------------------------------------------------------------------------------------------------------------------

* #### Comparison:

```java
( (s.isEmpty()) ? "Empty String" : s);
```

------------------------------------------------------------------------------------------------------------------------------------------

* #### Taking the input from user:

```java  
Scanner in = new Scanner(System.in);
String s = in.next(); /* Spaces will not be tackled */ 
String s=in.nextLine(); /* The letters in the entire line will be considered including spaces */
```

------------------------------------------------------------------------------------------------------------------------------------------

* #### Equlaity and Inequality operation in String:

```java
 if(!test.equals("SOS")); 
```

#### equals method is used to check whether the Strings are equal or not!

------------------------------------------------------------------------------------------------------------------------------------------

* #### Substring method:

```java
String sb = "HelloWorld"; 
``` 

```java
String Test = sb.substring(0,3); 
```

```java
Test = "Hel"; 
```
#### Remember that the index '3' will not be considered on the substring, it is omitted.

------------------------------------------------------------------------------------------------------------------------------------------

* #### charAt(i):  

 ```java
if(test.charAt(0)!='S') 
```
#### where 'test' is a String.

------------------------------------------------------------------------------------------------------------------------------------------

* #### Creating an Character Array from a String:

```java
char name[] = s.toLowerCase().toCharArray(); /* where 's' is a String */
```

---------------------------------------------------------------------------------------------

* #### Getting the character for a particular Ascii value:
  
```java
char character= (char) i;
```

#### where i can be between 97 and 122 for a-z and can be between 65 and 90 for A-Z. 

------------------------------------------------------------------------------------------------------------------------------------------

* #### Getting the Ascii value for a particular character in a String:

```java
char character = sb.charAt(i); 
int ascii = (int) character; 
```
#### (int) is a type casting which is not required.

 ------------------------------------------------------------------------------------------------------------------------------------------  

* #### Setting the character at particular index in the string:

```java
sb.setCharAt(i,newsc);
```

#### where sb is the string and i is the index. 

-----------------------------------------------------------------------------------------------------------------------------------------

# String Operations: 

#### Matching with a regular expression:

```java

String s = "*******@gmail.com"

Pattern p = Pattern.compile(".+@gmail\\.com$");

Matcher matcher = p.matcher(s);

if(matcher.find()){
    System.out.println("The Person has a Gmail account!"); 
}

```
---------------------------------------------------------------------------------------------







