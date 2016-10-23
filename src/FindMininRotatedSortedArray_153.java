
public class FindMininRotatedSortedArray_153 {
    public int findMin(int[] nums) {
    	int low=0,high=nums.length-1;
    	int mid=(low+high)/2+1;
    	while(low<high){
    		if(nums[low]<nums[mid]){
    			if(nums[low]<nums[high]){
    				return nums[low];
    			}
    			low=mid+1;
    		}else{
    			high=mid;
    			low++;
    		}
    		mid=(low+high)/2+1;
    	}
    	return Math.min(nums[low], nums[high]);
    }
}
