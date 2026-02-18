import java.util.Scanner;
public class HeartRiskCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int score = 0;
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // clear buffer
            if (age > 45) {
                score += 2;
            }
            System.out.print("Do you smoke? (yes/no): ");
            String smoke = sc.nextLine();
            if (smoke.equalsIgnoreCase("yes")) {
                score += 2;
            }
            System.out.print("High Blood Pressure? (yes/no): ");
            String bp = sc.nextLine();
            if (bp.equalsIgnoreCase("yes")) {
                score += 2;
            }
            System.out.print("High Cholesterol? (yes/no): ");
            String chol = sc.nextLine();
            if (chol.equalsIgnoreCase("yes")) {
                score += 2;
            }
            System.out.print("Do you exercise regularly? (yes/no): ");
            String exercise = sc.nextLine();
            if (exercise.equalsIgnoreCase("no")) {
                score += 1;
            }
            System.out.println("\n--- Result ---");
            if (score <= 2) {
                System.out.println("Low Risk ");
            } else if (score <= 5) {
                System.out.println("Medium Risk ");
            } else {
                System.out.println("High Risk ");
            }
        }
    }
}
