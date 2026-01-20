# Java Collections: Set and Map Interfaces (Day 25 - Jan 17, 2026)

## 1. Set Interface
*   **Definition:** `Set` is an interface in `java.util` that extends `Collection`.
*   **Characteristics:**
    *   Does not allow duplicate elements.
    *   Maximum of one `null` element allowed (in `HashSet` and `LinkedHashSet`).
    *   Models the mathematical set abstraction.

### Implementations
| Class | Storage | Ordering |
| :--- | :--- | :--- |
| **HashSet** | Hash Table | No guaranteed order. |
| **LinkedHashSet** | Hash Table + Linked List | Maintains insertion order. |
| **TreeSet** | Red-Black Tree | Natural order (Sorted) or custom comparator. |

### TreeSet Details
*   Elements are stored in **ascending order** by default.
*   Does **not** allow `null` elements (throws `NullPointerException`).
*   Only allows homogeneous elements (objects of the same type).
*   **Methods:** `descendingSet()` returns a reverse order view.

---

## 2. Map Interface
*   **Definition:** `Map` is used to store data in **Key-Value pairs**.
*   **Structure:** Each pair is called an **Entry**.
*   **Constraints:** Keys must be unique; values can be duplicated.
*   **Relationship to Collection:** `Map` does **not** extend `Collection` interface because it stores key-value pairs rather than single objects.

### Key Methods
| Method | Return Type | Description |
| :--- | :--- | :--- |
| `put(K key, V value)` | `Object` | Adds an entry; returns previous value or `null`. |
| `get(Object key)` | `Object` | Returns the value associated with the key. |
| `remove(Object key)` | `Object` | Removes the entry for the key. |
| `containsKey(key)` | `boolean` | Checks if the key exists. |
| `containsValue(val)` | `boolean` | Checks if the value exists. |
| `keySet()` | `Set` | Returns a Set view of the keys. |
| `values()` | `Collection` | Returns a Collection view of the values. |
| `entrySet()` | `Set` | Returns a Set view of the `Map.Entry` pairs. |

---

## 3. Set Operations (Theory & Practice)

### Union
Combining elements of two sets.
```java
set1.addAll(set2); // set1 now contains union
```

### Intersection
Finding common elements.
```java
set1.retainAll(set2); // set1 now contains only elements also in set2
```

### Difference
Elements in Set A but not in Set B.
```java
setA.removeAll(setB); // setA now contains elements unique to A
```

---

## 4. Problem Solving Scenarios

### De-duplication (`setP1.java`)
*   Using `HashSet` to convert an array with duplicates into a unique collection.

### String Analysis (`setP2.java`, `setP10.java`)
*   Counting unique characters.
*   Identifying the first non-repeating character using `LinkedHashSet` to preserve order and `HashSet` to track seen characters.

### Array Comparison (`setP3.java`, `setP9.java`)
*   Finding common elements between two arrays.
*   Identifying the first repeating element by checking `set.contains()` before adding.

### Concurrent Modification Prevention (`setP8.java`)
*   Removing even numbers from a Set using an `Iterator` to avoid `ConcurrentModificationException`.

### Business Logic (`mapP1.java`)
*   Managing employee salary data where Name (String) is the Key and Salary (Integer) is the Value.
*   Filtering map entries based on value criteria (> 50,000).
