package Wk3.Nedelja;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ROWS = 4;
        final int COLUMNS = 6;
        int[][] matrix = new int[ROWS][COLUMNS];

        System.out.println("Unesi elemente matrice: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.toString(largestRow(matrix)));
    }

    static int[] largestRow(int[][] matrix) {
        int[] array = new int[matrix.length];
        int sum;
        int max = 0;
        int indeks;

        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                if (sum > max) {
                    max = sum;
                    indeks = i;
                    array = matrix[indeks];
                }
            }
        }
        return array;
    }
}
