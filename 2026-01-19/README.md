# Java Advanced: Enums, Comparable & Comparator (Day 26 - Jan 19, 2026)

## Overview
Today's session focused on two major topics: using the `enum` keyword for constants and implementing `Comparable` and `Comparator` interfaces for object sorting.

## Topics Covered

### 1. Enumerations (Enum)
*   **Concept:** A special data type to define collections of constants.
*   **Features:**
    *   Built-in methods: `values()`, `valueOf()`, `ordinal()`.
    *   Advanced usage: Enums with instance variables, constructors, and behaviors.
*   **Practice:**
    *   `Enum.java`: Basic enum usage (iterating, switch cases).
    *   `EnumP1.java`: Advanced enum with fields (`code`, `message`) simulating an order status system.

### 2. Sorting Interfaces
*   **Concept:** Strategies for ordering objects in collections.
*   **Comparable (`java.lang`):**
    *   Defines **natural ordering** for a class.
    *   Method: `compareTo(Object o)`.
    *   Implementation: `Students` class sorted by ID.
*   **Comparator (`java.util`):**
    *   Defines **custom sorting** logic separate from the class.
    *   Method: `compare(Object o1, Object o2)`.
    *   Implementation: `SortByNames`, `SortByMarks`.
*   **Practice:**
    *   `ComparableAndComparator.java`: Comparing both approaches.
    *   `comparatorP1.java`: Complex multi-level sorting (Amount -> Count -> Time -> Name -> ID).

## Key Files
*   `Enum.java`: Intro to Enums.
*   `EnumP1.java`: Advanced Enums with constructors.
*   `ComparableAndComparator.java`: Side-by-side comparison of sorting interfaces.
*   `comparatorP1.java`: Real-world complex sorting logic.