package javalab;

import java.util.Scanner;

public class matrixrowsum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row size:");
        int row = sc.nextInt();

        System.out.println("Enter column size:");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        // Input matrix values
        System.out.println("Enter matrix values:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print matrix
        System.out.println("\nThe matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Compute and display row sums
        System.out.println("\nRow sums:");
        for (int i = 0; i < row; i++) {
            int rowSum = 0;
            for (int j = 0; j < col; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum: " + rowSum);
        }

        // Compute and display column sums
        System.out.println("\nColumn sums:");
        for (int j = 0; j < col; j++) {
            int colSum = 0;
            for (int i = 0; i < row; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + " sum: " + colSum);
        }

        sc.close(); // Close scanner
    }
}

