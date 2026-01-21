/* Some important patterns : 
.	=	Matches any single character except a newline.
+	=	Matches one or more occurrences of the previous character or pattern.
*	=	Matches zero or more occurrences of the previous character or pattern.
? 	=  zero or one occurrence of the preceding character / group
\d	=	Matches any single digit from 0 to 9.
\w 	=	matches letters, digits, and underscore only — no spaces or special characters.
\s 	=   matches any whitespace character such as space, tab, or newline.
[A-Z]	=	Matches any one uppercase letter from A to Z.
[a-z]	=	Matches any one lowercase letter from a to z.
abc  =	Matches the exact sequence of characters abc in a string.
{n}	=	 exactly n occurrences of the preceding character or group
{n,m} =		is used when the number of repetitions must fall within a specific range.
 | (OR)	= 	allows matching one pattern OR another, and grouping with ( ) is highly recommended.


String.matches() can only match the entire string once and does not support searching, multiple matches, 
or reuse of the regex efficiently.

Pattern class :
	Represents a compiled regular expression
	Created once and reused
	Improves performance	
	
Matcher class :
	Applies the pattern to a specific string
	Performs actual operations like:
		find()	
		matches()
		group()
		start() / end()	
EG: 
	
import java.util.regex.*;

public class Demo {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("Java 123 and 456");

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
-------------------------------------------------------------------------------------
When should we use Pattern & Matcher?
	Use Pattern & Matcher when:
		Searching inside a string
		Finding multiple matches
		Reusing the same regex many times
		Need start/end positions
	
compile() :
	compile() converts a regex string into a reusable, optimized Pattern object.
	A regex written as a String cannot directly perform matching.
	Java first needs to understand, validate, and optimize that regex.That work is done by compile().

find() :
	find() searches the input string for the next substring that matches the regex pattern.
	present inside Matcher class.	
	
group() :
	group() returns the part of the string that was matched by the regex.
	present inside Matcher class.
	
Eg1: 
	Pattern p = Pattern.compile("\\d+");
	Matcher m = p.matcher("Java 123 and 456");

	while (m.find()) {
 	   System.out.println(m.group());
	}
output : 
	123
	456

Eg2: 

	Pattern p = Pattern.compile("(\\d{2})-(\\d{2})-(\\d{4})");
	Matcher m = p.matcher("DOB: 12-05-2024");

	if (m.find()) {
  	  System.out.println(m.group());    // full match 	12-05-2024
  	  System.out.println(m.group(1));   // first group	12
  	  System.out.println(m.group(2));   // second group	05
  	  System.out.println(m.group(3));   // third group	2024
	}
Eg3 : 
	Pattern p = Pattern.compile("(\\w+)@(\\w+\\.\\w+)");
	Matcher m = p.matcher("mail: test@gmail.com");

	if (m.find()) {
  	  System.out.println("User: " + m.group(1)); // User: test
  	  System.out.println("Domain: " + m.group(2)); // Domain: gmail.com
	}
	
start() :
	start() returns the starting index of the current match in the input string.
	present inside Matcher class.

end() :
	end() returns the index immediately after the last character of the current match.
	present inside Matcher class.
	
	
program to understand all methods.
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
Output : 
123
5
8
-----
456
13
16
-----
12
30
32
-----
05
33
35
-----
2024
36
40
-----
 */

