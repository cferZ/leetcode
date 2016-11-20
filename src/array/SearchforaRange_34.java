package array;

public class SearchforaRange_34 {

    public int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        int index=searchT(nums,0,nums.length-1,target);
        if(index<0)
        	return result;
        int i;
        for(i=index;nums[i]==target;){
        	i--;
        	if(i<0)break;
        }
        result[0]=++i;
        for(i=index;nums[i]==target;){
        	i++;
        	if(i>=nums.length)break;
        }
        result[1]=--i;
        return result;
    }
    public int searchT(int[] nums,int left,int right,int target){
    	if(left>right||left==-1)
    		return -1;
    	int mid=(left+right)/2;
    	if(nums[mid]==target){
    		return mid;
    	}
    	else if(nums[mid]<target){
    		left=mid+1;
    	}
    	else
    		right=mid-1;
    	return searchT(nums, left, right, target);
    }

}
