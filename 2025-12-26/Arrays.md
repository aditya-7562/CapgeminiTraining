# Arrays

An array is a **homogeneous data structure** used to store data of a single datatype.

---

## Key Characteristics
* Arrays are stored in a **continuous block of memory**.
* Elements are accessed using **indexes**.
* The index starts from **0** and goes up to **n-1**, where **n** is the length of the array.
* The length of an array can be found using: `arr.length;`



---

## How to Create an Array

### 1. Using Array Literals
Use this method when you **already know the values** you want to store in the array.

**Syntax:**
```java
datatype[] variable = {v1, v2, v3, ... vn};
```

### 2. Using the new Keyword
Use this method when you do not know the values yet, but you know the size (length) of the array.

**Syntax:**

```Java
datatype[] variable = new datatype[size];
```