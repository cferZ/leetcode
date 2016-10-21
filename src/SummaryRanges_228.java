import java.util.ArrayList;
import java.util.List;

public class SummaryRanges_228 {

    public List<String> summaryRanges(int[] nums) {
    	List<String> result=new ArrayList<>();
    	if(nums.length<1){
    		return result;
    	}
    	if(nums.length==1){
    		result.add(""+nums[0]);
    		return result;
    	}
        int begin=nums[0];
    	for(int i=1;i<nums.length;i++){
        	if(nums[i]==nums[i-1]+1){
        		continue;
        	}
        	else{
        		if(begin==nums[i-1]){
        			result.add(""+begin);
        		}
        		else{
        			result.add(begin+"->"+nums[i-1]);
        		}
        		begin=nums[i];        		
        	}
        }
    	if(nums[nums.length-1]==begin){
    		result.add(""+begin);
    	}
    	else{
    		result.add(begin+"->"+nums[nums.length-1]);
    	}
    	return result;
    }

}
