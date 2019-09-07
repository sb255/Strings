<p align="center">
  <img src=Pictures/Heading.png  title="Strings in Java">
</p>


#### `String is a class in Java, it has following methods:`

| SN | String Method | Method Usage | Return Type
| :----: | :---: | :---: | :---: |
| 1 | `length()` | It returns the length of the String | `int`
| 2 | `charAt(int index)` | It returns the character from the String at mentioned Index | `char`
| 3 | `toCharArray()` | Converts the String into a char array | `char[]`
| 4 | `setCharAt(int index, char c)` | Sets the character at the specified index of the String | `void`
| 5 | `toLowerCase()` | Converts all the characters of the String into lower case | `String`
| 6 | `toUpperCase()` | Converts all the characters of the String into upper case | `String`
| 7 | `isEmpty()` | It returns true is the String is not null else false | `boolean`
| 8 | `substring(int start, int end)` | It returns the String starting from index 'start' and ending at index 'end - 1'  | `String`
| 9 | `substring(int start)` | It returns the String starting at index 'start' until the last character of the String | `String`
| 10 | `equals()` | It returns true if the Strings are same else false | `boolean`
| 11 | `compareTo(String s2)` | It returns -1 if first String is lexicographically smaller than String s2 else it returns 1. It returns 0 in case if both the Strings are same lexicographically | `int`
| 12 | `replace(char a, char b)` | It replace all the 'a' character occurrence with 'b' | `String`
| 13 | `replaceAll(String regular_expression, String replacement)` | Replace all the character sequence matching 'regular_expression' with 'replacement' | `String`
| 14 | `replaceAll("//w", "")` | It used for removing all the word characters from the String | `String`
| 15 | `replaceAll("//W", "")` | It used for removing all the characters from the String that are not word characters | `String`
| 16 | `replaceAll("//s", "")` | It used for removing all the white spaces from the String | `String`
| 17 | `replaceAll("[-+.^:,]","")` | It used for removing all the special characters from the String | `String`
| 18 | `replaceAll("\\p{Punct}", "")` | It used for removing all the punctuations from the String | `String`
| 19 | `replaceAll("\\p{Blank}","")` | It used for removing all the spaces and tabs from the String | `String`
| 20 | `trim()` | It removes the leading and trailing spaces from the String | `void`
| 21 | `split(String regular_expression)` | Splits the String at every occurrence of specified regular expression | `String[]`
| 22 | `matches(String regular_expression)` | It returns true if the String matches regular expression else false | `boolean`
| 23 | `indexOf(String s)` | It returns the index of the given String 's' | `int`
| 24 | `indexOf(String s, int startIndex)` | It returns the index of the given String when started from 'startIndex' | `int`
| 25 | `indexOf(char c)` | It returns the index of the given character in the String | `int`
| 26 | `indexOf(char c, int startIndex)` | It returns the index of the given character in the String when started from 'startIndex' | `int`
| 27 | `subSequence(int start, int end)` | It returns character sequence from index 'start' to index 'end-1' | `charSequence`
| 28 | `contains(CharSequence char_set)` | It returns true is the character sequence matches else false | `boolean`



#### `StringBuilder is a class in Java, it creates sequence of characters that are mutable. It has following methods:`

| SN | StringBuilder Methods | Method Usage | Return Type
| :----: | :---: | :---: | :---: |
| 1 | `reverse()` | It reverses the sequence of the characters | `StringBuilder`
| 2 | `append(char c)` | Appends the character to this String | `void`
| 3 | `append(String s)` | Appends the String to this String | `void`
| 4 | `toString()` | It returns the String representation of StringBuilder object | `String`
| 5 | `length()` | It returns the length of the sequence of characters | `int`
| 6 | `setCharAt(int index, char c)` | It sets the character at the specified index and return a new String | `StringBuilder`
| 7 | `delete(int startIndex, int endIndex)` | It returns the String Builder object after deleting the characters at the specified Index range | `StringBuilder`
| 8 | `deleteCharAt(int index)` | It deletes the character at the specified Index from the sequence of characters | `StringBuilder`
| 9 | `replace(int startIndex, int endIndex, String s)` | It replace the sequence of characters with String 's' in the specified Index range | `StringBuilder`

### `Regular Expressions in Java:`

> `\d` represents any digit in regular expression but `\` is a backlash character in java so to convert `\` into a literal we add another `\` so that `\d` can be considered as literal in regular expression!

Check all these regular expressions on a Java program

| SN | Java Regex String | Description
| :----: | :---: | :---:
| 1 | `[A-Za-z]` | It matches a single character with all the uppercase and lowercase characters
| 2 | `[A-Za-z]?` | It matches zero or one character with all the uppercase and lowercase characters
| 3 | `[A-Za-z]*` | It matches zero or more than zero characters with all the uppercase and lowercase characters
| 4 | `[^A-Za-z]+` | It matches a single or more characters with everything except A-Za-z
| 5 | `[^A-Za-z]{2}` | It matches exactly two characters with everything except A-Za-z
| 6 | `[A-Za-z0-9]` | It matches all the uppercase and lowercase alphanumeric characters
| 7 | `[A-Za-z0-9]{1,5}` | It matches minimum 1 and maximum 5 uppercase and lowercase alphanumeric characters
| 8 | `[A-Za-z !,?._'@]+` | It matches 1 or more than 1 lowercase and uppercase alphabets along with special characters
| 9 | `[-+.^:,]` | It matches a single character with all the special characters
| 10 | `.` | It matches with a character of any kind
| 11 | `\\d{1}` | It matches with a single digit
| 12 | `\\d{1,3}` | It matches with a numerical value having 1 to 3 digits
| 13 | `[\\d]{1}` | It matches with a single digit
| 14 | `[0-5]` | It matches with a single digit ranging from 0 to 5
| 15 | `\\s` | It matches with single white space character
| 16 | `[\\s]` | It matches with single white space character

## `Implementations:`

#### `Taking the input from user:`

```java  
Scanner in = new Scanner(System.in);
String s = in.next(); /* Spaces will not be tackled */
String s=in.nextLine(); /* The letters in the entire line will be considered including spaces */
```

---------------------------------------------------------------------------------------------

#### `Getting the character for a particular Ascii value:`

```java
char character= (char) i;
```

------------------------------------------------------------------------------------------------------------------------------------------

#### `Getting the Ascii value for a particular character in a String:`

```java
char character = sb.charAt(i);
int ascii = (int) character;
```

-----------------------------------------------------------------------------------------------------------------------------------------

#### `Matching with a regular expression:`

```java

String s = "*******@gmail.com"

Pattern p = Pattern.compile(".+@gmail\\.com$");

Matcher matcher = p.matcher(s);

if(matcher.find()){
    System.out.println("The Person has a Gmail account!");
}

```
---------------------------------------------------------------------------------------------
