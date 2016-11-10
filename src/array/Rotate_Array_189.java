package array;
public class Rotate_Array_189 {
	public void rotate(int[] nums, int k) {
	      int inHand=0;
	        int tmp=0;
	        k=k%nums.length;
	        if(k==0)
	        	return;
	        int part=nums.length%k;
	        if(part==0)
	        	part=k;
	        boolean isLoop=false;
	        for(int i=0;i<part;i++){
	        	isLoop=false;
	        	inHand=nums[i];
	        	for(int index=i;!isLoop;){
	        		tmp=nums[(index+k)%nums.length];
	        		nums[(index+k)%nums.length]=inHand;
	        		inHand=tmp;
	        		index=(index+k)%nums.length;
	        		if(index==i)
	        			isLoop=true;
	        	}
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,3,4,5,6,7,28,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27};
		Rotate_Array_189 t=new Rotate_Array_189();
		t.rotate(nums, 2);
		for(int i=0;i<nums.length;i++)
			System.out.println(nums[i]);
		
	}

}
