import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();

        for (int i = 0; i<SIZE; i++) {
            for (int j = 0; j<SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        System.out.println("Исходная матрица: ");
        printMatrix(colors);
        System.out.println();

        System.out.println("На какой угол вы хотите повернуть матрицу (90, 180, 270)?");
        int x = Integer.parseInt(scanner.nextLine());

        System.out.println("Новая матрица: ");
        printMatrix(rotateMatrix(colors, x));

    }
    public static void printMatrix(int[][] colors) {
        for (int i = 0; i<SIZE; i++) {
            for (int j = 0; j<SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] rotateMatrix (int[][] colors, int x) {
        int[][] rotatedColors = new int[SIZE][SIZE];
        if (x == 90) {
            for (int i = 0; i<SIZE; i++) {
                for (int j = 0; j<SIZE; j++) {
                    rotatedColors[i][j] = colors[SIZE -  j - 1][i];
                }
            }
        }
        if (x == 180) {
            for (int i = 0; i<SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    rotatedColors[i][j] = colors[SIZE - i - 1][SIZE - j - 1];

                }
            }
        }
        if (x == 270) {
            for (int i = 0; i<SIZE; i++) {
                for (int j = 0; j<SIZE; j++) {
                    rotatedColors[i][j] = colors[j][SIZE - 1 - i];
                }
            }
        }
        else {
            return null;
        }
        return rotatedColors;
    }
}
