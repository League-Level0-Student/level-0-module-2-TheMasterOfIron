//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;


public class StringMethods1 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to whatever you want
String String = "variable";
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		char three = String.charAt(2);
		System.out.println(three);
		// 3. Print the length of your String to the console.
		//    HINT: .length
System.out.println(String.length());;
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
for (int i = 0; i < String.length(); i++) {
	System.out.println(String.charAt(i));
}
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
char j = 'i';
		for (int e = 0; e < String.length(); e++) {
			if(j==String.charAt(e))
			System.out.println("i is at index " + e + ".");
			
		}
	}
}