import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class MinimumSizeSubarraySum_209 {
    public int minSubArrayLen(int s, int[] nums) {
        int len=nums.length+1;
        int sum=0;
        int from=0;
        for(int i=0;i<nums.length;i++){
        	sum+=nums[i];
        	while(sum>=s){
//        		System.out.println(from+" "+i+" "+len);
        		len=len>i-from?i-from:len;
        		sum-=nums[from++];
        	}
        }
        return len==nums.length+1?0:len+1;
    }
    public static void main(String[] args){
    	int[] nums={5,1,3 ,5,10,7,4,9,2,8};
    	int s=15;
    	MinimumSizeSubarraySum_209 t=new MinimumSizeSubarraySum_209();
    	t.minSubArrayLen(s, nums);
    }
}
