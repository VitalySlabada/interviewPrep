package DSA.P8_MaximumSubarraySum;

public class MaxSub {

    public static int maxSubSum(int [] arr){

        int rightMax = Integer.MIN_VALUE;
        int leftMax = arr[0];
        int rInd=0;
        int lInd = arr.length-1;

        int sum = 0;
        for (int i =0; i<arr.length; i++){
            sum = sum + arr[i];
            if ( sum > rightMax) {
                rightMax = sum;
                rInd = i;
            }
        }
        sum = 0;
        for (int i =arr.length-1; i>=0; i--){
            sum = sum + arr[i];
            if ( sum > leftMax) {
                leftMax = sum;
                lInd = i;
            }
        }

        int result = 0;
        if (rInd>lInd) {

            for (int i = lInd; i<=rInd; i++){
                result= result + arr[i];
            }
        } else return Math.max(arr[lInd],arr[rInd]);

        return result;
    }
}
