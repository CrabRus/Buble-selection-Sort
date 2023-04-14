public class BubbleSort {
    public static void main(String[] args){
        int[] arr1 = {1,5,12,9,7};
        String[] arr2 = {"a","avvva","df", "Fdsfdsdf"};
        float[] arr3 = {1.2f, 12.2f,3.4f,7.111f};
        char[] arr4 ={'t','d', 45, 'a', ','};

        int[] result1 = bubbleSort(arr1);
        String[] result2 = bubbleSort(arr2);
        float[] result3 = bubbleSort(arr3);
        char[] result4 = bubbleSort(arr4);

        outputResult(result1);
        outputResult(result2);
        outputResult(result3);
        outputResult(result4);

    }

    static String[] bubbleSort(String[] arr){
        int size = arr.length;
        for(int step = 0; step < size - 1; step++) {
            for (int i = 0; i < size - step - 1; i++) {
                if (arr[i].length() > arr[i + 1].length()) {
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    static int [] bubbleSort(int[] arr){
        int size = arr.length;
        for(int step = 0; step < size - 1; step++) {
            for (int i = 0; i < size - step - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    static float [] bubbleSort(float[] arr){
        int size = arr.length;
        for(int step = 0; step < size - 1; step++) {
            for (int i = 0; i < size - step - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    float temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    static char [] bubbleSort(char[] arr){
        int size = arr.length;
        for(int step = 0; step < size - 1; step++) {
            for (int i = 0; i < size - step - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }





    // function for displaying a message about the result
    static void outputResult(float[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("<------------------------------------->");
    }
    static void outputResult(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("<------------------------------------->");
    }
    static void outputResult(String[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("<------------------------------------->");
    }
    static void outputResult(char[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("<------------------------------------->");
    }
}

