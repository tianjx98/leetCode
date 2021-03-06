package T51_100;

class _53_maxSubArray {
    /**
     * https://leetcode-cn.com/problems/maximum-subarray/
     * <p>
     * sum=0
     * 将数组的每个元素依次累加到sum上
     * 如果sum>max,max=sum
     * 若干sum<0,max=0
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int sum = 0, max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max) max = sum;
            if (sum < 0) sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //int[] arr={-2,-1};
        _53_maxSubArray maxSubArray = new _53_maxSubArray();
        int sum = maxSubArray.maxSubArray(arr);
        int i = maxSubArray.maxSubArray(arr);
        System.out.println(sum);
        System.out.println(i);
    }
}