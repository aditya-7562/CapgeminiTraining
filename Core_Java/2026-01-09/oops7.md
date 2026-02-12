# OOP Concepts - Interfaces (Part 7)

## 1. Interface Basics
An **interface** in Java is a blueprint of a class. It is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.

*   **Key Characteristics:**
    *   **Keyword:** `interface`.
    *   **Abstraction:** Used to achieve **100% abstraction** and **multiple inheritance**.
    *   **Instantiation:** Interfaces **cannot** be instantiated (no `new InterfaceName()`).
    *   **Constructors:** Interfaces do not have constructors, instance initialization blocks (IIB), or static initialization blocks (SIB).

### Default Properties of Members
*   **Methods:** By default, all methods are `public` and `abstract` (prior to Java 8).
*   **Variables:** By default, all variables are `public`, `static`, and `final` (constants).

### Inheritance Keywords
*   **Class extends Class:** `extends`
*   **Interface extends Interface:** `extends`
*   **Class implements Interface:** `implements`
*   *(Note: A class cannot extend an interface; it must implement it.)*

### Static Methods in Interfaces
From Java 8 onwards, interfaces can have static methods with a body. These must be called using the interface name (e.g., `InterfaceName.methodName()`).

---

## 2. Types of Interfaces
Based on the number of abstract methods they contain:

### 1. Regular (Normal) Interface
*   Contains more than one abstract method.
*   **Example:**
    ```java
    interface I2 {
        void test1();
        void test2();
    }
    ```

### 2. Marker Interface
*   Contains **no** methods or constants.
*   It "marks" a class as possessing a certain capability (e.g., `Serializable`, `Cloneable`).
*   **Example:**
    ```java
    interface I1 {
        // Empty
    }
    ```

### 3. Functional Interface
*   Contains **exactly one** abstract method.
*   Can contain any number of default or static methods.
*   Annotated with `@FunctionalInterface`.
*   Used extensively with Lambda Expressions (Java 8).
*   **Example:**
    ```java
    @FunctionalInterface
    interface I3 {
        void demo();
    }
    ```

---

## 3. Multiple Inheritance
Java does not support multiple inheritance with classes (to avoid the "Diamond Problem"), but it supports it through interfaces. A class can implement multiple interfaces.

*   **File:** `oops7P1.java`
*   **Scenario:** A `Child` class implements both `Father` and `Mother` interfaces.

---

## 4. Complex Inheritance Architectures
Interfaces allow for combining different types of inheritance (Hybrid Inheritance).

*   **File:** `oops7P2.java`
*   **Architecture:**
    1.  **Hierarchical:** `Person` is extended by `Student` and `Teacher`.
    2.  **Multiple:** `CollegeStudent` extends `Student` and implements `Sports` and `Cultural` interfaces.

---

## 5. Practical Application
Interfaces are often used to define capabilities or behaviors that different classes can implement.

*   **File:** `oops7P3.java`
*   **Scenario:** A `Resizable` interface defines `resizeWidth` and `resizeHeight`. A `Rectangle` class implements this interface to manage its dimensions.
