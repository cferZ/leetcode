package array;

import java.util.Arrays;

public class NextPermutation_31 {

	public void nextPermutation(int[] nums) {
        for(int i=nums.length-1;i>0;i--){
        	if(nums[i-1]<nums[i]){
        		for(int j=nums.length-1;j>=i;j--){
        			if(nums[j]>nums[i-1]){
        				int t=nums[j];
        				nums[j]=nums[i-1];
        				nums[i-1]=t;
        				Arrays.sort(nums, i, nums.length);
        				return;
        			}
        		}
        	}
        	
        }
        Arrays.sort(nums);
    }

}
