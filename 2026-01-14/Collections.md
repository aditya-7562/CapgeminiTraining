# Java Collections: Iterator, Vector, and Stack

## 1. Iterator Interface
*   **Definition:** An Iterator is a cursor used to traverse through a Collection. It is an interface defined in the `java.util` package.
*   **Direction:** It allows traversal of the collection in the **forward direction only**.
*   **Universal Cursor:** It is applicable to all Collection classes (List, Set, etc.), making it a universal cursor.

### Key Methods
| Method | Return Type | Description |
| :--- | :--- | :--- |
| `hasNext()` | `boolean` | Returns `true` if the iteration has more elements. |
| `next()` | `Object`/`E` | Returns the next element in the iteration and advances the cursor. |
| `remove()` | `void` | Removes the last element returned by the iterator. Must be called after `next()`. |

### Usage
*   To get an iterator: `Iterator<E> itr = collection.iterator();`
*   **Safety:** Allows safe removal of elements during traversal, avoiding `ConcurrentModificationException`.

---

## 2. ListIterator Interface
*   **Definition:** A sub-interface of `Iterator` that allows traversal in **both directions** (forward and backward).
*   **Applicability:** It works **only with List** implementations (like `ArrayList`, `LinkedList`, `Vector`, `Stack`).

### Key Methods (in addition to Iterator methods)
| Method | Return Type | Description |
| :--- | :--- | :--- |
| `hasPrevious()` | `boolean` | Returns `true` if the list has more elements when traversing in reverse. |
| `previous()` | `Object`/`E` | Returns the previous element in the list and moves the cursor backwards. |
| `add(E e)` | `void` | Inserts the specified element into the list. |
| `set(E e)` | `void` | Replaces the last element returned by `next()` or `previous()` with the specified element. |

---

## 3. Vector Class
*   **Definition:** `Vector` is a legacy class in Java (present since JDK 1.0) that implements the `List` interface.
*   **Data Structure:** It uses a growable (dynamic) array to store elements. Elements are stored in contiguous memory locations.
*   **Synchronization:** It is **synchronized** (Thread-Safe), meaning multiple threads cannot access it simultaneously without external synchronization.

### Key Characteristics
*   **Legacy:** While part of the Collections Framework, `ArrayList` is generally preferred for non-threaded implementations.
*   **Growth Rate:** When the vector is full, its capacity **doubles** (increases by 100%).

### Vector vs. ArrayList
| Feature | Vector | ArrayList |
| :--- | :--- | :--- |
| **Synchronization** | Synchronized (Thread-Safe) | Not Synchronized (Not Thread-Safe) |
| **Performance** | Slower (due to synchronization overhead) | Faster |
| **Growth Strategy** | Doubles in size (100% increase) | Increases by 50% |

**Example:** `vector.java` demonstrates adding elements, iterating using a standard loop, and using an `Iterator`.

---

## 4. Stack Class
*   **Definition:** `Stack` is a legacy class that extends `Vector`.
*   **Principle:** It follows the **LIFO** (Last In, First Out) principle.
*   **Synchronization:** Since it extends `Vector`, it is also synchronized.

### Key Methods
| Method | Description |
| :--- | :--- |
| `push(E item)` | Pushes an item onto the top of the stack. |
| `pop()` | Removes and returns the object at the top of the stack. Throws `EmptyStackException` if empty. |
| `peek()` | Looks at the object at the top without removing it. Throws `EmptyStackException` if empty. |
| `search(Object o)` | Returns the 1-based position of the object from the top. Returns -1 if not found. |
| `empty()` | Returns `true` if the stack is empty. |

**Example:** `stack.java` demonstrates pushing, popping, peeking, and searching for elements.

---

## 5. Practice Problems

### Removal using Iterator (`itrP1.java`)
*   **Task:** Remove objects from a list one by one using an Iterator.
*   **Logic:** A `while` loop checks `hasNext()`, calls `next()` to retrieve the item, and then `remove()` to delete it safely.

### Backward Removal using ListIterator (`itrP2.java`)
*   **Task:** Remove elements from a list while traversing backwards.
*   **Logic:**
    1.  Traverse to the end of the list using `while(ltr.hasNext())`.
    2.  Traverse backwards using `while(ltr.hasPrevious())`.
    3.  Call `ltr.previous()` followed by `ltr.remove()` to delete elements in reverse order.

### Banking System Project (`itrP3.java`)
A comprehensive exercise combining **OOP principles** with **Collections**.

*   **Structure:**
    *   `BankOperations` (Interface): Defines `deposit`, `withdraw`, `checkBalance`.
    *   `Account` (Abstract Class): Encapsulates `accountNo`, `holderName`, `balance`.
    *   `SavingsAccount` / `CurrentAccount`: Concrete implementations.
*   **Features:** Adding accounts, polymorphic storage in `ArrayList<Account>`, depositing/withdrawing, and removing accounts using `removeIf`.
