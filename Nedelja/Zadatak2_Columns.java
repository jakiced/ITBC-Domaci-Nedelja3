package Wk3.Nedelja;

import java.util.Scanner;

public class Zadatak2_Columns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ROWS = 4;
        final int COLUMNS = 4;
        int[][] matrix = new int[ROWS][COLUMNS];

        System.out.println("Unesi elemente za matricu: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("----SWAPPED MATRIX----");
        printSwappedMatrix(matrix);
    }

    static void printSwappedMatrix(int[][] matrix) {
        int largestIndex = getIndexOfLargestArray(matrix);

        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][largestIndex];
            matrix[i][largestIndex] = temp;
        }

        for (var elements : matrix) {
            for (var element : elements) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    static int getIndexOfLargestArray(int[][] matrix) {
        int jLength = matrix[0].length;
        int sum;
        int largestNumber = Integer.MIN_VALUE;
        int largestIndex = 0;

        for (int i = 0; i < jLength; i++) {
            sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
                if (sum > largestNumber) {
                    largestNumber = sum;
                    largestIndex = i;
                }
            }

        }
        return largestIndex;
    }
}

