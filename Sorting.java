public class Sorting{
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            boolean swapped = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void selectionSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            int minIdx = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[minIdx]>arr[j]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void InsertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
        public static void main(String[] args) {
        int a[] = {3,2,6,21,11,7,5};
        // selectionSort(a);
        InsertionSort(a);
        for(int i =0; i<a.length; i++){
             System.out.print(a[i]+" ");
        }
    }
}