package DSA.Bind75.p7_BinarySearch_sortedArray;

public class BinarySearch {

    public int search(int[] nums, int target) {
        //find mid
        int mid;
        int beg = 0;
        int end = nums.length-1;


        while (beg<=end){
            mid = (beg+end+1)/2;

            if(nums[mid]==target) return mid;

            else if (target<nums[mid]) end = mid-1;

            else beg = mid+1;
        }



        return -1;
    }

}
