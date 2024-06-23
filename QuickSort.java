public class QuickSort {

    public static void main(String[] args) {
        int[] list = {5,3,4,6,8,9};
        quickSort(list, 0, list.length-1);
        for(int num : list){
            System.out.print(num +" ");
        }
    }

    private static void quickSort(int[] list, int low, int high) {
            if(low<high){
                int pi = partition(list, low, high);
                quickSort(list, pi+1, high);
                quickSort(list, low, pi-1);
            }
        
    }

    private static int partition(int[] list, int low, int high) {
        int pivot = list[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(list[j]<pivot){
                i++;
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }
        int temp = list[i+1];
        list[i+1] = list[high];
        list[high] = temp;
        return i+1;
    }
    
}
