package arrays.arrays;

public class Running_Sum_of_1d_Array {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <=i; j++) {
                sum[i] = sum[i]+nums[j];

            }
        }
        return sum;
    }
}
