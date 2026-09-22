# JVM Architecture & Memory Management

## 1. JVM Architecture Overview
```
┌─────────────────────────────────────────────────────────────────┐
│                      Class Loader Subsystem                     │
│               Loading ───► Linking ───► Initialization          │
└────────────────────────────────┬────────────────────────────────┘
                                 │
                                 ▼
┌─────────────────────────────────────────────────────────────────┐
│                       Runtime Data Areas                        │
│ ┌───────────────┐ ┌───────────────┐ ┌─────────────────────────┐ │
│ │ Method Area   │ │ Heap Area     │ │ Java Thread Stack       │ │
│ │ (Metaspace)   │ │ (Objects)     │ │ (Frames & Primitives)   │ │
│ └───────────────┘ └───────────────┘ └─────────────────────────┘ │
│ ┌───────────────────────────────┐ ┌─────────────────────────┐ │
│ │ PC Registers                  │ │ Native Method Stacks    │ │
│ └───────────────────────────────┘ └─────────────────────────┘ │
└────────────────────────────────┬────────────────────────────────┘
                                 │
                                 ▼
┌─────────────────────────────────────────────────────────────────┐
│                        Execution Engine                         │
│   Interpreter  │  JIT Compiler  │  Garbage Collector (GC)       │
└─────────────────────────────────────────────────────────────────┘
```

## 2. Runtime Memory Areas
- **Heap Area**: Shared across all threads. Stores all object instances and array allocations.
- **Stack Area**: Per-thread private stack. Stores stack frames containing local variables, primitive values, and object reference pointers.
- **Metaspace (Method Area)**: Native memory (replacing PermGen in Java 8+) storing class metadata, method bytecodes, static fields, and constant pool.
- **PC Register**: Contains memory address of JVM instruction currently executing per thread.
- **Native Method Stack**: Holds native C/C++ library function call state.

## 3. Generational Garbage Collection (GC)
- **Young Generation**:
  - **Eden Space**: New objects initially allocated here.
  - **Survivor Spaces (S0 & S1)**: Objects surviving Minor GC copy back-and-forth between S0/S1.
- **Old Generation (Tenured)**: Long-surviving objects promoted here after reaching aging threshold.
- **Minor GC**: Reclaims unreferenced objects in Young Generation. Fast STW (Stop-The-World) pause.
- **Major / Full GC**: Reclaims unreferenced objects in Old Generation and Metaspace. Slower STW pause.

## Related Java Files
- [`MemoryAllocationDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/MemoryAndJVM/MemoryAllocationDemo.java)
