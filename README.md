# Comprehensive Java Code Collection & Learning Repository

Welcome to the **Java Code Collection**. This repository is a code-first, practical reference for learning, revising, and mastering Core and Advanced Java.

> [!NOTE]
> **Code-First Repository**: Actual runnable `.java` source code files are the primary content of this repository. Markdown files serve strictly as supporting documentation.

---

## 🏗️ Repository Architecture

The codebase is organized into **ONLY THREE** major categories:

```
src/com/
│
├── 1. JavaFundamentals/
│   ├── Basics/                   (JDK, JRE, JVM, javac, main method, identifiers, comments)
│   ├── VariablesAndDataTypes/    (Primitives, literals, widening/narrowing casting, final, scope)
│   ├── Operators/                (Arithmetic, relational, logical, assignment, bitwise, precedence)
│   ├── ControlFlow/              (if-else, switch expressions, loops, break/continue)
│   ├── Methods/                  (Parameters, call-by-value, static vs instance, overloading)
│   ├── Recursion/                (Base case, recursive step, call stack, factorial, fibonacci)
│   ├── Arrays/                   (1D, 2D matrices, jagged arrays, java.util.Arrays utility)
│   ├── Strings/                  (String Constant Pool, immutability, StringBuilder, StringBuffer)
│   └── InputOutput/              (System.out formatting, Scanner parsing & newline fix)
│
├── 2. OOP/
│   ├── ClassesAndObjects/        (Class blueprint, fields, methods, object instantiation)
│   ├── Constructors/             (No-arg, parameterized, overloading, constructor chaining)
│   ├── Keywords/                 (this, super, final keyword applications)
│   ├── AccessModifiers/          (private, default, protected, public visibility matrix)
│   ├── Encapsulation/            (Data hiding, getters/setters, invariant validation)
│   ├── Inheritance/              (Single, multilevel, hierarchical inheritance)
│   ├── Polymorphism/             (Static overloading vs Dynamic method dispatch)
│   ├── Abstraction/              (Abstract classes and abstract methods)
│   ├── Interfaces/               (Interfaces, default methods, static interface methods)
│   ├── AdvancedOOP/              (Composition vs Inheritance, immutability pattern, inner classes)
│   └── Projects/                 (Educational mini-projects: ATM, Library, Parking Lot)
│
└── 3. AdvancedJava/
    ├── WrapperClasses/           (Autoboxing, unboxing, caching pool, parsing methods)
    ├── ExceptionHandling/        (Throwable, checked/unchecked, custom exceptions, try-with-resources)
    ├── FileHandling/             (FileReader, FileWriter, BufferedReader, BufferedWriter)
    ├── Collections/              (List, Set, Map, Queue, Deque, Iterator & ListIterator)
    ├── Generics/                 (Generic classes/methods, wildcards, PECS principle)
    ├── ObjectComparison/         (equals & hashCode contract, Comparable vs Comparator)
    ├── Enums/                    (Type-safe enums, fields, constructors, methods, switch)
    ├── FunctionalProgramming/    (Lambdas, Predicate/Consumer/Supplier/Function, Streams, Optional)
    ├── Multithreading/           (Threads, Locks, Synchronization, Executors, CompletableFuture, Concurrent Collections)
    ├── MemoryAndJVM/             (JVM Architecture, Metaspace, Generational GC, String interning)
    └── JavaForDSA/               (Data structures toolkit, Binary Search, Bit manipulation, Complexity cheat sheet)
```

---

## 📈 Learning Progression

```
Java Fundamentals ───► Object-Oriented Programming (OOP) ───► Advanced Java ───► Java for DSA
```

1. **Java Fundamentals**: Syntax, control flow, methods, arrays, strings, and basic I/O.
2. **OOP**: Designing robust object-oriented software with encapsulation, inheritance, polymorphism, abstraction, and modular design patterns.
3. **Advanced Java**: Exception handling, I/O streams, Java Collections Framework, Generics, Concurrency, Functional Programming, and JVM internals.
4. **Java for DSA**: Language patterns, algorithm templates, and performance cheat sheets for problem solving.

---

## 📦 Package Naming Conventions
All Java source files follow package names aligned with the three-folder hierarchy:
- `package com.JavaFundamentals.<Subfolder>;`
- `package com.OOP.<Subfolder>;`
- `package com.AdvancedJava.<Subfolder>;`

---

## 🛠️ Compilation and Execution

To compile the entire codebase into the `out` directory:

```powershell
$files = Get-ChildItem -Path "src\com" -Recurse -Filter "*.java" | Select-Object -ExpandProperty FullName
javac -d out $files
```

To run representative example classes:

```powershell
java -cp out com.JavaFundamentals.Basics.HelloWorld
java -cp out com.OOP.Projects.ATM.ATMProjectDemo
java -cp out com.AdvancedJava.FunctionalProgramming.StreamsAndOptionalDemo
java -cp out com.AdvancedJava.Multithreading.ExecutorsAndConcurrencyToolkit
java -cp out com.AdvancedJava.JavaForDSA.DSADataStructuresToolkit
```
