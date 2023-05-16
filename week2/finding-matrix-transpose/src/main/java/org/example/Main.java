package org.example;

public class Main {
    public static void main(String[] args) {
        int[][] list = {{1, 2, 3}, {4, 5, 6}};
        int[][] listTranpose;

        printMatrix(list);
        listTranpose = matrixTranpose(list);
        System.out.println("--------------");
        printMatrix(listTranpose);
    }

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "     ");
            }
            System.out.println();
        }
    }

    static int[][] matrixTranpose(int[][] arr) {
        int[][] tempArr = new int[arr[0].length][arr.length];

        for (int i = 0; i < tempArr.length; i++) {
            for (int j = 0; j < tempArr[i].length; j++) {
                tempArr[i][j] = arr[j][i];
            }
        }
        return tempArr;

    }
}