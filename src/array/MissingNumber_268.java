package array;
public class MissingNumber_268 {
    public int missingNumber(int[] nums) {
        int count=0;
        int length=nums.length;
        int sum=length*(length+1)/2;
        for(int i:nums){
        	count+=i;
        }
        return (sum-count);
    }
}
