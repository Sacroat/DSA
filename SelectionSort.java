public class SelectionSort {

    /*
     * The Selection Sort algorithm finds the lowest value in an array and moves it to the front of the array.
     * or 
     * The Selection Sort algorithm finds the higest value in an array and moves it to the end of the array.
     * 
     * How it works
     * Go through the array to find the lowest value.
     * Move the lowest value to the front of the unsorted part of the array.
     * Go through the array again as many times as there are values in the array.
     * 
     * Time Complexity = O (N^2)
     */

    public static void main(String[] args) {
        int[] list = {2,3,9,8,7,6,5};
        int size = list.length;
        int temp = 0;
        int minIndex = 0;
        int maxIndex = 0;

        System.out.println("List before sorting");
        for(int num : list){
            System.out.print(num + " ");
        }

        // Moving lowest value to the front of the array
        for(int i=0; i<size-1; i++){
            minIndex = i;
            for(int j=i+1; j<size; j++){
                if(list[j]<list[minIndex])
                    minIndex = j;
            }
            temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }

        // Moving highest value to the end of the array
        for(int i=size-1 ; i>=0; --i){
           maxIndex = i;
           for(int j=i-1; j>=0 ; --j){
                if(list[j]>list[maxIndex])
                    maxIndex = j;
           }
           temp = list[i];
           list[i] = list[maxIndex];
           list[maxIndex] = temp;
        }
        System.out.println();
        System.out.println("List after sorting");
        for(int num : list){
            System.out.print(num + " ");
        }
    }
    
}
