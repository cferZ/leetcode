package array;

import java.util.Arrays;

public class NextPermutation_31 {

    public void nextPermutation(int[] nums) {
        for(int i=nums.length-1;i>0;i--){
        	for(int j=i-1;j>=0;j--){
        		if(nums[j]<nums[i]){
        			int t=nums[j];
        			nums[j]=nums[i];
        			nums[i]=t;
        			Arrays.sort(nums, j+1, nums.length);
        			return;
        		}
        	}
        }
        Arrays.sort(nums);
    }

}
