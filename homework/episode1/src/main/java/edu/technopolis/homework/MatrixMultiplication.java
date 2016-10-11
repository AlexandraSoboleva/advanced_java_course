package edu.technopolis.homework;

import java.util.Scanner;

/**
 * Matrix multiplication home task.
 * <br/>
 * Matrix dimension and elements are passed as CLI arguments.
 */
public class MatrixMultiplication {

 static void init(int[][] arr,Scanner in){
     for (int i=0;i<arr.length;i++){
         for (int j=0;j<arr[i].length;j++) arr[i][j]=in.nextInt();;
     }
 }

    static void matrixMult(int[][] arrA, int[][] arrB, int[][] arrC){
        for (int i=0;i<arrC.length;i++){
            for (int j=0;j<arrC[i].length;j++)
                for (int l=0;l<arrB.length;l++){
                    arrC[i][j]+=arrA[i][l]*arrB[l][j];
                }
        }
    }

    static void print(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++) System.out.print(arr[i][j]);
            System.out.println();
        }
    }

    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        int ind=4;

        int[][] arrA = new int[a][b];
        init(arrA,in);
        int[][] arrB = new int[x][y];
        init(arrB,in);
        int[][] arrC;


        if (a==y) {
            arrC=new int[x][b];
            matrixMult(arrB,arrA,arrC);
            print(arrC);
        }
        else if (b==x){
            arrC=new int[a][y];
            matrixMult(arrA,arrB,arrC);
            print(arrC);
        }
        else System.out.println("Нельзя перемножить матрицы размером"+a+" на "+b+" и "+x+" на "+y);

    }
}