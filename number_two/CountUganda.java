package number_two;

import java.util.Scanner;

public class CountUganda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt librarian for book description
        System.out.println("Enter book description: ");
        String description = scanner.nextLine();

        // Count occurrences of "Uganda" (case-insensitive)
        int count = 0;
        String lowerDescription = description.toLowerCase();
        String target = "uganda";
        int index = lowerDescription.indexOf(target);

        while (index != -1) {
            count++;
            index = lowerDescription.indexOf(target, index + target.length());
        }

        // Output result
        System.out.println("The word 'Uganda' appears " + count + " times.");

        scanner.close();
    }
}
