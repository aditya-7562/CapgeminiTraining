# Java Collections: Sets and Maps (Day 25 - Jan 17, 2026)

## Overview
Today's session focused on the `Set` and `Map` interfaces in the Java Collections Framework. We explored how to handle unique collections of data using Sets and key-value pairs using Maps.

## Topics Covered

### 1. Maps (`Map` Interface)
*   **Concept:** A collection of key-value pairs where keys are unique.
*   **Implementation:** `HashMap` used for demonstration.
*   **Key Methods:** `put()`, `get()`, `remove()`, `containsKey()`, `containsValue()`, `size()`.
*   **Views:** `keySet()` (Set of keys), `values()` (Collection of values), `entrySet()` (Set of Key-Value pairs).
*   **Practice:**
    *   `mapDemo.java`: Basic operations and method demonstrations.
    *   `mapP1.java`: Managing employee salaries (filtering employees with salary > 50,000).

### 2. Sets (`Set` Interface)
*   **Concept:** A collection that contains no duplicate elements.
*   **Implementations:**
    *   `HashSet`: Unordered, allows null.
    *   `LinkedHashSet`: Maintains insertion order.
    *   `TreeSet`: Sorted order (natural ordering).
*   **Key Operations:**
    *   **Union:** Adding all elements from two sets.
    *   **Intersection:** Keeping only common elements (`retainAll()`).
    *   **Difference:** Removing elements present in another set.

### 3. Problem Solving
A series of 10 practice problems (`setP1.java` to `setP10.java`) covering:
*   Removing duplicates from arrays.
*   Counting unique characters in a string.
*   Finding common elements (Intersection).
*   Finding union and difference of sets.
*   Finding the first repeating or non-repeating element.
*   Filtering elements while iterating (removing even numbers).

## Key Files
*   `mapDemo.java`: Intro to Maps.
*   `treeSetDemo.java`: Intro to TreeSet and sorting.
*   `setP*.java`: various set exercises.
