package array;
public class SortColors_75 {

    public void sortColors(int[] nums) {
    	int t[]=new int[nums.length];
    	int index1=0,index2=0;
    	for(int i=0;i<nums.length;i++){
    		switch(nums[i]){
    		case 0:index1++;break;
    		case 2:index2++;
    		}
    	}
    	for(int i=0;i<nums.length;i++){
    		if(index1-->0){
    			nums[i]=0;
    		}
    		else if(i+index2<nums.length){
    			nums[i]=1;
    		}
    		else 
    			nums[i]=2;
    	}
    	
    }

}
