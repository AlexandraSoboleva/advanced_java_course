package edu.technopolis.homework;


/**
 * Matrix multiplication home task.
 * <br/>
 * Matrix dimension and elements are passed as CLI arguments.
 */
public class MatrixMultiplication {


    static void matrixMult(int[][] arrA, int[][] arrB, int[][] arrC) {
        for (int i = 0; i < arrC.length; i++) {
            for (int j = 0; j < arrC[i].length; j++)
                for (int l = 0; l < arrB.length; l++) {
                    arrC[i][j] += arrA[i][l] * arrB[l][j];
                }
        }
    }

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) System.out.print(arr[i][j]);
            System.out.println();
        }
    }

    public static void main(String... args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int x = Integer.parseInt(args[2]);
        int y = Integer.parseInt(args[3]);

        int ind = 4;

        int[][] arrA = new int[a][b];
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) arrA[i][j] = Integer.parseInt(args[ind++]);
        }

        int[][] arrB = new int[x][y];

        for (int i = 0; i < arrB.length; i++) {
            for (int j = 0; j < arrB[i].length; j++) arrB[i][j] = Integer.parseInt(args[ind++]);
        }

        int[][] arrC;


        if (a == y) {
            arrC = new int[x][b];
            matrixMult(arrB, arrA, arrC);
            print(arrC);
        } else if (b == x) {
            arrC = new int[a][y];
            matrixMult(arrA, arrB, arrC);
            print(arrC);
        } else System.out.println("Нельзя перемножить матрицы размером" + a + " на " + b + " и " + x + " на " + y);

    }
}