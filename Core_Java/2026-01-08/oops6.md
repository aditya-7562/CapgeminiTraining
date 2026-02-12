# OOP Concepts - Abstraction (Part 6)

## 1. Abstraction
*   **Definition:** Abstraction is the process of hiding implementation details and showing only functionality to the user. It focuses on *what* the object does rather than *how* it does it.
*   **Goal:** Reduce complexity and increase efficiency by segregating the definition from the implementation.
*   **Achieved via:**
    1.  **Abstract Classes** (0 to 100% abstraction)
    2.  **Interfaces** (100% abstraction - *covered later*)

---

## 2. Key Terminology

### Concrete Method
*   A method that has a body and contains a complete implementation.
*   Example: `public void demo() { System.out.println("Hello"); }`

### Abstract Method
*   A method that **does not** have a body.
*   Declared using the `abstract` keyword.
*   Ends with a semicolon `;`.
*   Example: `abstract public void abs();`

### Abstract Class
*   A class declared using the `abstract` keyword.
*   **Cannot be instantiated** (you cannot create an object of an abstract class directly).
*   Can contain a mix of:
    *   Abstract methods.
    *   Concrete methods.
    *   Static members (variables, methods, blocks).
    *   Constructors (executed when a concrete subclass is instantiated).

### Concrete Class
*   A normal class that provides implementation for all inherited abstract methods.
*   Can be instantiated.

---

## 3. Rules & Observations
*   **Abstract Methods:** If a class contains at least one abstract method, the class **must** be declared as abstract.
*   **Inheritance:** When a class extends an abstract class, it **must** provide implementations (override) for all inherited abstract methods. If it fails to do so, the child class itself must be declared abstract.
*   **Constructors:** Abstract classes can have constructors. They are called when a subclass object is created (via `super()` implicit or explicit calls).
*   **Static Members:** Abstract classes can have static variables, methods, and blocks. These are accessed using the class name.

---

## 4. Examples & Practice

### A. Basic Abstraction (`oops6.java`)
Demonstrates an abstract class `Fatherr` with static, non-static, and abstract members.
*   `Fatherr` cannot be instantiated.
*   `Sonnn` extends `Fatherr` and implements `abs()`.
*   Shows execution order: Static Block -> Instance Block -> Constructor.

### B. Method Implementation (`oops6P1.java`)
Simple practice with abstract class `baap` and concrete child `beta`.
*   `baap` defines abstract `test()` and `add()`.
*   `beta` implements them.
*   Demonstrates Runtime Polymorphism: `baap b = new beta();`

### C. Shape Area Calculation (`Area.java`)
*   **Scenario:** Calculating area for different shapes (Rectangle, Triangle, Circle).
*   **Design:**
    *   Base class `Shape` with a generic `calculateArea()` method.
    *   Subclasses (`Rectangle`, `Triangle`, `Circlee`) override this method with specific formulas.
    *   *Note:* While `Shape` is a concrete class here, logically it represents an abstract concept suitable for conversion to an abstract class.

---

## 5. Summary Table

| Feature | Abstract Class | Concrete Class |
| :--- | :--- | :--- |
| **Instantiation** | No | Yes |
| **Abstract Methods** | Yes (Optional) | No |
| **Concrete Methods** | Yes | Yes |
| **Constructors** | Yes | Yes |
| **Keyword** | `abstract class` | `class` |
