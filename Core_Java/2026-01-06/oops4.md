# OOP Concepts - Relationships & Inheritance (Part 4)

## 1. Types of Relationships in Java
Java defines two main types of relationships between classes:
1.  **HAS-A Relationship** (Association)
2.  **IS-A Relationship** (Inheritance)

---

## 2. HAS-A Relationship (Association)
This represents "ownership" or "containment".

### Aggregation (Weak Association)
*   **Definition:** The child object is created outside the parent class and can exist independently of the parent.
*   **Nature:** Weak relationship.
*   **Example:** `Student` has an `Address`. If the Student is destroyed, the Address can still exist (e.g., used by another person).
    ```java
    // Address object is created first and passed to Student
    Address ad = new Address("Jalandhar", "Punjab");
    Student st = new Student(1, "Aditya", 82, ad);
    ```

### Composition (Strong Association)
*   **Definition:** The parent class creates and owns the child object. The child cannot exist independently.
*   **Nature:** Strong relationship.
*   **Example:** `Car` has an `Engine`. If the Car is destroyed, the Engine is also effectively destroyed (in the context of that specific car instance).
    ```java
    class Car {
        private Engine engine;
        public Car() {
            this.engine = new Engine(); // Engine created inside Car
        }
    }
    ```

---

## 3. IS-A Relationship (Inheritance)
*   **Definition:** A mechanism where a child class (Subclass) inherits properties and behaviors from a parent class (Superclass).
*   **Keywords:** `extends` (classes), `implements` (interfaces).
*   **Inheritance Rules:**
    *   Fields and methods are inherited (subject to access modifiers).
    *   Constructors and Initializer blocks are **not** inherited.
    *   **Static Members:** Yes, they are inherited but are resolved at compile time (not polymorphic).

### Types of Inheritance
1.  **Single Inheritance:** Subclass inherits from only one superclass.
2.  **Multilevel Inheritance:** Chain of inheritance (A -> B -> C).
3.  **Hierarchical Inheritance:** Multiple subclasses inherit from one superclass.
4.  **Multiple Inheritance:** Subclass inherits from multiple superclasses. **Not supported in Java via classes** (to avoid the Diamond Problem) but achieved via Interfaces.
5.  **Hybrid Inheritance:** Combination of two or more types (via Interfaces).

---

## 4. Execution Order (Class Loading vs Object Creation)
Understanding the order of execution is critical, especially with inheritance.

### Step 1: Class Loading (Happens Once)
When the class is first loaded by the ClassLoader:
1.  **Parent** Class loads -> Static Fields -> Static Initializer Blocks (`static { }`).
2.  **Child** Class loads -> Static Fields -> Static Initializer Blocks (`static { }`).

### Step 2: Object Creation (Happens Every Instantiation)
When `new Child()` is called:
1.  **Parent** Instance Fields -> Parent Instance Initializer Blocks (`{ }`).
2.  **Parent** Constructor.
3.  **Child** Instance Fields -> Child Instance Initializer Blocks (`{ }`).
4.  **Child** Constructor.

---

## 5. `super()` vs `this()`
Both are constructor calls but serve different purposes. They cannot be used together in the same constructor because both must be the **first statement**.

| Feature | `super()` | `this()` |
| :--- | :--- | :--- |
| **Referent** | Refers to the **Parent** class. | Refers to the **Current** class. |
| **Usage** | Calls the parent class constructor. | Calls another constructor in the same class. |
| **Implicit Call** | Java inserts `super()` implicitly if neither is present. | No implicit insertion. |

---

## 6. Practice Problems

### `oopsP1.java`
**Problem:** Create a static method which returns the address (reference) of an object.
**Key Concept:** A method can return an object type.
```java
public static oopsP1 addr(){
    oopsP1 obj = new oopsP1();
    return obj; // Returns the reference to the new object
}
```
