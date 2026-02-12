# Day 20 – Regular Expressions (2026-01-21)

## Topics Covered
- **Regular Expressions (Regex):** Pattern matching fundamentals in Java.
- **Key Classes:** `java.util.regex.Pattern` and `java.util.regex.Matcher`.
- **Regex Syntax:**
    - **Metacharacters:** `.`, `\d`, `\w`, `\s`, etc.
    - **Quantifiers:** `*`, `+`, `?`, `{n}`, `{n,m}`.
    - **Character Classes:** `[abc]`, `[A-Z]`, `[^abc]`.
    - **Boundaries:** `^` (start), `$` (end).
- **Validation:** Applying regex to validate user inputs like emails, passwords, and phone numbers.

## Programs Implemented

| File | Description |
| :--- | :--- |
| `regex.java` | **Theory & Demo:** Comprehensive exploration of regex patterns, `Pattern` compilation, `Matcher` loop, grouping, and start/end indexing. |
| `regex.md` | **Documentation:** Detailed notes on regex syntax, methods, and usage scenarios. |
| `regexP1.java` | **Basic Matching:** checking simple string patterns. |
| `regexP2.java` | **Mobile Validation:** Validating 10-digit numbers starting with 6-9. |
| `regexP3.java` | **Email Validation:** Complex pattern for username, domain, and extension checks. |
| `regexP4.java` | **Password Validation:** Enforcing rules (Min 8 chars, 1 uppercase, 1 digit). |
| `regexP5.java` | **Username Validation:** Alphanumeric constraints and length checks (5-15 chars). |
| `regexP6.java` | **OTP & PIN:** Validating fixed-length numeric codes (6-digit OTP, 4-digit PIN). |
| `regexP7.java` | **Vehicle Number:** Validating Indian vehicle registration format (e.g., MH12AB1234). |
| `regexP8.java` | **Date Validation:** Checking format `dd-mm-yyyy`. |

## Key Takeaways
- **`String.matches(regex)`** is convenient for validating the entire string but recompiles the pattern every time.
- **`Pattern` and `Matcher`** are more efficient for repeated use and allow searching within strings (`find()`) and extracting data (`group()`).
- **Input Validation:** Regex is the standard tool for ensuring input data conforms to expected formats before processing.
- **Strict Anchoring:** Using `^` and `$` is crucial for validation to ensure the *entire* string matches the pattern, not just a substring.
