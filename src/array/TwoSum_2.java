package array;
public class TwoSum_2 {
    public int[] twoSum(int[] nums, int target) {
    	int i,j = 0;
    	boolean isFind=false;
        for(i=0;i<nums.length-1;i++){
        	for(j=i+1;j<nums.length;j++){
        		if((nums[i]+nums[j])==target){
        			System.out.println(i+" "+j);
        			isFind=true;
        			break;
        		}
        	}
        	if(isFind){
        		break;
        	}
        }
        return new int[]{i,j};
    }
    public static void main(String[] args){
    	TwoSum_2 t=new TwoSum_2();
    	int[] nums={};
    	int target=6;
    	t.twoSum(nums, target);
    }
}
