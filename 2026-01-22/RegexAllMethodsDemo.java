// String.matches() can only match the entire string once and does not support searching, multiple matches, 
// or reuse of the regex efficiently.

// Pattern class :
// 	Represents a compiled regular expression
// 	Created once and reused
// 	Improves performance	
	
// Matcher class :
// 	Applies the pattern to a specific string
// 	Performs actual operations like:
// 		find()	
// 		matches()
// 		group()
// 		start() / end()	
// EG: 
	
// import java.util.regex.*;

// public class Demo {
//     public static void main(String[] args) {

//         Pattern p = Pattern.compile("\\d+");
//         Matcher m = p.matcher("Java 123 and 456");

//         while (m.find()) {
//             System.out.println(m.group());
//         }
//     }
// }
// -------------------------------------------------------------------------------------
// When should we use Pattern & Matcher?
// 	Use Pattern & Matcher when:
// 		Searching inside a string
// 		Finding multiple matches
// 		Reusing the same regex many times
// 		Need start/end positions
	
// compile() :
// 	compile() converts a regex string into a reusable, optimized Pattern object.
// 	A regex written as a String cannot directly perform matching.
// 	Java first needs to understand, validate, and optimize that regex.That work is done by compile().

// find() :
// 	find() searches the input string for the next substring that matches the regex pattern.
// 	present inside Matcher class.	
	
// group() :
// 	group() returns the part of the string that was matched by the regex.
// 	present inside Matcher class.
	
// Eg1: 
// 	Pattern p = Pattern.compile("\\d+");
// 	Matcher m = p.matcher("Java 123 and 456");

// 	while (m.find()) {
//  	   System.out.println(m.group());
// 	}
// output : 
// 	123
// 	456

// Eg2: 

// 	Pattern p = Pattern.compile("(\\d{2})-(\\d{2})-(\\d{4})");
// 	Matcher m = p.matcher("DOB: 12-05-2024");

// 	if (m.find()) {
//   	  System.out.println(m.group());    // full match 	12-05-2024
//   	  System.out.println(m.group(1));   // first group	12
//   	  System.out.println(m.group(2));   // second group	05
//   	  System.out.println(m.group(3));   // third group	2024
// 	}
// Eg3 : 
// 	Pattern p = Pattern.compile("(\\w+)@(\\w+\\.\\w+)");
// 	Matcher m = p.matcher("mail: test@gmail.com");

// 	if (m.find()) {
//   	  System.out.println("User: " + m.group(1)); // User: test
//   	  System.out.println("Domain: " + m.group(2)); // Domain: gmail.com
// 	}
	
// start() :
// 	start() returns the starting index of the current match in the input string.
// 	present inside Matcher class.

// end() :
// 	end() returns the index immediately after the last character of the current match.
// 	present inside Matcher class.
	
	
// program to understand all methods.
import java.util.regex.*;

public class RegexAllMethodsDemo {
    public static void main(String[] args) {

        String text = "Java 123 and 456 released on 12-05-2024";

        Pattern pattern = Pattern.compile("(\\d+)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println("-----");
        }
    }
}
// Output : 
// 123
// 5
// 8
// -----
// 456
// 13
// 16
// -----
// 12
// 30
// 32
// -----
// 05
// 33
// 35
// -----
// 2024
// 36
// 40
// -----



// ?=   positive lookahead
// Check something ahead, but don’t take it as part of the match
// ----------------------------------------------------------------
// Eg1 : 
// 		String input = "A1 B2 C3 D";

//         Pattern p = Pattern.compile("\\w?=\\d");
//         Matcher m = p.matcher(input);

//         while (m.find()) {
//             System.out.println(m.group());
//         }

// Output : 
// A1 
// B2
// C3
// ------------------------------------------------------------

// Eg2 : 
// 		String input = "A1 B2 C3 D";	

//         Pattern p = Pattern.compile("\\w(?=\\d)");
//         Matcher m = p.matcher(input);

//         while (m.find()) {
//             System.out.println(m.group());
//         }
//  output : 
//  A
//  B
//  C       
//  ------------------------------------------------------------