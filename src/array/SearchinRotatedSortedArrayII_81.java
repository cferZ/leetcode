package array;
public class SearchinRotatedSortedArrayII_81 {
    public boolean search(int[] nums, int target) {
        return searchTarget(nums,0,nums.length-1,target);
    }
    public boolean searchTarget(int[] nums,int left,int right,int target){
    	for(int i=left;i<=right;i++){
    		if(nums[i]==target){
    			return true;
    		}
    	}
    	return false;
    }
}
