# Java Strings

## Key Concepts
- **Immutability**: Once a `String` object is created on Heap/SCP, its value cannot be modified. Any modification creates a new `String` object.
- **String Constant Pool (SCP)**: Special area inside the Heap managed by JVM to store string literals efficiently and prevent duplicate allocations.
- **`==` vs `.equals()`**: `==` checks reference memory addresses, whereas `.equals()` checks character content sequence equality.
- **`StringBuilder` vs `StringBuffer`**:
  - `StringBuilder`: Asynchronous, un-synchronized, faster (use for single-threaded loops).
  - `StringBuffer`: Synchronized, thread-safe, slower overhead (use for concurrent updates).

## Related Java Files
- [`StringBasics.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/JavaFundamentals/Strings/StringBasics.java)
- [`StringMethods.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/JavaFundamentals/Strings/StringMethods.java)
- [`StringBuilderAndBuffer.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/JavaFundamentals/Strings/StringBuilderAndBuffer.java)
