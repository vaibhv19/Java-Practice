# Java Collections Framework (JCF)

## Framework Hierarchy
```
                        java.util.Collection
                                │
        ┌───────────────────────┼───────────────────────┐
        ▼                       ▼                       ▼
    java.util.List          java.util.Set           java.util.Queue
    (Ordered, duplicates)   (Unique elements)       (FIFO / Priority)
        │                       │                       │
 ┌──────┴──────┐         ┌──────┴──────┐                ▼
 ▼             ▼         ▼             ▼         java.util.Deque
ArrayList  LinkedList HashSet       TreeSet     (Double-ended queue)
 Vector                 LinkedHashSet              ArrayDeque
 Stack

Note: java.util.Map is an independent interface hierarchy (HashMap, LinkedHashMap, TreeMap, Hashtable).
```

## Related Java Files
- **List**: [`ArrayListDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/Collections/List/ArrayListDemo.java), [`LinkedListDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/Collections/List/LinkedListDemo.java), [`VectorAndStackDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/Collections/List/VectorAndStackDemo.java)
- **Set**: [`HashSetDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/Collections/Set/HashSetDemo.java), [`LinkedHashSetDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/Collections/Set/LinkedHashSetDemo.java), [`TreeSetDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/Collections/Set/TreeSetDemo.java)
- **Map**: [`HashMapDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/Collections/Map/HashMapDemo.java), [`LinkedHashMapDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/Collections/Map/LinkedHashMapDemo.java), [`TreeMapDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/Collections/Map/TreeMapDemo.java), [`HashtableDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/Collections/Map/HashtableDemo.java)
- **Queue/Deque**: [`QueueAndPriorityQueueDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/Collections/Queue/QueueAndPriorityQueueDemo.java), [`ArrayDequeDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/Collections/Deque/ArrayDequeDemo.java)
- **Iteration**: [`IteratorAndListIteratorDemo.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/Collections/Iteration/IteratorAndListIteratorDemo.java)
