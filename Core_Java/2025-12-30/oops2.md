# Object-Oriented Programming (OOP) Concepts - Part 2

## 1. Accessing Members in Non-Static Context (Instance Area)

### A. Accessing Non-Static Members
Inside a non-static context (like an instance method), we can access instance members in two ways:
1.  **Directly:** Using the member name.
2.  **Using `this` keyword:** `this.variableName` or `this.methodName()`.

**Code Example:**
```java
public class oops2 {
    int a = 10; // Instance Variable

    public void display() { // Instance Method
        System.out.println("Display starts");

        // Accessing instance variable directly
        System.out.println("Instance a: " + a);

        // Accessing instance variable using 'this' keyword
        System.out.println("Instance a using this: " + this.a);

        System.out.println("Display ends");
    }

    public static void main(String[] args) {
        System.out.println("Main starts");

        // Creating an object to access instance members
        oops2 obj = new oops2();

        // Calling instance method using object reference
        obj.display();

        System.out.println("Main ends");
    }
}
```

### B. Accessing Static Members
Inside a non-static context, we can access static members in three ways:
1.  **Directly:** Using the member name.
2.  **Using Class Name:** `ClassName.variableName` (Recommended).
3.  **Using `this` keyword:** `this.variableName` (Allowed but discouraged).

**Code Example:**
```java
public class oops2 {
    static int a = 10; // Static Variable

    public void display() { // Instance Method
        System.out.println("Display starts");

        // Accessing static variable directly
        System.out.println("Instance a: " + a);

        // Accessing static variable using class name
        System.out.println("Instance a using class name: " + oops2.a);

        // Accessing static variable using 'this' keyword
        System.out.println("Instance a using this: " + this.a);

        System.out.println("Display ends");
    }

    public static void main(String[] args) {
        System.out.println("Main starts");

        // Creating an object to access instance members
        oops2 obj = new oops2();

        // Calling instance method using object reference
        obj.display();

        System.out.println("Main ends");
    }
}
```

---

## 2. Non-Static Blocks (Instance Initializer Blocks)

### What is a Non-Static Block?
*   A block of code declared inside the class area without the `static` keyword.
*   It is also known as an **Instance Initializer Block (IIB)**.

### Execution & Purpose
*   **Execution:** It executes **whenever an object is created**.
*   **Purpose:** It is primarily used to **initialize instance variables**.

**Code Example:**
```java
public class oops2 {
    // Non-static block or instance initializer block
    {
        System.out.println("--New Object is Created--");
    }

    public static void main(String[] args) {
        System.out.println("Main starts");
        oops2 obj1 = new oops2(); // First Object Creation
        oops2 obj2 = new oops2(); // Second Object Creation
        oops2 obj3 = new oops2(); // Third Object Creation

        System.out.println("Main ends");
    }
}
```

---

## 3. Constructors

### What is a Constructor?
*   A special type of non-static member called when an object is instantiated.
*   **Name:** Must have the **same name** as the class.
*   **Return Type:** Does **not** have a return type (not even `void`).
*   **Purpose:** Used to **initialize objects**.

### Internal Components of a Constructor
Every constructor implicitly contains the following execution steps:
1.  **Constructor Chaining Statement:** Calls to `super()` or `this()`.
2.  **PLI (Pre-Loading Instructions):** Basic initialization.
3.  **IIB (Instance Initializer Block):** Execution of non-static blocks.
4.  **UWS (User Written Statements):** The code written inside the constructor body.

### Types of Constructors
1.  **Default Constructor:** Provided by Java if no constructor is defined.
2.  **Parameterized Constructor:** Takes arguments to initialize the object with specific values.

### Execution Order (IIB vs Constructor)
When an object is created:
1.  The **Non-Static Block (IIB)** is executed first.
2.  The **Constructor** is executed subsequently.

**Code Example:**
```java
public class oops2 {
    // Default Constructor
    public oops2() {
        System.out.println("Constructor executed");
    }
    
    // Non-static block or instance initializer block
    {
        System.out.println("Instance Initializer Block executed");
    }

    public static void main(String[] args) {
        System.out.println("Main starts");
        oops2 obj1 = new oops2(); // First Object Creation
        oops2 obj2 = new oops2(); // Second Object Creation
        System.out.println("Main ends");
    }
}
```

**Expected Output:**
```
Main starts
Instance Initializer Block executed
Constructor executed
Instance Initializer Block executed
Constructor executed
Main ends
```

---

## 4. Flow of Execution (Detailed)

1.  **Class Loading:** First, the **Class Static Area** is loaded.
2.  **Static Block Execution:** Static blocks are executed in the Stack Area.
3.  **Main Method Call:** The `main` method starts execution.
4.  **Object Creation:** When `new ClassName()` is encountered:
    *   **Instance Area** is created in the **Heap Area**.
    *   Memory address is returned.
5.  **Constructor Execution:** Control moves to the constructor:
    *   **`super()`**: Calls parent class constructor.
    *   **PLI (Pre-Loading Instructions)**: Loads non-static members into the Instance Area.
    *   **IIB (Instance Initializer Block)**: Executes non-static blocks.
    *   **UWS (User Written Statements)**: Executes the constructor's logic.
