# OOP Concepts - Polymorphism & Type Casting (Part 5)

## 1. The Diamond Problem
*   **Issue:** When a class inherits from two classes that have a common base class (or just two classes with the same method), it creates ambiguity about which method to inherit.
*   **Java's Stance:** Java **does not support multiple inheritance with classes** to avoid this ambiguity.
*   **Solution:** Java uses **Interfaces** to achieve multiple inheritance-like behavior safely.

---

## 2. Type Casting in Java
The process of converting a variable from one data type to another.

### Primitive Type Casting
Converting between primitive data types (e.g., `int`, `double`).

1.  **Widening Casting (Implicit):**
    *   Converting a smaller type to a larger type.
    *   Done automatically by Java.
    *   **Order:** `byte` -> `short` -> `char` -> `int` -> `long` -> `float` -> `double`

2.  **Narrowing Casting (Explicit):**
    *   Converting a larger type to a smaller type.
    *   Must be done manually by the programmer.
    *   **Order:** `double` -> `float` -> `long` -> `int` -> `char` -> `short` -> `byte`

### Non-Primitive Type Casting (Reference Casting)
Converting between object types (e.g., Subclass to Superclass).

1.  **Upcasting (Implicit):**
    *   Converting a Subclass reference to a Superclass reference.
    *   **Syntax:** `Parent p = new Child();`
    *   **Behavior:** You can only access members (methods/variables) defined in the **Superclass**. Subclass-specific members are hidden.

2.  **Downcasting (Explicit):**
    *   Converting a Superclass reference back to a Subclass reference.
    *   **Syntax:** `Child c = (Child) p;`
    *   **Risk:** If the object is not actually an instance of that subclass, it throws a `ClassCastException` at runtime.
    *   **Benefit:** Allows access to all members of both the Subclass and Superclass.

---

## 3. Polymorphism
The ability of an object or method to take many forms ("Poly" = many, "Morph" = forms).

### A. Compile-time Polymorphism (Static Binding)
*   Resolved during **compilation**.
*   **Key Mechanisms:**
    *   **Method Overloading:** Same method name, different parameters.
    *   **Constructor Overloading:** Same constructor name, different parameters.
    *   **Variable Shadowing:** Local/Child variables hiding Instance/Parent variables. **Decided by Reference Type.**
    *   **Method Shadowing (Hiding):** Static methods in a child class having the same signature as in the parent class. **Decided by Reference Type.**

### B. Runtime Polymorphism (Dynamic Binding)
*   Resolved during **runtime**.
*   **Key Mechanism:**
    *   **Method Overriding:** A subclass provides a specific implementation for a method already defined in its superclass.
    *   **Decided by Object Type** (Actual object in heap), not the Reference type.

---

## 4. Method Overriding Rules
1.  **Signature:** Must have the same method name, return type (or covariant type), and parameters.
2.  **Access:** The access level cannot be more restrictive than the overridden method (e.g., `protected` in parent cannot become `private` in child).
3.  **Restrictions:**
    *   Cannot override `final` methods.
    *   Cannot override `static` methods (this is Method Hiding).
    *   Constructors cannot be overridden.
4.  **@Override Annotation:**
    *   Used to explicitly declare an intention to override.
    *   Helps the compiler catch errors (e.g., if you misspell the method name).

---

## 5. Shadowing vs. Overriding

| Feature | Variable Shadowing | Method Shadowing (Static) | Method Overriding (Instance) |
| :--- | :--- | :--- | :--- |
| **Applies To** | Variables (Local/Instance/Static) | Static Methods | Non-static Instance Methods |
| **Binding Time** | Compile-Time (Early) | Compile-Time (Early) | Runtime (Late) |
| **Resolved By** | **Reference Type** | **Reference Type** | **Object Type** |
