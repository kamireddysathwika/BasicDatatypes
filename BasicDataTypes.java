public class BasicDataTypes {
    public static void main(String[] args) {
        // Demonstrating primitive data types in Java

        // Integer types
        byte byteVar = 127;          // 8-bit signed integer
        short shortVar = 32000;      // 16-bit signed integer
        int intVar = 5365577;     // 32-bit signed integer
        long longVar = 9223372036854775807L; // 64-bit signed integer

        // Floating-point types
        float floatVar =314f;      // 32-bit floating-point
        double doubleVar = 3.141592653589793; // 64-bit floating-point

        // Character type
        char charVar = 'A';          // 16-bit Unicode character

        // Boolean type
        boolean booleanVar =true;   // Can hold true or false

        // Displaying the values of all data types
        System.out.println("Byte value: " + byteVar);
        System.out.println("Short value: " + shortVar);
        System.out.println("Int value: " + intVar);
        System.out.println("Long value: " + longVar);

        System.out.println("Float value: " + floatVar);
        System.out.println("Double value: " + doubleVar);

        System.out.println("Char value: " + charVar);
        System.out.println("Boolean value: " + booleanVar);
    }
}

