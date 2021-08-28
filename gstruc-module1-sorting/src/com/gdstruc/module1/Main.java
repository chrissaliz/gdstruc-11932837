package com.gdstruc.module1;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0]=1;
        numbers[1]=33;
        numbers[2]=11;
        numbers[3]=9;
        numbers[4]=7;
        numbers[5]=3;
        numbers[6]=53;
        numbers[7]=2;
        numbers[8]=121;
        numbers[9]=79;

        System.out.println("Before Selection Sort:");
        printArrayElements(numbers);

        bubbleSort(numbers);

        System.out.println("\n\n #1 After Bubble Sort:");
        printArrayElements(numbers);

        selectionSort(numbers);

        System.out.println("\n\n #1 After Selection Sort:");
        printArrayElements(numbers);

        selectionSort2(numbers);

        System.out.println("\n\n #2 After Selection Sort:");
        printArrayElements(numbers);

    }

    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length-1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex = 0;

            for(int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[largestIndex])
                {
                        largestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }

    }

    private static void selectionSort2(int[] arr)
    {
        for (int lastSortedIndex = arr.length-1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;

            for (int i = 0; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}
