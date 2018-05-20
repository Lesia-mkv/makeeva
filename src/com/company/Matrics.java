package com.company;

import java.util.Arrays;

/**
 * Created by student on 20-May-18.
 */
public class Matrics {
    private double[][] array;
    private int row, column;

    public Matrics(double[][] array, int column, int row) {
        this.array = array;
        this.column = column;
        this.row = row;
    }

    public Matrics(double[][] array) {
        this.array = array;
        this.column = array[0].length;
        this.row = array.length;
    }

    public Matrics summ(Matrics matrics) {
        if (matrics.row != this.row || matrics.column != this.column) {
            System.out.println("Размер матриц не совпадает");
            return null;
        }
        double[][] resultArray = new double[this.row][this.column];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                resultArray[i][j] = this.array[i][j] + matrics.array[i][j];
            }

        }
        return new Matrics(resultArray);
    }

    public Matrics mult(double num) {

        double[][] resultArray = new double[this.row][this.column];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                resultArray[i][j] = this.array[i][j] * num;
            }

        }
        return new Matrics(resultArray);
    }

    public void print() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                System.out.print(this.array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        double[][] array1 = {{1, 1, 1}, {2, 2, 2}};
        Matrics matrics1 = new Matrics(array1);
        Matrics matrics2 = new Matrics(new double[][]{{2, 2, 2}, {3, 3, 3}});
        Matrics matrics3 = matrics1.summ(matrics2);
        System.out.println(Arrays.deepToString(matrics3.array));

        Matrics matrics4 = matrics1.mult(3);
        System.out.println(Arrays.deepToString(matrics4.array));
        matrics4.print();
    }

}