6.  **Return:** Control returns to the `main` method.

---

## 5. Interview Q&A

### **Q1: Difference between Static Block and Non-Static Block?**

| Feature | Static Block | Non-Static Block (IIB) |
| :--- | :--- | :--- |
| **Declaration** | `static { ... }` | `{ ... }` (No keyword) |
| **Execution** | Executed **once** when class is loaded. | Executed **every time** an object is created. |
| **Purpose** | Initialize **static** variables. | Initialize **instance** variables. |

### **Q2: Difference between Constructor and Method?**

| Feature | Constructor | Method |
| :--- | :--- | :--- |
| **Invocation** | Called implicitly during object instantiation. | Called explicitly by user code. |
| **Return Type** | **No** return type (not even `void`). | **Must** have a return type (or `void`). |
| **Name** | Must match the **Class Name**. | Can have **any name** (following conventions). |
| **Purpose** | Initialize object state. | Perform specific behavior/actions. |

---

## 6. Parameterized Constructor

A constructor that accepts parameters to initialize an object with specific values. This allows creating multiple objects with different states.

**Code Example:**
```java
public class oops2 {
    int id;
    String name;

    // Parameterized Constructor
    public oops2(int id, String name){
        this.id = id;
        this.name = name;
        System.out.println("Parameterized Constructor executed");
    }

    public static void main(String[] args) {
        oops2 ref = new oops2(1, "Aditya");
    }
}
```

---

## 7. Copy Constructor

A constructor that creates a new object by copying attributes from an existing object of the same class.

### Types of Copying

#### A. Shallow Copy
*   Copies values of fields directly.
*   For reference types (objects, arrays), it copies the **reference (address)**, not the object itself.
*   **Result:** Both objects point to the same shared sub-object. Changes to the sub-object in one affect the other.

**Example (Employee & Address):**
```java
public class Employee {
    int id;
    Address address;

    public Employee(Employee emp) {
        this.id = emp.id;
        this.address = emp.address; // Shallow copy: Both share the same Address object
    }
    
    // ... rest of the class
}
```

#### B. Deep Copy
*   Creates **new independent instances** for reference fields.
*   **Result:** Both objects are completely independent. Changes to the sub-object in one do **not** affect the other.

**Example (Student & Marks Array):**
```java
public class Student {
    int[] marks;

    public Student(Student obj) {
        // this.marks = obj.marks; // Shallow copy
        this.marks = obj.marks.clone(); // Deep copy: Creates a new array
    }
    
    // ... rest of the class
}
```

### Complete Code Examples

#### 1. Basic Copy Constructor
```java
public class oops2 {
    int id;
    String name;
    
    public oops2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy Constructor
    public oops2(oops2 obj) {
        this.id = obj.id;
        this.name = obj.name;
    }

    public static void main(String[] args) {
        oops2 obj1 = new oops2(1, "Aditya");
        oops2 obj2 = new oops2(obj1); // Create obj2 from obj1
    }
}
```

#### 2. Shallow vs. Deep Copy Scenario
*See `Employee.java` (Shallow) and `Student.java` (Deep) in the codebase for full implementations illustrating how modifying mutable fields affects (or doesn't affect) the original object.*

---

## 8. Constructor Chaining

Constructor chaining is the process of calling one constructor from another constructor within the same class or from the superclass.

### A. Using `this()` (Same Class)
*   **Purpose:** To call another constructor within the same class.
*   **Usage:** If a class has `n` constructors, `this()` can be used in up to `n-1` constructors.
*   **Initialization:** If a constructor uses `this()`, it **cannot** contain its own **PLI** and **IIB** logic; it delegates those to the called constructor.
*   **Restriction:** **Constructor Recursion** is strictly prohibited in Java as it leads to an infinite loop (Compile-time error).

### B. Using `super()` (Super Class)
*   **Purpose:** To call a constructor from the parent (super) class.
*   **Position:** It **must** be the very first statement in the subclass constructor.
*   **Implicit super():** If a constructor does not explicitly call `super()` or `this()`, the compiler automatically inserts an implicit call to `super()` (the no-argument constructor of the parent class).

### Code Example (Constructor Chaining)
```java
public class oops2 {
    int id;
    String name;
    double salary;

    // Default Constructor
    public oops2() {
        this.id = 101;
        this.name = "Unknown";
        this.salary = 50000;
    }

    // Parameterized Constructor 1
    public oops2(int id) {
        this(); // Calls Default Constructor
        this.id = id;
    }

    // Parameterized Constructor 2
    public oops2(String name) {
        this(); // Calls Default Constructor
        this.name = name;
    }

    public static void main(String[] args) {
        oops2 ref = new oops2(1);
        System.out.println(ref.id + " " + ref.name + " " + ref.salary);
        
        oops2 ref2 = new oops2("Aditya");
        System.out.println(ref2.id + " " + ref2.name + " " + ref2.salary);
    }
}
```
