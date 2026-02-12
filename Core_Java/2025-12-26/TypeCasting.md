# TypeCasting

The conversion of one datatype into another datatype is known as **TypeCasting**.

---

## Types of TypeCasting
1. **Primitive TypeCasting**
2. **Non-Primitive TypeCasting**

---

### 1. Primitive TypeCasting
The conversion of one primitive datatype into another primitive datatype is known as primitive typecasting.

#### **Widening**
* The conversion of smaller datatypes into bigger datatype.
* Also known as **implicit typecasting**.
* **Flow:**
    * `byte` -> `short` -> `int` -> `long` -> `float` -> `double`
    * `char` -> `int` -> `long` -> `float` -> `double`

#### **Narrowing**
* The conversion of bigger datatype into smaller datatype.
* Also known as **explicit typecasting** because it needs a typecast operator.
* **Note:** During Narrowing, data loss might happen.



---

### 2. Non-Primitive TypeCasting
The conversion of one non-primitive datatype into another non-primitive datatype is known as non-primitive typecasting.

#### **Types:**
1.  **Upcasting**: Conversion of a subclass into a superclass.
2.  **Downcasting**: Conversion of a superclass into a subclass.