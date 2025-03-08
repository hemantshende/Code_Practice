import java.util.Scanner;

public class SignificantValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Validate matrix size input
        int n;
        do {
            System.out.print("Enter matrix size (1 <= n <= 50): ");
            // Continue prompting until a valid integer is entered
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer between 1 and 50.");
                scanner.next(); // Consume invalid input
            }
            n = scanner.nextInt();
        } while (n <= 0 || n > 50); // Validate the input value

        // Create and validate matrix elements
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                do {
                    System.out.print("Enter element [" + i + ", " + j + "]: ");
                    // Continue prompting until a valid integer is entered
                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid input. Please enter an integer between 0 and 50.");
                        scanner.next(); // Consume invalid input
                    }
                    matrix[i][j] = scanner.nextInt();
                } while (matrix[i][j] < 0 || matrix[i][j] > 50); // Validate element range
            }
        }

        // Find significant point and handle potential absence
        int[] result = findSignificantPoint(matrix);
        if (result[0] == -1) {
            System.out.println("No significant point found.");
        } else {
            System.out.println("Significant point: " + result[0] + " at row " + result[1] + ", column " + result[2]);
        }
    }

    public static int[] findSignificantPoint(int[][] matrix) {
        int n = matrix.length;

        int[] rowMin = new int[n];
        int[] colMax = new int[n];

        for (int i = 0; i < n; i++) {
            rowMin[i] = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
            }
        }

        for (int j = 0; j < n; j++) {
            colMax[j] = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    return new int[]{matrix[i][j], i, j};
                }
            }
        }

        return new int[]{-1, -1, -1};
    }
}