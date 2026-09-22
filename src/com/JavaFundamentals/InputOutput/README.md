# Input & Output in Java

## Summary
- **`System.out`**: Standard output stream (PrintStream).
- **`Scanner`**: Utility class (`java.util.Scanner`) for parsing primitive types and strings using regular expressions.

## Scanner Pitfall & Fix
When calling `nextInt()` or `nextDouble()`, the numeric value is consumed, but the newline character (`\n`) pressed by the user remains in the input buffer. Calling `nextLine()` right after reads that leftover `\n` as an empty string.
**Fix**: Call `scanner.nextLine()` right after numeric inputs to clear the trailing newline.

## Related Java Files
- [`FormattedOutput.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/JavaFundamentals/InputOutput/FormattedOutput.java)
- [`ScannerInput.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/JavaFundamentals/InputOutput/ScannerInput.java)
