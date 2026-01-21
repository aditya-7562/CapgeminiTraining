# Regular Expressions (Regex) in Java

## 1. Overview
Regular Expressions (Regex) provide a way to describe patterns in text. In Java, the `java.util.regex` package provides classes to match character sequences against patterns.

## 2. Important Patterns & Metacharacters

| Symbol | Description | Example |
| :--- | :--- | :--- |
| `.` | Matches any single character except a newline. | `a.b` matches "acb", "a@b" |
| `+` | Matches one or more occurrences of the previous character/group. | `a+` matches "a", "aa", "aaa" |
| `*` | Matches zero or more occurrences. | `a*` matches "", "a", "aa" |
| `?` | Matches zero or one occurrence. | `colou?r` matches "color", "colour" |
| `\d` | Matches any single digit (0-9). | `\d` matches "5" |
| `\w` | Matches word characters (letters, digits, underscore). | `\w` matches "A", "9", "_" |
| `\s` | Matches any whitespace (space, tab, newline). | |
| `[A-Z]` | Matches any uppercase letter A-Z. | |
| `[a-z]` | Matches any lowercase letter a-z. | |
| `{n}` | Exactly `n` occurrences. | `\d{4}` matches "2024" |
| `{n,m}` | Between `n` and `m` occurrences. | `\d{2,4}` matches "12", "123", "1234" |
| `\|` | Logical OR. | `cat\|dog` matches "cat" or "dog" |
| `^` | Start of line/string. | `^A` matches "Apple" (if at start) |
| `$` | End of line/string. | `z$` matches "jazz" (if at end) |

## 3. Java Regex Classes

### `Pattern` Class
*   Represents a compiled regular expression.
*   **Method:** `Pattern.compile(String regex)` compiles the regex into a pattern object.
*   **Optimization:** Creating a `Pattern` instance is preferred when the same regex is reused multiple times for performance.

### `Matcher` Class
*   Engine that interprets the pattern and performs match operations against an input string.
*   **Creation:** `Matcher m = pattern.matcher("input string");`

### `String` Class Convenience
*   `String.matches(regex)`: Useful for simple, one-off checks. It internally compiles a pattern but is less efficient for repeated use.

## 4. Key Methods

### Matcher Methods
*   **`find()`**: Scans the input sequence looking for the next subsequence that matches the pattern. Returns `true` if found.
*   **`matches()`**: Attempts to match the **entire** region against the pattern.
*   **`group()`**: Returns the input subsequence matched by the previous match.
    *   `group(0)` or `group()`: The entire match.
    *   `group(n)`: The nth capturing group `(...)`.
*   **`start()`**: Returns the start index of the match.
*   **`end()`**: Returns the offset after the last character matched.

## 5. Usage Scenarios

**When to use `String.matches()`?**
*   Simple validation (e.g., checking if a string is a valid number).
*   One-off operations where performance is not critical.

**When to use `Pattern` & `Matcher`?**
*   Searching for substrings within a larger text.
*   Finding multiple occurrences (`while(m.find())`).
*   Extracting specific parts of the text using groups.
*   Need start/end positions of matches.
*   High-performance requirements with reused patterns.

## 6. Example: Extracting Groups
```java
Pattern p = Pattern.compile("(\d{2})-(\d{2})-(\d{4})");
Matcher m = p.matcher("DOB: 12-05-2024");

if (m.find()) {
    System.out.println("Full Date: " + m.group(0)); // 12-05-2024
    System.out.println("Day: " + m.group(1));       // 12
    System.out.println("Month: " + m.group(2));     // 05
    System.out.println("Year: " + m.group(3));      // 2024
}
```

```