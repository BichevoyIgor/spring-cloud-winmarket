package com.flamexander.cloud.client.feign.controller;

public class HomeWork7TestInSpring {

    /*
     * Метод возвращает новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки.
     * Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
     */
    public int[] ar(int[] array) {
        int sizeNewArray = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 4) {
                sizeNewArray++;
            } else break;
        }

        if (sizeNewArray == array.length) throw new RuntimeException();
        int[] newArray = new int[sizeNewArray];

        for (int i = array.length - sizeNewArray, j = 0; i < array.length; i++, j++) {
            newArray[j] = array[i];
        }

        return newArray;
    }

    /*
     * Метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы, то метод вернет false.
     */
    public boolean task2(int... array) {
        for (int i : array) {
            if (i == 4 || i == 1) return true;
        }
        return false;
    }

}
