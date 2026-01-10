# Day 12 – OOP Polymorphism & Type Casting (2026-01-07)

This directory contains practice code and documentation related to advanced OOP concepts in Java, specifically focusing on how Java handles type conversion and polymorphism.

## Files

| File | Description |
| :--- | :--- |
| `oops5.java` | Main source file containing examples of the **Diamond Problem**, **Type Casting** (Primitive & Reference), and **Polymorphism** (Shadowing vs. Overriding). |
| `oops5.md` | Comprehensive documentation explaining the theoretical concepts, rules, and differences between static and dynamic binding. |

## Key Concepts Covered

### 1. The Diamond Problem
*   Understanding why Java **does not support multiple inheritance** with classes (ambiguity issues).
*   Role of Interfaces as the alternative.

### 2. Type Casting
*   **Primitive Casting:** Widening (Implicit) vs. Narrowing (Explicit).
*   **Reference Casting:**
    *   **Upcasting:** Treating a subclass object as a superclass reference (Automatic).
    *   **Downcasting:** Converting a superclass reference back to a subclass type (Manual, requires care to avoid `ClassCastException`).

### 3. Polymorphism
*   **Compile-time (Static Binding):**
    *   Method Overloading.
    *   Variable Shadowing (Reference based).
    *   Method Shadowing/Hiding (Reference based).
*   **Runtime (Dynamic Binding):**
    *   Method Overriding (Object based).
    *   Usage of the `@Override` annotation.

### 4. Shadowing vs. Overriding
*   Distinction between how variables/static methods are resolved (Reference Type) versus how instance methods are resolved (Object Type).
