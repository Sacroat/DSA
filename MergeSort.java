public class MergeSort{

    private static void mergeSort(int[] arr, int left, int right){
        if(left<right){
            int mid = (left+right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid-left+1;
        int n2 = right - mid;
        int[] larr = new int[n1];
        int[] rarr = new int[n2];

        for(int x = 0; x<n1 ; x++){
            larr[x] = arr[x+left];
        }
        for(int x = 0; x < n2; x++){
            rarr[x] = arr[mid+x+1];
        }

        int i = 0;
        int j = 0;
        int k = left;
        while(i<n1 && j<n2){
            if(larr[i]<=rarr[j]) {
                arr[k] = larr[i];
                i++;
            }
            else{
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = larr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rarr[j];
            j++;
            k++;
        }
    
    }

       public static void main(String[] args) {
        int[] list = {5,3,4,6,8,9};
        mergeSort(list, 0, list.length-1);

        for(int num : list){
            System.out.print(num +" ");
        }
    }
}