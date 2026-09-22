# Recursion in Java

## Definition
Recursion occurs when a method calls itself directly or indirectly to solve a problem by breaking it into smaller instances of the same problem.

## Essential Components
1. **Base Case**: The termination condition where no further recursive calls are made.
2. **Recursive Step**: The logical step that reduces the problem size towards the base case.

## Call Stack Mechanics
Each recursive invocation pushes a new stack frame onto the JVM Call Stack containing local variables and return address. When base case is met, stack frames pop back up returning intermediate results.

## Related Java Files
- [`RecursionBasics.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/JavaFundamentals/Recursion/RecursionBasics.java)
- [`RecursiveOperations.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/JavaFundamentals/Recursion/RecursiveOperations.java)
