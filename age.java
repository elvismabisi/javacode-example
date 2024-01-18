import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        int numberOfStudents = 6;
        int numberOfAges = 1; // Number of ages per student

        int[][] studentAges = new int[numberOfStudents][numberOfAges];

        // Input loop to get the ages from the user
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i][0] = scanner.nextInt();
        }

        // Display the ages of the students
        System.out.println("\nAges of the students:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ": " + studentAges[i][0]);
        }

    }
}
