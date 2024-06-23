public class BinarySearch {

    /*
     * Binary Search Algorithm is a searching algorithm used in a sorted array by repeatedly dividing the search interval in half. 
     * The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(log N). 
     * 
     * Time Complexity of BinarySearch = O(log N). where N is number of elements in array.
     */

    public static void main(String[] args) {
        int []list = {2,4,5,6,8,9,10,12};
        int targetValue = 10;
        int result = binarySearch(list, targetValue);
        int recursiveResult = binarySearch(list, targetValue, 0, list.length-1, 0);
        if(result != -1)
            System.out.println("Element found at index : "+result);
        else
            System.out.println("Element not found");
    }

    private static int binarySearch(int[] nums, int target){
        
        int first = 0;
        int last = nums.length-1;
        int stepsCount = 0;
        while(first<=last){
            int mid = (first+last)/2;
            stepsCount++;
            if(nums[mid] == target){
                System.out.println("Number steps to find vlaue : "+stepsCount);
                return mid;
            }
            else if(nums[mid]<target)
                first = mid + 1;
            else
                last = mid - 1;
        }
        System.out.println("Number steps to find vlaue : "+stepsCount);
        return -1;
    }

    private static int binarySearch(int[] nums, int targetValue, int first, int last, int stepsCount) {
        stepsCount++;
        if(first<=last){
            int mid = (first+last)/2;
            if(nums[mid] == targetValue){
                System.out.println("Number steps to find vlaue : "+stepsCount);
                return mid;
            }
            else if(nums[mid]<targetValue)
                return binarySearch(nums, targetValue, mid+1, last, stepsCount);
            else
                return binarySearch(nums, targetValue, first, mid-1, stepsCount);
        }
        System.out.println("Number steps to find vlaue : "+stepsCount);
        return -1;
    }
}
