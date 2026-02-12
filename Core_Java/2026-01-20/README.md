# Day 19 – Java 8 Features: Lambdas, Streams, & Method References (2026-01-20)

## Topics Covered
- **Functional Programming:** Introduction to functional concepts in Java.
- **Lambda Expressions:** Concise syntax for implementing functional interfaces.
- **Method References:** Shorthand for lambdas calling existing methods (`::` operator).
- **Stream API:** Processing sequences of elements with operations like `filter`, `map`, and `reduce`.
- **For-Each Loop:** Internal iteration using `forEach`.

## Programs Implemented
- **`functionalInterface.java`**: Demonstrates the evolution from Anonymous Classes to Lambda Expressions using a custom `Factorial` interface.
- **`lambda.java`**: Uses Lambdas to implement `Comparator` for sorting a custom `Students` object list.
- **`lambdaP1.java`**: Basic practice implementing a `MathOperation` interface for arithmetic calculations.
- **`lambdaP2.java`**: **Loan Approval System** Scenario. Implements business rules (Credit Score, Income, Debt-to-Income) as dynamic Lambda behaviors passed to a loan processor.
- **`methodReference.java`**: Contrasts Lambda expressions with Method References for printing and sorting.
- **`forEach.java`**: Examples of iterating lists and filtering data using the `forEach` method.
- **`Stream.java`**: Introduction to the Stream API workflow (Source -> Intermediate -> Terminal) with examples of filtering, mapping, and collecting data.
- **`Java8Features.md`**: Detailed documentation of the concepts covered today.

## Key Takeaways
- **Boilerplate Reduction:** Lambdas significantly reduce the code needed for interface implementations compared to anonymous classes.
- **Behavior Parameterization:** Functional interfaces allow passing logic (behavior) as arguments to methods.
- **Declarative Processing:** Streams allow expressing *what* to do with data (filter, map) rather than *how* to loop through it.
