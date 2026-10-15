# java-string-basics-beginner
A beginner's Java code exploring String concepts — methods (charAt, substring, trim, contains), character/ASCII basics, memory allocation (String Pool inside Heap, immutability), == vs equals(), and simple code flow. Notes from learning these fundamentals.


/* ###### */

**Key points I learned:**

- **String Pool**: All string literals (`"Deep"`) are stored in a special pool. If the same value already exists, Java reuses it (memory saving).
- **`==` operator**: Compares **references** (whether two variables point to the exact same object).
  - `String a = "Deep"; String b = "Deep";` → `a == b` is `true` (both point to the same pool object).
  - `String a = new String("Deep"); String b = new String("Deep");` → `a == b` is `false` (two different objects).
- **`.equals()` method**: Compares **content** (the actual characters). Use this when you care about the value.
- **Immutability**: Once a String is created, it cannot be changed.  
  ```java
  String str = "Deep";
  str = "Ghosh";   // This does NOT change the original "Deep".
                   // A new String "Ghosh" is created and str now points to it.
                   // Old "Deep" becomes eligible for Garbage Collection.

-----------------------------------------------------------------------------------------------------------------------

                   

 What I Still Want to Learn Next

StringBuilder and StringBuffer in detail (performance difference)
More advanced String methods (split, replace, indexOf, etc.)
Why String is immutable from a security + performance perspective
How the String Pool works with intern()
