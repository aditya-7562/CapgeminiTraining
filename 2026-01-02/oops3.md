# OOP Concepts - Constructors (Part 3) & Encapsulation

## Questions and Answers (Constructors)

### 1. Why is constructor recursion not possible in Java?
Constructor recursion is not possible in Java because it would create an infinite delegation chain. If a constructor could call itself (directly or indirectly through other constructors), the initialization process would never complete. Java prevents this at compile time by requiring that constructor chaining via this() must eventually terminate in a constructor that doesn't call another constructor of the same class.

### 2. What is the use of constructor overloading in Java?
Constructor overloading in Java allows a class to have multiple constructors with different parameter lists. This provides flexibility in object creation, enabling developers to create objects in different ways based on the provided arguments. It enhances code readability and usability by allowing the same class to be instantiated with different sets of data, catering to various initialization needs without the need for multiple classes.

### 3. What is the difference between constructor overloading and method overloading?
*   **Constructor Overloading:** Allows a class to have multiple constructors with different parameter lists. This enables the creation of objects in various ways, providing flexibility in initialization.
*   **Method Overloading:** Allows a class to have multiple methods with the same name but different parameter lists. This enables methods to perform similar tasks with varying inputs, improving code reusability and readability.

### 4. When do we use a parameterized constructor?
A parameterized constructor is used when we want to initialize an object with specific values at the time of its creation. It allows us to pass arguments to the constructor, enabling the setting of instance variables to desired values right away. This is particularly useful when we need to create objects with different initial states or configurations, as it provides a way to customize the object's attributes during instantiation.

### 5. What is the use of a copy constructor in Java?
A copy constructor in Java is used to create a new object as a copy of an existing object. It takes another object of the same class as a parameter and initializes the new object's attributes with the values of the passed object's attributes. This is useful for creating duplicates of objects, ensuring that the new object has the same state as the original without affecting it. Copy constructors help in managing object references and preventing unintended modifications to shared data.

---

## 2. Constructor Chaining
*   **Concept:** calling one constructor from another constructor of the same class.
*   **Keyword:** `this()`
*   **Rules:**
    *   `this()` must be the **first statement** in the constructor.
    *   Recursive constructor calls are not allowed.
*   **Example:** `Laptop.java` demonstrates chaining a default constructor -> single param -> two params -> three params.

---

## 3. Initialization Blocks
Java provides blocks of code to initialize data members.

### Static Initialization Block (SIB)
*   **Syntax:** `static { ... }`
*   **Execution:** Runs **once** when the class is loaded into memory by the ClassLoader.
*   **Use Case:** Initializing static variables.

### Instance Initialization Block (IIB)
*   **Syntax:** `{ ... }`
*   **Execution:** Runs **every time** an object is created, immediately **before** the constructor code (after `super()`).
*   **Use Case:** Common initialization for all constructors.

**Execution Order:** SIB (once) -> IIB -> Constructor.
**Example:** `DemoClass.java`

---

## 4. Method Overloading (Polymorphism)
*   **Definition:** Multiple methods in the same class with the **same name** but **different parameter lists** (type, number, or order of parameters).
*   **Return Type:** Changing only the return type is **not** sufficient for overloading.
*   **Static vs Non-Static:** Both can be overloaded.
*   **Example:** `OverloadingExample.java` (overloads `display` method).

---

## 5. Encapsulation (OOP Pillar 1)

### Definition
Binding state (variables) and behavior (methods) together into a single unit (Class). It also involves restricting direct access to some of an object's components.

### Data Hiding
*   **Goal:** Protect internal state from unintended external interference and misuse.
*   **Mechanism:**
    1.  Declare variables as `private` (cannot be accessed directly outside the class).
    2.  Provide `public` **Getter** and **Setter** methods to access/modify them.

### Getters and Setters
*   **Getter (Accessor):** Returns the value of a private variable.
*   **Setter (Mutator):** Sets or updates the value of a private variable. Allows validation logic before setting data.

### Examples
*   `Person.java`: Basic POJO with name, age, country.
*   `Employee2.java`: Encapsulates ID, Name, Salary. Salary getter returns a formatted string.
*   `Circle.java`: Encapsulates `radius`. Instead of just exposing radius, it provides methods `calculateArea()` and `calculatePerimeter()` that use the internal state.