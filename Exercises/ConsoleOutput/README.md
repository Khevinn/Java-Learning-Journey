🖥️ Java Output Methods

🔹 System.out.print
Prints text to the screen without a new line.
(Equivalent to console.log in JavaScript but without an automatic line break.)

🔹 System.out.println
Prints text followed by a new line.

🔹 System.out.printf
Formats and prints multiple elements using a single command.

📌 Format Specifiers:
- %f → Floating-point number
- %d → Integer
- %s → String (text)
- %n → New line
- %c → Single character (must be in single quotes)
  
🌍 Using Locale
To format numbers based on regional settings (e.g., decimal points vs. commas).

Example:
```java
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double value = 1234.56;
        
        // Default Locale (US)
        System.out.printf("US format: %.2f%n", value);

        // Changing to Brazilian Locale
        System.out.printf(Locale.forLanguageTag("pt-BR"), "Brazil format: %.2f%n", value);
    }
}
