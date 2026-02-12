# Object-Oriented Programming (OOP) Concepts

## 1. Member Types

### Global Members
Members that are accessible from any class.

### Instance Members
Members that are accessible only through instances of a class.

## 2. Types of Global Members

### A. Static Members
Belong to the class itself rather than to any specific instance.

*   **Static Variables:** Shared among all instances of a class, declared with the `static` keyword. We can also declare static variables **without initialization**.
*   **Static Methods:** Can be called without creating an instance of the class.
*   **Static Blocks:** Used for static initialization of a class.

### B. Non-Static Members (Instance Members)
Belong to specific instances of a class.

*   **Non-Static Variables:** Unique to each instance of a class.
*   **Non-Static Methods:** Operate on instance variables and require an instance to be called.
*   **Non-Static Blocks:** Used for instance initialization.

---

## 3. Interview Q&A

### **Q: What is the difference between local and global variables?**

**Ans:**
*   **Ownership:** Global variables belong to the **class**, meanwhile local variables belong to an **instance** of the class (or method scope).
*   **Initialization:** Global variables have a **default value**, so they can be declared **without initialization**, which is **not true** for local variables.
*   **Usage:** Since global variables belong to the class, they **don't need an instance** to be used in the `main` method. Meanwhile, local variables (if instance-scoped) are tied to an instance.
*   **Nature:** Global variables are **static**, and instance variables are **dynamic** in nature.

---

## 4. Variable Priority & Shadowing (Static Context)

When we have a **static variable** and a **local variable** with the **same name** used inside a **static context** (local area):
1.  **Priority** is given to the **local variable**.
2.  To use the **static variable**, we have to use the **dot (.) operator** with the class name: `ClassName.variable`.

---

## 5. JVM Memory Areas

For execution, the JVM has specific memory areas:

### 1. Class Static Area
*   Every class will have a dedicated memory to store all **static members**.
*   This is known as the **Class Static Area**.
*   The name of the class static area is the **same as the ClassName**.
*   Every static context directly points towards the class static area.

### 2. Stack Area
*   It is used for **execution** (method calls, local variables, references).

### 3. Heap Area
*   Used for **dynamic memory allocation**, where **Objects** are stored.

> **Note:** For execution, the JVM first calls the `main` method.

---

## 6. Code Example (Static Variables & Shadowing)

```java
public class oops {

    // Class Area or Global Area or Static Area
    // static int a = 10; // Static Variable
    static int a; // Static Variable can be declared without initialization

    public static void main(String[] args) {
        // Method Area or local Area or static context
        System.out.println("Main Start");
        System.out.println(a); // Accessing static variable directly
        test();
        System.out.println("Main end");
    }

    public static void test() {
        System.out.println("Test start");
        System.out.println(a);
        
        // Local variable with same name as static variable
        int a = 25; 
        System.out.println(a); // Prints local variable (Priority to local)
        
        // Accessing static variable using ClassName
        System.out.println(oops.a); 
        
        System.out.println("Test end");
    }
}
```

---

## 7. Static Blocks

### What is a Static Block?
*   A block of code enclosed in `static { ... }`.
*   It is used to **initialize static data members**.
*   It is executed **ONLY ONCE** when the class is loaded into memory.

### Priority & Execution
*   **Higher Priority than Main:** The Static Block is executed **even before the `main` method**.
*   **Order of Execution:**
    1.  Class Loading
    2.  Static Block Execution (Top to Bottom if multiple exist)
    3.  `main` Method Execution

### Code Example (Static Block)

```java
public class oops {
    public static void main(String[] args) {
        System.out.println("Main starts");
        A.test();
        System.out.println("Main ends");
    }
    
    // Static block in main class
    static {
        System.out.println("Welcome to LPU");
    }
}

class A {
    // Static block in class A - Executed when class A is first loaded/accessed
    static {
        System.out.println("Welcome to class A");
    }
    
    public static void test() {
        System.out.println("Test starts");
        System.out.println("Test ends");
    }
}
```

**Expected Output:**
```
Welcome to LPU        <-- Static block of 'oops' runs first (as it's the entry point class)
Main starts
Welcome to class A    <-- Static block of 'A' runs when 'A' is accessed
Test starts
Test ends
Main ends
```

---

## 8. Static Method vs. Static Block

| Feature | Static Method | Static Block |
| :--- | :--- | :--- |
| **Purpose** | Used to define behavior or logic that belongs to the class. | Used to initialize static variables or perform one-time setup logic. |
| **Execution** | Executed **only when called** explicitly (e.g., `ClassName.methodName()`). | Executed **automatically** when the class is loaded into memory (before `main`). |
| **Recurrence** | Can be called **multiple times**. | Executed **only once** per class loading. |
| **Arguments** | Can accept arguments and return values. | Cannot accept arguments or return values. |
| **Keywords** | Defined with `static` returnType methodName(). | Defined with `static { ... }`. |

---

## 9. Objects

