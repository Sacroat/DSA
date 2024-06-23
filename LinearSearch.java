public class LinearSearch {

    /*
     * Linear Search is defined as a sequential search algorithm that starts at one end 
     * and goes through each element of a list until the desired element is found, 
     * otherwise the search continues till the end of the data set.
     * 
     * Time Complexity of Linear Search Algorithm is O(n) where n is number of elements in array.
     */

    public static void main(String[] args) {
        int nums[] = {2,3,4,5,6,7,9};
        int target = 5;
        int result = linearSearch(nums, target);
        if(result != -1)
            System.out.println("Target Element found at index : "+result);
        else
            System.out.println("Element Not Found");
    }

    public static int linearSearch(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
