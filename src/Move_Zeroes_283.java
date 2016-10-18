import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 认真读题
 * 提交时 import 要加上
 * @author Administrator
 *
 */
public class Move_Zeroes_283 {
	public void moveZeroes(int[] nums) {
		int len=nums.length;
		if(len<1)
			return;
		LinkedBlockingQueue<Integer> loc =new LinkedBlockingQueue<>();
		
		try{
	        for(int i=0;i<len;i++){
	        	if(nums[i]==0){
	        		loc.put(i);
	        	}
	        	else{
	        		if(!loc.isEmpty()){
	        			nums[loc.take()]=nums[i];
	        			nums[i]=0;
	        			loc.put(i);
	        		}
	        	}
	        }
		}catch(InterruptedException e){
		}
    }
	
	public static void main(String[] args){
		int[] nums={0, 1, 0, 3, 12};
		Move_Zeroes_283 t=new Move_Zeroes_283();
		t.moveZeroes(nums);
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}
}
