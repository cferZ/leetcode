package leetcode;

public class FindPeakElement_162 {

    public int findPeakElement(int[] nums) {
        for(int i=1;i<nums.length-1;i++){
        	if(nums[i+1]<nums[i]){
        		if(nums[i-1]<nums[i]){
        			return i;
        		}
        		else
        			i++;
        	}
        }
        if(nums.length<2||nums[0]>nums[1]){
        	return 0;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
        	return nums.length-1;
        }
        return 0;
    }

}
