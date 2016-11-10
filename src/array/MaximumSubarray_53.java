package array;
public class MaximumSubarray_53 {
	public int maxSubArray(int[] nums) {
		int pre=nums[0];
		int max=pre;
		for(int i=1;i<nums.length;i++){
			pre=nums[i]+(pre>0?pre:0);
			max=Math.max(pre, max);
		}
		return max;
	}
}
