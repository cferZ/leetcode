package array;
public class RemoveDuplicatesfromSortedArrayII_80 {

    public int removeDuplicates(int[] nums) {
    	int index=0;
    	boolean isApp=false;
        for(int i=1;i<nums.length;i++){
        	if(nums[i]!=nums[index]&&isApp){
        		isApp=false;
        	}
        	if(nums[i]==nums[index]&&isApp){
        		continue;
        	}
        	else{
        		if(nums[i]==nums[index])
        			isApp=true;
        		nums[++index]=nums[i];
        	}
        }
        return index+1;
    }

}
