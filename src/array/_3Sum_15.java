package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class _3Sum_15 {

	static HashSet<List> result;
	public List<List<Integer>> threeSum(int[] nums) {
        result=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
        	twoSum(nums,nums[i],i+1);
        }
        return new ArrayList(result);
    }
	public void twoSum(int[] nums, int target,int index) {
    	int i,j = 0;
    	if(target>0)
    		return;
    	for(i=index,j=nums.length-1;i<j;){
    		int com=nums[i]+nums[j]+target;
    		if(com>0)
    			j--;
    		else if(com<0)
    			i++;
    		else{
    			result.add(Arrays.asList(target,nums[i],nums[j]));
    			i++;
    			j--;
    		}
    	}
    }
}
