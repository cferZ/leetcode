package array;

import java.util.Arrays;

public class _3SumClosest_16 {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int offset=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
        	int res=twoSumClosest(nums, target-nums[i], i+1);
        	offset=Math.abs(offset)>Math.abs(res)?res:offset;
        }
        return target+offset;
    }
    public int twoSumClosest(int[] nums,int target,int index){
    	int offset=Integer.MAX_VALUE;
    	for(int i=index,j=nums.length-1;i<j;){
    		int com=nums[i]+nums[j]-target;
    		offset=Math.abs(offset)>Math.abs(com)?com:offset;
    		if(com>0){
    			j--;
    		}
    		else if(com<0){
    			i++;
    		}
    		else return 0;
    	}
    	return offset;
    }

}
