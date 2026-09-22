# Object Comparison in Java

## Equals & HashCode Contract
1. **Reflexive**: `x.equals(x)` is true.
2. **Symmetric**: `x.equals(y)` iff `y.equals(x)`.
3. **Transitive**: `x.equals(y)` and `y.equals(z)` implies `x.equals(z)`.
4. **Consistent**: Multiple calls return identical result.
5. **Null comparison**: `x.equals(null)` is false.
6. **HashCode alignment**: If `x.equals(y)` is true, `x.hashCode() == y.hashCode()` MUST be true.

## Comparable vs Comparator
| Feature | `Comparable<T>` | `Comparator<T>` |
|---|---|---|
| Package | `java.lang` | `java.util` |
| Method | `compareTo(T o)` | `compare(T o1, T o2)` |
| Modification | Modifies target class | Outer class or Lambda |
| Sorting Type | Single Natural Ordering | Multiple Custom Orderings |

## Related Java Files
- [`EqualsAndHashCodeDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/ObjectComparison/EqualsAndHashCodeDemo.java)
- [`ComparableAndComparatorDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/ObjectComparison/ComparableAndComparatorDemo.java)
