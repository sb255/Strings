<p align="center">
  <img src=Pictures/Heading.png  title="Strings in Java">
</p>


#### `String is a class in Java, it has following methods:`

| SN | String Method | Method Description | Return Type
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
| 11 | `replace(char a, char b)` | It replace all the 'a' character occurrence with 'b' | `String`
| 12 | `replaceAll(String regular_expression, String replacement)` | Replace all the character sequence matching 'regular_expression' with 'replacement' | `String`
| 12 | `replaceAll("//s", "")` | Removes all the white spaces from the String | `String`
| 13 | `trim()` | It removes the leading and trailing spaces from the String | `void`
| 14 | `split(String regular_expression)` | Splits the String at every occurrence of specified regular expression | `String[]`
| 15 | `matches(String regular_expression)` | It returns true if the String matches regular expression else false | `boolean`
| 16 | `indexOf(String s)` | It returns the index of the given String 's' | `int`
| 17 | `indexOf(String s, int startIndex)` | It returns the index of the given String when started from 'startIndex' | `int`
| 18 | `indexOf(char c)` | It returns the index of the given character in the String | `int`
| 19 | `indexOf(char c, int startIndex)` | It returns the index of the given character in the String when started from 'startIndex' | `int`
| 20 | `subSequence(int start, int end)` | It returns character sequence from index 'start' to index 'end-1' | `charSequence`
| 21 | `contains(CharSequence char_set)` | It returns true is the character sequence matches else false | `boolean`



#### `StringBuilder is a class in Java, it creates mutable sequence of characters or a mutable String. It has following methods:`

| SN | StringBuilder Methods | Method Description | Return Type
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
