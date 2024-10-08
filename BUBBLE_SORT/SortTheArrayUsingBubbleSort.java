package BUBBLE_SORT;

public class SortTheArrayUsingBubbleSort {

    static void bubbleSort(int [] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1;i++){
            for(int j = 0  ; j < n-i-1;j++){
                /*
                Last i element are already at correct sorte position , so no need to check them
                 */

                if(arr[j] > arr[j+1]){
                    // swap arr[j] --> arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,7,3,74,2,0};
        bubbleSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }

    }
}
