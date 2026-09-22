# Java Generics & PECS Rule

## Type Erasure
Java Generics provide compile-time type safety. At compilation time, the Java compiler replaces all type parameters with `Object` (or bound types) and inserts necessary type casts. Generic type information is erased in `.class` bytecode.

## PECS Principle
- **P**roducer **E**xtends: Use `? extends T` when you only **read** items from a collection.
- **C**onsumer **S**uper: Use `? super T` when you only **write** items into a collection.

## Related Java Files
- [`GenericClassesAndMethods.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/Generics/GenericClassesAndMethods.java)
- [`WildcardsAndPECS.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/Generics/WildcardsAndPECS.java)
