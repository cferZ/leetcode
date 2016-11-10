package array;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray_448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
    	List<Integer> result=new ArrayList<>();
    	for(int i=1;i<=nums.length;i++){
    		result.add(i);
    	}
        for(int i=0;i<nums.length;i++){
        	result.remove(new Integer(nums[i]));
        }
        return result;
    }

}
