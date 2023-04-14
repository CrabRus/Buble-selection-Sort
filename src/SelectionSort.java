
public class SelectionSort {
    public static void main(String[] args){
        int[] arr1 = {1,3,5,73,23,678,2};
        int[] result1 = selectionSort(arr1);
        String[] arr2 = {"d","dsd","dsasdasasd","u","hi"};
        String[] result2 = selectionSort(arr2);
        float[] arr3 = {2.3f, 45, 5.4f};
        float[] result3 = selectionSort(arr3);
        char[] arr4 = {'2','f', 'd',56};
        char[] result4 = selectionSort(arr4);

        outputResult(result1);
        outputResult(result2);
        outputResult(result3);
        outputResult(result4);


    }

    //selection sorting algorithm
    static int[] selectionSort(int[] arr){
        int size = arr.length;
        for(int step = 0; step < size - 1; step++) {
            int min_idx = step;
            for (int i = step+1; i < size; i++) {
                if (arr[i] < arr[min_idx]) {
                    min_idx = i;}
            }
            int temp = arr[step];
            arr[step] = arr[min_idx];
            arr[min_idx] = temp;
        }
        return arr;}

    static String[] selectionSort(String[] arr){
        int size = arr.length;
        for(int step = 0; step < size - 1; step++) {
            int min_idx = step;
            for (int i = step+1; i < size; i++) {
                if (arr[i].length() < arr[min_idx].length()) {
                    min_idx = i;}
            }
            String temp = arr[step];
            arr[step] = arr[min_idx];
            arr[min_idx] = temp;
        }
        return arr;}

    static float[] selectionSort(float[] arr){
        int size = arr.length;
        for(int step = 0; step < size - 1; step++) {
            int min_idx = step;
            for (int i = step+1; i < size; i++) {
                if (arr[i] < arr[min_idx]) {
                    min_idx = i;}
            }
            float temp = arr[step];
            arr[step] = arr[min_idx];
            arr[min_idx] = temp;
        }
        return arr;}

    static char[] selectionSort(char[] arr){
        int size = arr.length;
        for(int step = 0; step < size - 1; step++) {
            int min_idx = step;
            for (int i = step+1; i < size; i++) {
                if (arr[i] < arr[min_idx]) {
                    min_idx = i;}
            }
            char temp = arr[step];
            arr[step] = arr[min_idx];
            arr[min_idx] = temp;
        }
        return arr;}



    // function for displaying a message about the result
        static void outputResult(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("<------------------------------------->");
        }

        static void outputResult(String[] arr) {
            for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
            System.out.println("<------------------------------------->");
    }
        static void outputResult(float[] arr) {
            for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("<------------------------------------->");
    }

        static void outputResult(char[] arr) {
            for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("<------------------------------------->");
    }
    }
