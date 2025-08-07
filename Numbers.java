import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Numbers {
    public static void main(String[] args) {
        String fileName = "numbers.txt";
        try {
            String content = new String(Files.readAllBytes(Paths.get(fileName)));
            String[] numbers = content.trim().split(",");
            int sum = 0;
            for (String num : numbers) {
                sum += Integer.parseInt(num.trim());
            }
            System.out.println("Sum: " + sum);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + e.getMessage());
        }
    }
}
