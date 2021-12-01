package sort;

public class Bubble {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
                for (int k = 0 ; k < arr.length; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,4,5,1,3};
        bubbleSort(arr);

//        for (int i = 0 ; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
    }
}