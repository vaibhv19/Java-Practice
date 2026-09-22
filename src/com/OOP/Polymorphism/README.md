# Polymorphism in Java

## Types of Polymorphism
1. **Compile-Time Polymorphism (Static Binding)**:
   - Achieved via **Method Overloading**.
   - Method signature selected at compilation time.
2. **Run-Time Polymorphism (Dynamic Binding / Dynamic Method Dispatch)**:
   - Achieved via **Method Overriding**.
   - JVM inspects object's actual class type on Heap at runtime to execute overridden method.

## Overriding Rules
- Must share exact method name, return type (or covariant return type), and parameter list.
- Cannot reduce access modifier visibility.
- Private, static, and final methods cannot be overridden.

## Related Java Files
- [`CompileTimePolymorphism.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/OOP/Polymorphism/CompileTimePolymorphism.java)
- [`RunTimePolymorphism.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/OOP/Polymorphism/RunTimePolymorphism.java)
