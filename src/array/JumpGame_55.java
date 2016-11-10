package array;
public class JumpGame_55 {

    public boolean canJump(int[] nums) {
    	int reachable=0;
    	for(int i=0;i<=Math.min(reachable, nums.length-1);i++){
    		reachable=Math.max(reachable, i+nums[i]);
    		if(reachable>=nums.length-1){
    			return true;
    		}
    	}
    	return false;
    }

}
