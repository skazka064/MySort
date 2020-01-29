package com.mypackage.sort;
import java.util.Arrays;
public class MySort {

    public static int[] MySort(int[] list) {
        for (int j = 0; j < list.length - 1; j++) {
            for (int i = 0; i < list.length - 1; i++) {

                if (list[i] > list[i + 1]) {
                    int var = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = var;

                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] list = {2, 5, 345, 6, 779, 4, 7, 67, 8, 9, 8, 98, 9, 8, 9, 0, 890, 89, 0, 90, 9, 9, 0, 0, 8, 90};
        int[] sortList = MySort(list);

        for (int i = 0; i < sortList.length; i++) {
            System.out.println(sortList[i]);
        }


    }
}

