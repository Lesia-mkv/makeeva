package com.company;

import java.util.Arrays;

/**
 * Created by Student on 13.06.2018.
 */
public class MinMax<T extends Number> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MinMax<?> minMax = (MinMax<?>) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(array, minMax.array);

    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "MinMax{" +
                "array=" + Arrays.toString(array) +
                '}';
    }


    public T min() {
        T min = array[0];
        for (T value : array) {
            if (value.doubleValue() < min.doubleValue()) {
                min = value;
            }

        }
        return min;
    }

    public T max() {
        T max = array[0];
        for (T value : array) {
            if (value.doubleValue() > max.doubleValue()) {
                max = value;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        MinMax<Integer> ob1 = new MinMax<>(new Integer[]{3, 4, 9, 0, -1});
        System.out.println(ob1.min());
    }
}
