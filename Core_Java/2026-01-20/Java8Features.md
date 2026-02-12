# Java 8 Features

Java 8 introduced significant changes to the language, enabling functional programming patterns, concise code, and efficient data processing.

## 1. For-Each Loop (`forEach`)
The `forEach` method provides a functional way to iterate over elements in a collection or array. It accepts a `Consumer` functional interface.

### Syntax
```java
collection.forEach(element -> {
    // code to execute
});
```

### Example
```java
List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
fruits.forEach(fruit -> System.out.println(fruit));
```

---

## 2. Functional Interfaces
A **Functional Interface** is an interface that contains exactly one abstract method. They can have any number of default or static methods.
*   **Annotation:** `@FunctionalInterface` (optional but recommended).
*   **Purpose:** Acts as a target for Lambda expressions and Method References.
*   **Examples:** `Runnable`, `Comparator`, `Callable`.

### Definition
```java
@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}
```

---

## 3. Lambda Expressions
A **Lambda Expression** is a short block of code that takes parameters and returns a value. It represents an instance of a functional interface.

*   **Syntax:** `(parameters) -> { body }`
*   **Benefits:** Reduces boilerplate code (no need for anonymous inner classes for simple implementations).

### vs Anonymous Class
**Anonymous Class:**
```java
Factorial ref = new Factorial() {
    public int findFactorial(int n) {
        // logic
    }
};
```

**Lambda:**
```java
Factorial ref = (n) -> {
    // logic
};
```

---

## 4. Method References
Method References provide a shorthand notation for lambda expressions that only call an existing method.

### Syntax Types
1.  **Static Method:** `ClassName::staticMethodName`
    *   `Integer::sum`
2.  **Instance Method of Object:** `instance::methodName`
    *   `System.out::println`
3.  **Instance Method of Class:** `ClassName::methodName`
    *   `String::compareTo`
4.  **Constructor:** `ClassName::new`

### Example
```java
// Lambda
names.forEach(name -> System.out.println(name));

// Method Reference
names.forEach(System.out::println);
```

---

## 5. Stream API
Streams allow for processing sequences of elements (like collections) in a functional style. A Stream does not store data; it conveys elements from a source through a pipeline of computational operations.

### Stream Workflow
1.  **Source:** Create stream from Collection (`list.stream()`).
2.  **Intermediate Operations:** Transform or filter (`filter`, `map`, `sorted`). These are lazy.
3.  **Terminal Operations:** Produce a result or side-effect (`forEach`, `collect`, `reduce`).

### Common Methods
*   `filter(Predicate)`: Selects elements based on a condition.
*   `map(Function)`: Transforms elements.
*   `sorted()`: Sorts elements.
*   `forEach(Consumer)`: Iterates through elements.
*   `collect(Collector)`: Gathers results into a Collection (e.g., `Collectors.toList()`).

### Example
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// Filter even numbers and collect to list
List<Integer> evens = numbers.stream()
                             .filter(n -> n % 2 == 0)
                             .collect(Collectors.toList());
```
