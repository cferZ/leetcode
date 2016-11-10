package array;

public class SearchInsertPosition_35 {

    public int searchInsert(int[] nums, int target) {
        
    	return search(nums, 0, nums.length-1,target);
    }
    public int search(int[] nums,int left,int right,int target){
    	if(left>=right){
    		if(nums[left]<target)
    			return left+1;
    		return left;
    	}
    	int mid=(left+right)/2;
    	if(nums[mid]==target){
    		return mid;
    	}
    	if(nums[mid]>target){
    		return search(nums, left, mid-1, target);
    	}
    	else 
    		return search(nums, mid+1, right, target);
    }

}
