package array;
public class SearchinRotatedSortedArray_33 {
    public int search(int[] nums, int target) {
        return searchTarget(nums,0,nums.length-1,target);
    }
    public int searchTarget(int[] nums,int left,int right,int target){
    	if(left>=right&&nums[left]!=target){
    		return -1;
    	}
    	int mid=(left+right)/2;
    	if(nums[mid]==target){
    		return mid;
    	}
    	if(target>nums[mid]){
    		if(target==nums[left])
    			return left;
    		if(target<nums[left]){
    			return searchTarget(nums,mid+1,right,target);
    		}
    		else{
    			if(nums[mid]>=nums[left]){
    				return searchTarget(nums,mid+1,right,target);
    			}
    			else{
    				return searchTarget(nums,left,mid-1,target);
    			}
    		}
    	}
    	else{
    		if(target>=nums[left]){
    			return searchTarget(nums,left,mid-1,target);
    		}
    		else{
    			if(nums[mid]<nums[left]){
    				return searchTarget(nums,left,mid-1,target);
    			}
    			else{
    				return searchTarget(nums,mid+1,right,target);
    			}
    		}
    	}
    }
}
