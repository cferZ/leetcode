package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _4Sum_18 {
	static HashSet<ArrayList> result;
    public List<List<Integer>> fourSum(int[] nums, int target) {
        result=new HashSet<>();
        Arrays.sort(nums);
        if(nums.length>0)
        	getNext(nums, target, 0, 0, new ArrayList());
        return new ArrayList(result);
    }
    public void getNext(int[] nums,int target,int index,int count,ArrayList<Integer> set){
    	if(count>3){
    		if(target==0)
    			result.add(new ArrayList<>(set));
    		return;
    	}
    	if(nums[nums.length-1]*(4-count)<target){
    		return;
    	}
    	if(nums[index<nums.length?index:nums.length-1]*(4-count)>target){
    		return;
    	}
    	else
    		for(int i=index;i<nums.length;i++){
    			if(nums[i]<=target||nums[i]<0){
    				set.add(nums[i]);
    				getNext(nums, target-nums[i], i+1, count+1, set);
    				set.remove(set.size()-1);
    			}
    			else return;
    		}
    }
}
