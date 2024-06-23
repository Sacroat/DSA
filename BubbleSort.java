public class BubbleSort {

    /*
     * Bubble Sort is an algorithm that sorts an array from the lowest value to the highest value.
     * The word 'Bubble' comes from how this algorithm works, it makes the highest values 'bubble up'.
     * 
     * How it works:
     * 
     * Go through the array, one value at a time.
     * For each value, compare the value with the next value.
     * If the value is higher than the next one, swap the values so that the highest value comes last.
     * Now in the next iteration no need to check the last value because it is maximum value in the array(size-i-1).
     * Go through the array as many times as there are values in the array.
     * Use one counter variable to check if there no values to swap then directly exit the loop.
     * 
     * Time Complexity = O(N^2)
     */

    public static void main(String[] args) {
        int[] list = {1,2,3,5,6,4};
        int size = list.length;
        int temp = 0;
        int steps = 0;

        System.out.println("Array before sorting ");
        for(int number : list){
            System.out.print(number +" ");
        }

        for(int i=0; i<size;i++){
            int count = 0;
            steps++;
            for(int j = 0; j<size-i-1;j++){
                if(list[j]>list[j+1]){
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    count = 1;
                }
            }
            if (count == 0) {
                break;                   
            }
        }
        System.out.println();
        System.out.println("Array after sorting ");
        for(int number : list){
            System.out.print(number +" ");
        }
        System.out.println();
        System.out.println("Total steps taken to complete >> "+steps);
    }
    
}
