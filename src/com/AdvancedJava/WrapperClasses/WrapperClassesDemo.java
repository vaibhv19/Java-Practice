package com.AdvancedJava.WrapperClasses;

/**
 * WrapperClassesDemo demonstrates object representations of primitive data types:
 * - Integer, Double, Character, Boolean, Long, Float, Short, Byte
 * - Autoboxing (Primitive -> Wrapper)
 * - Unboxing (Wrapper -> Primitive)
 * - Utility methods (parseInt, valueOf, compare, binaryString)
 * - NullPointerException risks with unboxing null references
 */
public class WrapperClassesDemo {

    public static void main(String[] args) {
        // Autoboxing (primitive int -> Integer object)
        int primitiveInt = 42;
        Integer boxedInt = primitiveInt;

        // Unboxing (Integer object -> primitive int)
        int unboxedInt = boxedInt;

        System.out.println("Primitive: " + primitiveInt + ", Boxed: " + boxedInt + ", Unboxed: " + unboxedInt);

        // Integer Utility Methods
        String numStr = "123";
        int parsedInt = Integer.parseInt(numStr);
        String binaryStr = Integer.toBinaryString(42);
        int maxVal = Integer.max(50, 80);

        System.out.println("Parsed String '123': " + parsedInt);
        System.out.println("Binary representation of 42: " + binaryStr);
        System.out.println("Max of 50 and 80: " + maxVal);

        // Wrapper Caching (-128 to 127 for Integer)
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println("i1 == i2 (Value 100 in Cache): " + (i1 == i2)); // true

        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println("i3 == i4 (Value 200 outside Cache): " + (i3 == i4)); // false
        System.out.println("i3.equals(i4): " + i3.equals(i4)); // true
    }
}
