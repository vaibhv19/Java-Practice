package com.AdvancedJava.Generics;

/**
 * GenericClassesAndMethods demonstrates type-safe parameterization:
 * - Generic Class: Box<T>
 * - Generic Method: printArray(T[] array)
 * - Multiple Type Parameters: KeyValue<K, V>
 * - Prevents ClassCastException at runtime via compile-time type checking
 */

// Generic Class Box<T>
class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

// Generic KeyValue<K, V> Class
class KeyValue<K, V> {
    private K key;
    private V value;

    public KeyValue(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void display() {
        System.out.println("Key [" + key.getClass().getSimpleName() + "]: " + key + 
                           " => Value [" + value.getClass().getSimpleName() + "]: " + value);
    }
}

public class GenericClassesAndMethods {

    // Generic Method
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Generic Class instantiation
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello Generics");
        System.out.println("Box content: " + stringBox.getContent());

        Box<Integer> intBox = new Box<>();
        intBox.setContent(100);
        System.out.println("Box content: " + intBox.getContent());

        // Multi-parameter generic
        KeyValue<Integer, String> entry = new KeyValue<>(1, "Active");
        entry.display();

        // Generic Method invocation
        Integer[] nums = {1, 2, 3, 4, 5};
        String[] words = {"Java", "Generics", "Type-Safe"};

        System.out.print("Integer Array: ");
        printArray(nums);
        System.out.print("String Array:  ");
        printArray(words);
    }
}
