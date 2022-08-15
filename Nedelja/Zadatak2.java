package Wk3.Nedelja;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int RC = 4;
        int[][] matrix = new int[RC][RC];

        System.out.println("Unesi elemente za matricu: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("-----SWAPPED MATRIX-----");
        printSwappedMatrix(matrix);
    }

    static int indexOfLargestRow(int[][] matrix) {
        int largestNumber = matrix[0][0];
        int largestIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] > largestNumber) {
                largestNumber = matrix[i][0];
                largestIndex = i;
            }
        }
        return largestIndex;
    }

    static void printSwappedMatrix(int[][] matrix) {
        int largestIndex = indexOfLargestRow(matrix);
        int[] rowArray = matrix[0];
        matrix[0] = matrix[largestIndex];
        matrix[largestIndex] = rowArray;

        for (var elements : matrix) {
            for (var element : elements) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
