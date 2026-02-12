# Day 15 – Object Class & Methods (2026-01-10)

## Topics Covered
- **The Object Class:** Understanding the root of Java's class hierarchy (`java.lang.Object`).
- **Common Methods:**
    - `toString()`: String representation of an object.
    - `equals()`: Object comparison logic.
    - `hashCode()`: Hashing support for collections.
    - `getClass()`: Runtime class metadata.
- **Equality:** Differentiating between Reference Equality (`==`) and Logical Equality (`equals()`).

## Programs Implemented
- `Objects.java`: Implementation demonstrating the default vs. overridden behavior of `toString()` and `equals()`.
- `Objects.md`: Detailed theory notes on the Object class, its methods, and why overriding is necessary.

## Key Takeaways
- Every class in Java directly or indirectly extends the `Object` class.
- The default `toString()` prints the class name and hash code (memory reference), which is often not useful for debugging.
- The default `equals()` compares memory addresses; overriding it allows checking if two objects have the same data.
- Maintaining the contract between `equals()` and `hashCode()` is essential when working with hash-based collections.
