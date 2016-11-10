package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllDuplicatesinanArray_442 {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
    	for(int i=0;i<nums.length;i++){
        	if(!set.add(nums[i])){
        		result.add(nums[i]);
        	}        		
        }

        return result;
    }
    
    public List<Integer> betterfindDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                res.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        return res;
    }

}
