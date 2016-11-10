package array;
public class MaximumProductSubarray_152 {

    public int maxProduct(int[] nums) {
        int from=0;
        int max=Integer.MIN_VALUE;
        int product=1;
        
        int negtiveNum=0;
        for(int i:nums){
        	if(i<0){
        		negtiveNum++;
        	}
        }
        int tmp=negtiveNum;
        for(int i=0;i<nums.length;i++){
        	product*=nums[i];
        	if(nums[i]<0){
        		tmp--;
        	}
        	if(product>max){
        		max=product;
        		if(nums[i]==0){
            		product=1;
            	}
        		continue;
        	}
        	else if(nums[i]==0){
        		product=1;
        	}
        	else if(tmp==0&&product<0){
        		
        		product=1;
        	}
        }
        product=1;
        tmp=negtiveNum;
        for(int i=nums.length-1;i>=0;i--){
        	product*=nums[i];
        	if(nums[i]<0){
        		tmp--;
        	}
        	if(product>max){
        		max=product;
        		if(nums[i]==0){
            		product=1;
            	}
        		continue;
        	}
        	else if(nums[i]==0){
        		product=1;
        	}
        	else if(tmp==0&&product<0){
        		System.out.println("c i tmp "+i+" "+ tmp);
        		product=1;
        	}
        }
        return max;
    }
    public static void main(String[] args){
    	int[] nums={1,2,-1,-2,2,1,-2,1,4,-5,4};
    	MaximumProductSubarray_152 t= new MaximumProductSubarray_152();
    	System.out.println("max"+t.maxProduct(nums));
    }

}
