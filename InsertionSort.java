public class InsertionSort {
    /*
     * The Insertion Sort algorithm uses one part of the array to hold the sorted values
     * and the other part of the array to hold values that are not sorted yet.
     * The algorithm takes one value at a time from the unsorted part of the array 
     * and puts it into the right place in the sorted part of the array, until the array is sorted.
     * 
     * How it works
     * 
     * Take the first value from the unsorted part of the array.
     * Move the value into the correct place in the sorted part of the array.
     * Go through the unsorted part of the array again as many times as there are values.
     * 
     * Time Complexity : O(N^2)
     */


    public static void main(String[] args) {
        int[] array = {5,3,4,2,1,7};
        
        System.out.println("Array before sorting");
        for(int num : array){
            System.out.print(num+" ");
        }


        for(int i=1; i<array.length; i++){
            int key = array[i];
            int j = i-1;
            while (j>=0 && array[j]>key) {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
        System.out.println();
        System.out.println("Array after sorting");
        for(int num : array){
            System.out.print(num+" ");
        }
    }
}