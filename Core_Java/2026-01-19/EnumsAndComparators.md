# Enums & Sorting Interfaces (Day 26 - Jan 19, 2026)

## 1. Enum (Enumeration)
*   **Definition:** `Enum` is a special data type in Java used to define a fixed set of named constants.
*   **Key Characteristics:**
    *   Introduced in JDK 1.5.
    *   Defined using the `enum` keyword.
    *   Constants are implicitly `public static final`.
    *   Enums cannot be instantiated using `new`.
    *   Can contain fields, constructors, and methods.

### Built-in Methods
| Method | Return Type | Description |
| :--- | :--- | :--- |
| `values()` | `EnumType[]` | Returns an array of all enum constants. |
| `valueOf(String name)` | `EnumType` | Converts a String to the corresponding enum constant. |
| `ordinal()` | `int` | Returns the index (position) of the constant (starting at 0). |
| `name()` | `String` | Returns the name of the constant as a String. |

### Advanced Usage (`EnumP1.java`)
Enums can act like classes with state and behavior.
```java
enum OrderStatus {
    PLACED(1, "Order Placed"),
    DELIVERED(4, "Delivered");

    private int code;
    private String message;

    // Constructor (Must be private or package-private)
    OrderStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
```

---

## 2. Comparable Interface
*   **Package:** `java.lang`
*   **Purpose:** Defines the **Natural Sorting Order** of a class.
*   **Mechanism:** The class itself implements `Comparable<T>` and overrides `compareTo()`.
*   **Limitation:** Only one sorting logic can be defined.

### Implementation
```java
class Student implements Comparable<Student> {
    int id;
    // ...
    @Override
    public int compareTo(Student s) {
        return this.id - s.id; // Sort by ID
    }
}
// Usage:
Collections.sort(studentList);
```

---

## 3. Comparator Interface
*   **Package:** `java.util`
*   **Purpose:** Defines **Custom Sorting Orders**.
*   **Mechanism:** A separate class implements `Comparator<T>` and overrides `compare()`.
*   **Advantage:** Can define multiple sorting strategies (e.g., sort by Name, then by Marks) without modifying the original class.

### Implementation
```java
class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
// Usage:
Collections.sort(studentList, new SortByName());
```

---

## 4. Comparable vs Comparator

| Feature | Comparable | Comparator |
| :--- | :--- | :--- |
| **Package** | `java.lang` | `java.util` |
| **Sorting Type** | Natural (Default) | Custom (Ad-hoc) |
| **Method** | `compareTo(Object o)` | `compare(Object o1, Object o2)` |
| **Modifications** | Modifies the original class. | Original class remains unchanged. |
| **Flexibility** | Single sorting sequence. | Multiple sorting sequences. |

---

## 5. Practice Scenarios

### Order Processing System (`comparatorP1.java`)
Implemented a complex multi-level sorting logic for `Order` objects:
1.  **Order Amount** (Descending)
2.  **Item Count** (Ascending)
3.  **Order Time** (Ascending)
4.  **Customer Name** (Ascending)
5.  **Order ID** (Ascending)

This demonstrates the power of `Comparator` for chaining comparison logic when the default `Comparable` behavior is insufficient or unavailable.