public class regex {
    public static void main(String[] args) {
        // System.out.println("j".matches("S*j")); // true
        // System.out.println("Sj".matches("S*j")); // true
        // System.out.println("SSj".matches("S*j")); //true
        // System.out.println("SSSj".matches("S*j")); // true
        // System.out.println("Sabcj".matches("S*j")); // false
        // System.out.println("aSj".matches("S*j")); // false
        // System.out.println("jj".matches("S*j")); // false

        // System.out.println();

        // System.out.println("colr".matches("colo?r")); // true
        // System.out.println("color".matches("colo?r")); // true
        // System.out.println("coloor".matches("colo?r")); // false
        // System.out.println("abc".matches("ab(c)?")); // true
        // System.out.println("ab".matches("ab(c)?")); // true
        // System.out.println("abcd".matches("ab(c)?")); // false

        // String reg = "[Aadity]*";
        // System.out.println("Aditya".matches(reg));
        // System.out.println("AAAdddiiityaaa".matches(reg));
        // System.out.println("Additttyya".matches(reg));
        // System.out.println("dityaaa".matches(reg));
        // System.out.println("Adtttyya".matches(reg));

        // System.out.println("---------------------");

        // System.out.println("Suraj".matches(".+"));
        // System.out.println("SURAJ".matches(".+"));
        // System.out.println("suraj".matches(".+"));
        // System.out.println("SuRaJ".matches(".+"));
        // System.out.println("Suurajj".matches(".+"));
        // System.out.println("Suraj@123".matches(".+"));
        // System.out.println("S#u@j@123".matches(".+"));
        // System.out.println("123Suraj".matches(".+"));
        // System.out.println("12345".matches(".+"));

        // System.out.println("5".matches("\\d"));
        // System.out.println("0".matches("\\d"));
        // System.out.println("9".matches("\\d"));
        // System.out.println("12".matches("\\d"));
        // System.out.println("a".matches("\\d"));
        // System.out.println(" ".matches("\\d"));

        // System.out.println("---------------------");

        // System.out.println("a".matches("\\w"));
        // System.out.println("Z".matches("\\w"));
        // System.out.println("5".matches("\\w"));
        // System.out.println("_".matches("\\w"));
        // System.out.println("@".matches("\\w"));
        // System.out.println(" ".matches("\\w"));

        // System.out.println("---------------------");
        
        // System.out.println(" ".matches("\\s"));
        // System.out.println("\t".matches("\\s"));
        // System.out.println("\n".matches("\\s"));
        // System.out.println("a".matches("\\s"));
        // System.out.println("1".matches("\\s"));

        // System.out.println("---------------------");

        // System.out.println("A".matches("[A-Z]"));
        // System.out.println("Z".matches("[A-Z]"));
        // System.out.println("M".matches("[A-Z]"));
        // System.out.println("a".matches("[A-Z]"));
        // System.out.println("AA".matches("[A-Z]"));
        // System.out.println("1".matches("[A-Z]"));
        // System.out.println("@".matches("[A-Z]"));

        // System.out.println("---------------------");

        // System.out.println("a".matches("[a-z]"));
        // System.out.println("z".matches("[a-z]"));
        // System.out.println("m".matches("[a-z]"));
        // System.out.println("A".matches("[a-z]"));
        // System.out.println("aa".matches("[a-z]"));
        // System.out.println("1".matches("[a-z]"));
        // System.out.println("#".matches("[a-z]"));

        // System.out.println("---------------------");

        // System.out.println("abc".matches("abc"));
        // System.out.println("ab".matches("abc"));
        // System.out.println("abcd".matches("abc"));
        // System.out.println("aBc".matches("abc"));
        // System.out.println("ABC".matches("abc"));
        // System.out.println(" abc ".matches("abc"));

        // System.out.println("---------------------");

        // System.out.println("aaa".matches("a{3}"));
        // System.out.println("aa".matches("a{3}"));
        // System.out.println("aaaa".matches("a{3}"));

        // System.out.println("---------------------");

        // System.out.println("aaa".matches("a{2,4}"));
        // System.out.println("aa".matches("a{2,4}"));
        // System.out.println("aaaa".matches("a{2,4}"));
        // System.out.println("a".matches("a{2,4}"));
        // System.out.println("aaaaa".matches("a{2,4}"));

        // System.out.println("---------------------");

        // System.out.println("cat".matches("cat|dog"));
        // System.out.println("dog".matches("cat|dog"));
        // System.out.println("cow".matches("cat|dog"));

        // System.out.println("---------------------");

        // System.out.println("123".matches("\\d+")); 
		// System.out.println("9".matches("\\d+"));   
		// System.out.println("".matches("\\d+"));    
		
		// System.out.println("".matches("\\d*"));    
		// System.out.println("123".matches("\\d*")); 
		// System.out.println("a12".matches("\\d*")); 
		
		// System.out.println("ABC".matches("[A-Z]+"));
		// System.out.println("A".matches("[A-Z]+"));   
		// System.out.println("AbC".matches("[A-Z]+")); 
		
		// System.out.println("".matches("[A-Z]*"));    
		// System.out.println("XYZ".matches("[A-Z]*")); 
		// System.out.println("XyZ".matches("[A-Z]*")); 
		
		// System.out.println("abc".matches("[a-z]+")); 
		// System.out.println("a".matches("[a-z]+"));   
		// System.out.println("aBc".matches("[a-z]+")); 
		
		// System.out.println("".matches("[a-z]*"));    
		// System.out.println("xyz".matches("[a-z]*")); 
		// System.out.println("xYz".matches("[a-z]*")); 
		
		// System.out.println("abcabc".matches("(abc)+")); 
		// System.out.println("abc".matches("(abc)+"));   
		// System.out.println("ababc".matches("(abc)+"));  
		
		// System.out.println("".matches("(abc)*"));   
		// System.out.println("abc".matches("(abc)*"));

        System.out.println("---------------------");

        System.out.println("abc".matches("^abc$"));
		System.out.println("xabc".matches("^abc$"));
		System.out.println("abcx".matches("^abc$"));
		System.out.println("xabcx".matches("^abc$"));

        System.out.println("---------------------");
		
		System.out.println("12345".matches("^\\d+$"));
		System.out.println("123a".matches("^\\d+$"));
		System.out.println("12 3".matches("^\\d+$"));

        System.out.println("---------------------");
		
		System.out.println("color".matches("^colo?r$"));
		System.out.println("colr".matches("^colo?r$"));
		System.out.println("coloor".matches("^colo?r$"));

        System.out.println("---------------------");
		
		System.out.println("100".matches("\\d\\d?\\d"));
		System.out.println("10".matches("\\d\\d?\\d"));
		System.out.println("1".matches("\\d\\d?\\d"));

        System.out.println("---------------------");
		
		System.out.println("abc123".matches("\\w+"));
		System.out.println("A_B9".matches("\\w+"));
		System.out.println("abc-123".matches("\\w+"));

        System.out.println("---------------------");
		
		System.out.println("".matches("\\w*"));
		System.out.println("Test_01".matches("\\w*"));
		System.out.println("Test 01".matches("\\w*"));

        System.out.println("---------------------");
		
		System.out.println("User_123".matches("^\\w+$"));
		System.out.println("User-123".matches("^\\w+$"));
		System.out.println("User 123".matches("^\\w+$"));

        System.out.println("---------------------");
		
		System.out.println("abc_123".matches("\\w+")); 
		System.out.println("abc_123".matches("[A-Za-z0-9_]+"));
        
        System.out.println("---------------------");
		
		System.out.println("   ".matches("\\s+"));
		System.out.println("\t\t".matches("\\s+"));
		System.out.println(" ".matches("\\s+"));
		System.out.println(" a ".matches("\\s+"));

        System.out.println("---------------------");
		
		System.out.println("".matches("\\s*"));
		System.out.println("   ".matches("\\s*"));
		System.out.println(" a ".matches("\\s*"));

        System.out.println("---------------------");
			
		System.out.println("   ".matches("^\\s+$"));
		System.out.println(" \t ".matches("^\\s+$"));
		System.out.println(" a ".matches("^\\s+$"));

        System.out.println("---------------------");
		
		System.out.println("1234".matches("\\d{4}"));
		System.out.println("123".matches("\\d{4}"));
		System.out.println("12345".matches("\\d{4}"));

        System.out.println("---------------------");
		
		System.out.println("ABC".matches("[A-Z]{3}"));
		System.out.println("AB".matches("[A-Z]{3}"));
		System.out.println("ABCD".matches("[A-Z]{3}"));

        System.out.println("---------------------");
		
		System.out.println("abcabc".matches("(abc){2}"));
		System.out.println("abc".matches("(abc){2}"));

        System.out.println("---------------------");
		
		System.out.println("9999".matches("^\\d{4}$"));
		System.out.println("99a9".matches("^\\d{4}$"));
		System.out.println("999".matches("^\\d{4}$"));	

        System.out.println("---------------------");
		
		System.out.println("123".matches("\\d{3,5}"));
		System.out.println("12345".matches("\\d{3,5}"));
		System.out.println("12".matches("\\d{3,5}"));
		System.out.println("123456".matches("\\d{3,5}"));

        System.out.println("---------------------");
		
		System.out.println("ABCD".matches("[A-Z]{2,5}"));
		System.out.println("AB".matches("[A-Z]{2,5}"));
		System.out.println("ABCDE".matches("[A-Z]{2,5}"));
		System.out.println("A".matches("[A-Z]{2,5}"));

        System.out.println("---------------------");
		
		System.out.println("abcabc".matches("(abc){2,3}"));
		System.out.println("abcabcabc".matches("(abc){2,3}"));
		System.out.println("abc".matches("(abc){2,3}"));

        System.out.println("---------------------");
		
		System.out.println("9876543210".matches("^[6-9]\\d{9,10}$"));
		System.out.println("987654321".matches("^[6-9]\\d{9,10}$"));	

        System.out.println("---------------------");
		
		System.out.println("cat".matches("^(cat|dog)$"));
		System.out.println("dog".matches("^(cat|dog)$"));
		System.out.println("catdog".matches("^(cat|dog)$"));

        System.out.println("---------------------");
		
		System.out.println("A".matches("[A-Z]|[a-z]"));
		System.out.println("a".matches("[A-Z]|[a-z]"));
		System.out.println("1".matches("[A-Z]|[a-z]"));

        System.out.println("---------------------");
		
		System.out.println("123".matches("\\d+|[A-Z]+"));
		System.out.println("ABC".matches("\\d+|[A-Z]+"));
		System.out.println("A1".matches("\\d+|[A-Z]+"));

        System.out.println("---------------------");
		
		System.out.println("Mr".matches("(Mr|Mrs|Ms)"));
		System.out.println("Mrs".matches("(Mr|Mrs|Ms)"));
		System.out.println("Ms".matches("(Mr|Mrs|Ms)"));
		System.out.println("Dr".matches("(Mr|Mrs|Ms)"));

        System.out.println("---------------------");
		
		System.out.println("UPI".matches("^(UPI|CASH|CARD)$"));
		System.out.println("NET".matches("^(UPI|CASH|CARD)$"));



    }
}
