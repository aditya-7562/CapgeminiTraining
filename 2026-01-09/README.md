# Day 14 – OOP Interfaces (2026-01-09)

## Topics Covered
- **Interfaces:** Definition, syntax, and key characteristics.
- **Multiple Inheritance:** Achieving it safely through interfaces.
- **Types of Interfaces:**
    - **Regular:** Standard interface with multiple methods.
    - **Marker:** Empty interface indicating a capability (e.g., Serializable).
    - **Functional:** Interface with exactly one abstract method (used with Lambdas).
- **Interface vs. Class:** `implements` vs. `extends` keywords.
- **Complex Inheritance:** Combining hierarchical class inheritance with interface implementation.

## Programs Implemented
- `oops7.java`: Introductory examples, syntax rules, and types of interfaces.
- `oops7P1.java`: Demonstration of Multiple Inheritance (Child implementing Father & Mother).
- `oops7P2.java`: Advanced architecture mixing class inheritance (`Person` hierarchy) with interface implementation (`Sports`, `Cultural`).
- `oops7P3.java`: Practical exercise creating a `Resizable` interface for a `Rectangle` class.
- `oops7.md`: Detailed theory notes on Interfaces and their properties.

## Key Takeaways
- Interfaces provide a contract that implementing classes must fulfill.
- They are the primary mechanism for achieving abstraction and multiple inheritance in Java.
- All variables in an interface are implicitly `public`, `static`, and `final`.
- All methods are implicitly `public` and `abstract` (pre-Java 8).
