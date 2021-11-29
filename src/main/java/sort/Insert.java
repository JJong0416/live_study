package sort;

public class Insert {
    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int key = arr[i]; // 키 값을 꺼내놨당.
            int j = i-1; // 비교 대상

            while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int []{7,4,5,1,3};

        insertSort(arr);
        
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