### What is an Object?
*   An object is an **instance of a class**.
*   It encapsulates **data** (fields/variables) and **behavior** (methods).
*   Objects are physically stored in the **Heap Area** of memory.

### Object Creation
We use the `new` keyword to create an object.

**Syntax:**
```java
ClassName referenceName = new ClassName();
```

**Breakdown of `oops obj = new oops();`**:
1.  **`oops obj`**: Declares a reference variable named `obj` of type `oops` in the **Stack Area**.
2.  **`new oops()`**:
    *   Allocates memory for the object in the **Heap Area**.
    *   Initializes instance variables to their default values.
    *   Calls the constructor (if any).
3.  **`=`**: Assigns the **memory address** (reference) of the new object in the Heap to the variable `obj` in the Stack.

> **Note:**
> *   The `new` keyword returns the address of the newly created object.
> *   It is a unary operator.
> *   **ClassName** is a non-primitive data type which is used to store the address of an object.

### Accessing Instance Members
Static contexts (like `main`) cannot directly access instance members. We must use the object reference.

*   **Access Variable:** `objectReference.variableName`
*   **Call Method:** `objectReference.methodName()`

### Code Example (Object & Instance Members)

```java
public class oops {
    // Instance Variable (Non-static)
    int a = 10; 

    public static void main(String[] args) {
        // System.out.println(a); // Error: Cannot access non-static 'a' directly
        
        System.out.println("Main starts");

        // Creating an Object of class 'oops'
        oops obj = new oops();

        // Accessing Instance Variable using object reference
        System.out.println("Value of a: " + obj.a);

        // Calling Instance Method using object reference
        obj.display();

        System.out.println("Main ends");
    }

    // Instance Method (Non-static)
    public void display() {
        System.out.println("This is a non-static method.");
    }
}
```

---

## 10. Accessing Static Members

There are three ways to access static members inside a static context:

1.  **Directly:** Simply use the variable name (e.g., `a`).
2.  **Using Class Name:** `ClassName.variable` (e.g., `oops.a`).
3.  **Using Object Reference:** `obj.variable` (e.g., `obj.a`). *Note: This is allowed but discouraged as it implies the variable belongs to the instance, which it does not.*

**Code Example:**
```java
public class oops {
    static int a = 10; // Static Variable
    int b = 20; // Instance Variable

    public static void main(String[] args) {
        System.out.println("Main starts");

        // 1. Accessing static variable directly
        System.out.println("Static a: " + a);

        // 2. Accessing static variable using class name
        System.out.println("Static a: " + oops.a);

        // 3. Using object reference to access static variable
        oops obj = new oops();
        System.out.println("Static a via obj: " + obj.a); 
        
        System.out.println("Instance b: " + obj.b);

        System.out.println("Main ends");
    }
}
```

---

## 11. Static vs. Non-Static Variables

| Feature | Static Variables | Non-Static (Instance) Variables |
| :--- | :--- | :--- |
| **Ownership** | Belong to the **class** itself. | Belong to **specific instances** of the class. |
| **Sharing** | **Shared** among all instances of the class. | **Unique** to each instance (changes in one don't affect others). |
| **Declaration** | Declared **with** the `static` keyword. | Declared **without** the `static` keyword. |
| **Access** | Can be accessed **directly** in static context (or via ClassName). | Require an **instance/object** to be accessed in static context. |

**Code Example (Shared vs Unique):**
```java
public class oops {
    static String user; // Static - Shared

    public static void main(String[] args) {
        oops obj1 = new oops();
        obj1.user = "Alice";
        
        oops obj2 = new oops();
        obj2.user = "Bob"; // Overwrites "Alice" because 'user' is static/shared
        
        System.out.println("User of obj1: " + obj1.user); // Prints "Bob"
        System.out.println("User of obj2: " + obj2.user); // Prints "Bob"
    }
}
```

---

## 12. The `this` Keyword & Shadowing in Instance Context

When we have a **static variable** and a **local variable** with the **same name** used inside a **non-static context** (instance area):
1.  **Priority** is given to the **local variable**.
2.  To use the **static variable**, use `ClassName.variable`.
3.  To use the **instance variable** (if shadowed by local), use `this.variable`.

### What is `this`?
*   It is a **keyword**.
*   It is a **non-static reference variable**.
*   It is used to store the **address of the current object**.
*   It **cannot** be used inside a static context (like `main`).

**Code Example:**
```java
public class oops {
    public void test() {
        System.out.println("Test starts");
        // Printing the current object reference
        System.out.println("this: " + this); 
        System.out.println("Test ends");
    }

    public static void main(String[] args) {
        System.out.println("Main starts");
        
        oops ref1 = new oops();
        System.out.println("ref1: " + ref1);
        
        oops ref2 = new oops();
        System.out.println("ref2: " + ref2);
        
        oops ref3 = new oops();
        System.out.println("ref3: " + ref3);
        
        ref2.test(); // 'this' inside test() will print same address as 'ref2'
        
        // this.test(); // Error: Cannot use 'this' in a static context
        
        System.out.println("Main ends");
    }
}
```
