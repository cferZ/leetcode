import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementII_229 {
    public List<Integer> majorityElement(int[] nums) {
    	if(nums.length<1){
    		return new ArrayList<>();
    	}
        Arrays.sort(nums);
        List<Integer> result=new ArrayList<>();
        int range=nums.length-nums.length/3;
        int lastCandi=nums[0]-1;
        for(int i=0;i<range;i++){
        	if(nums[i]==nums[i+nums.length/3]&&lastCandi!=nums[i]){
        		result.add(nums[i]);
        		lastCandi=nums[i];
        	}
        }
        return result;
        
    }
}
