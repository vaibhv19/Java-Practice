# Functional Programming in Java (Java 8+)

## Functional Interfaces (`java.util.function`)
- `Predicate<T>`: `boolean test(T t)` - Evaluates boolean condition.
- `Consumer<T>`: `void accept(T t)` - Consumes input argument.
- `Supplier<T>`: `T get()` - Generates/supplies output value.
- `Function<T, R>`: `R apply(T t)` - Maps input T to result R.

## Stream Pipeline Structure
A Stream pipeline consists of:
1. **Source**: Collection, array, generator function (`stream()`).
2. **Intermediate Operations** (Lazy evaluation):
   - `filter`: Filters elements matching predicate.
   - `map`: Transforms elements using mapping function.
   - `sorted`: Sorts stream elements.
   - `distinct`: Removes duplicates via `equals()`.
   - `limit`: Truncates stream to max size.
   - `skip`: Discards first N elements.
3. **Terminal Operations** (Executes pipeline):
   - `collect`: Collects elements into List/Set/Map (`Collectors.toList()`).
   - `reduce`: Combines elements into single summary value.
   - `forEach`: Performs action for each element.

## Optional API
`Optional<T>` is a type-safe container object used to represent the presence or absence of a non-null value, avoiding `NullPointerException`.

## Related Java Files
- [`FunctionalInterfacesAndLambdas.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/FunctionalProgramming/FunctionalInterfacesAndLambdas.java)
- [`MethodReferencesDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/FunctionalProgramming/MethodReferencesDemo.java)
- [`StreamsAndOptionalDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/FunctionalProgramming/StreamsAndOptionalDemo.java)
