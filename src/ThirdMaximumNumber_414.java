
public class ThirdMaximumNumber_414 {
	public int thirdMax(int[] nums) {
        int count=0;
		int[] buf=new int[3];
		boolean isMinValueApp=false;;
		for(int i=0;i<3;i++)
			buf[i]=Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==buf[0]||nums[i]==buf[1]||nums[i]==buf[2]){
				if(nums[i]==Integer.MIN_VALUE&&!isMinValueApp){
					count++;
					isMinValueApp=true;
				}
				continue;
			}
			if(nums[i]>buf[0]||nums[i]>buf[1]||nums[i]>buf[2]){
				if(buf[0]>buf[1]){
					if(buf[2]<buf[1]){
						buf[2]=nums[i];
						count++;
						continue;
					}
					buf[1]=nums[i];
					count++;
				}
				else{
					if(buf[2]<buf[0]){
						buf[2]=nums[i];
						count++;
						continue;
					}
					buf[0]=nums[i];
					count++;
				}
			}
		}
		if(count>2){
			return buf[0]>buf[1]?buf[2]<buf[0]?buf[2]:buf[1]:buf[2]<buf[0]?buf[2]:buf[0];
		}
		else
			return Math.max(buf[0], buf[1]);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
