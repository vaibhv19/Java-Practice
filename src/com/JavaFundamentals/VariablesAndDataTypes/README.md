# Variables and Data Types

## Summary
Java is a **strongly typed** programming language. Every variable must have a declared type before use.

## Data Types Summary Table
| Data Type | Size | Default Value | Range / Values |
|---|---|---|---|
| `byte` | 1 byte (8 bits) | `0` | -128 to 127 |
| `short` | 2 bytes (16 bits) | `0` | -32,768 to 32,767 |
| `int` | 4 bytes (32 bits) | `0` | -2,147,483,648 to 2,147,483,647 |
| `long` | 8 bytes (64 bits) | `0L` | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| `float` | 4 bytes (32 bits) | `0.0f` | ~6-7 decimal digits |
| `double` | 8 bytes (64 bits) | `0.0d` | ~15 decimal digits |
| `char` | 2 bytes (16 bits) | `'\u0000'` | 0 to 65,535 (Unicode characters) |
| `boolean` | ~1 bit | `false` | `true` or `false` |

## Types of Scope
1. **Class/Static Scope**: Accessible throughout the class.
2. **Instance Scope**: Belongs to object instance.
3. **Local Scope**: Declared inside methods, accessible only within method.
4. **Block Scope**: Inside `{ ... }` blocks (e.g., `if`, `for`).

## Related Java Files
- [`PrimitiveTypes.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/JavaFundamentals/VariablesAndDataTypes/PrimitiveTypes.java)
- [`TypeCasting.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/JavaFundamentals/VariablesAndDataTypes/TypeCasting.java)
- [`ConstantsAndScope.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/JavaFundamentals/VariablesAndDataTypes/ConstantsAndScope.java)
