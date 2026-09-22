# Exception Handling in Java

## Throwable Hierarchy
```
             java.lang.Throwable
                     │
        ┌────────────┴────────────┐
        ▼                         ▼
java.lang.Error           java.lang.Exception
(Fatal, non-recoverable)   (Recoverable)
                                  │
                  ┌───────────────┴───────────────┐
                  ▼                               ▼
        Checked Exceptions              java.lang.RuntimeException
        (IOException, SQLException)     (Unchecked Exceptions)
```

## Key Keywords
- `try`: Encloses code that might throw exceptions.
- `catch`: Handles specific exception types.
- `finally`: Guarantees code execution regardless of whether an exception occurred.
- `throw`: Explicitly triggers an exception.
- `throws`: Declares exceptions a method might propagate caller-side.
- `try-with-resources`: Automatically calls `close()` on `AutoCloseable` resources.

## Related Java Files
- [`ExceptionBasics.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/ExceptionHandling/ExceptionBasics.java)
- [`MultipleCatchAndThrow.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/ExceptionHandling/MultipleCatchAndThrow.java)
- [`CustomExceptionsDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/ExceptionHandling/CustomExceptionsDemo.java)
- [`TryWithResourcesDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/ExceptionHandling/TryWithResourcesDemo.java)
