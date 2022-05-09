package DSA.Bind75.p1_twosum;

import java.util.HashMap;
public class Twosum {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int sum = 7;
        twoSum(arr, sum);
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] result = new int[]{0, 0};

        for (int i = 0; i < nums.length; i++) {
            //check if already has the value
            int curr = nums[i];
            if (hash.containsKey(target - curr)) {
                result[0] = i;
                result[1] = hash.get(target - curr);
                break;
            }
            hash.put(curr, i);


        }
        return result;

    }
}


