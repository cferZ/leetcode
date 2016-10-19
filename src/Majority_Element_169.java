

import java.util.ArrayList;
import java.util.Arrays;

public class Majority_Element_169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
