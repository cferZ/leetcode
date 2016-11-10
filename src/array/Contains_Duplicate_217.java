package array;
import java.util.HashSet;

public class Contains_Duplicate_217 {
	public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
        	if(!set.add(nums[i])){
        		return true;
        	}
        }
		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={};
		Contains_Duplicate_217 t=new Contains_Duplicate_217();
		System.out.println(t.containsDuplicate(nums));
	}

}
