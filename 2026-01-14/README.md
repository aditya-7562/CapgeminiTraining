# Day 16 – Java Collections: Iterators, Vector, & Stack (2026-01-14)

## Topics Covered
- **Iterator Interface:** Forward-only cursor for traversing collections and safe removal of elements.
- **ListIterator Interface:** Bi-directional cursor specific to `List` implementations.
- **Vector Class:** Synchronized, legacy class that uses a dynamic array (doubles capacity on growth).
- **Stack Class:** Legacy class extending `Vector` that follows the LIFO (Last-In-First-Out) principle.
- **Collections Framework Integration:** Implementing OOP principles with Java Collections.

## Programs Implemented
- `iterator.java`: Demonstrates basic Iterator and bi-directional traversal using ListIterator.
- `vector.java`: Basic usage of the `Vector` class and comparison with `ArrayList`.
- `stack.java`: Demonstrates LIFO operations like `push()`, `pop()`, `peek()`, and `search()`.
- `itrP1.java`: Removal of all elements from a list using `Iterator.remove()`.
- `itrP2.java`: Reverse traversal and removal of elements using `ListIterator`.
- `itrP3.java`: Comprehensive Banking System project integrating Interfaces, Abstract Classes, and `ArrayList`.
- `Collections.md`: Detailed theoretical documentation of Iterators, Vector, and Stack.

## Key Takeaways
- **Iterators:** Provide a safe way to modify a collection during traversal, avoiding `ConcurrentModificationException`.
- **Legacy Classes:** `Vector` and `Stack` are synchronized (thread-safe) but generally slower than modern counterparts like `ArrayList`.
- **Capacity Growth:** `Vector` doubles its size when full, whereas `ArrayList` increases by 50%.
- **Polymorphism in Collections:** Storing child objects in a parent-type collection (e.g., `ArrayList<Account>`) allows for modular and scalable code design.
