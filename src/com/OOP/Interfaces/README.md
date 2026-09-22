# Interfaces in Java

## Key Features
- **Contract Enforcement**: Defines methods that implementing classes MUST provide.
- **Multiple Inheritance**: A Java class can implement multiple interfaces (`implements A, B, C`).
- **Fields**: Implicitly `public static final`.
- **Default Methods (Java 8+)**: Interface methods with concrete bodies using `default` keyword.
- **Static Methods (Java 8+)**: Utility helper methods called via `InterfaceName.methodName()`.

## Abstract Class vs Interface
| Feature | Abstract Class | Interface |
|---|---|---|
| Inheritance | Single (`extends`) | Multiple (`implements`) |
| Fields | Any modifier (private, protected, instance, static) | Implicitly `public static final` |
| Methods | Abstract and concrete instance methods | Abstract, `default`, `static`, `private` (Java 9+) |

## Related Java Files
- [`InterfaceBasics.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/OOP/Interfaces/InterfaceBasics.java)
- [`DefaultAndStaticMethods.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/OOP/Interfaces/DefaultAndStaticMethods.java)
