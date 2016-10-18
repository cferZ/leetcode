import java.util.HashMap;

public class Contains_Duplicate_219 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
	    if(nums.length<2)
	    	return false;
	    boolean result=false;
		HashMap<Integer, Integer> map= new HashMap<>();
	    Integer before=0;
		for(int i=0;i<nums.length;i++){
	    	if((before=map.get(nums[i]))!=null){
	    		if((i-before)<=k)
	    			return true;
	    		map.replace(nums[i], i); 
	    	}
	    	else{
	    		map.put(nums[i], i);
	    	}
	    }
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,1,4,1};
		Contains_Duplicate_219 t=new Contains_Duplicate_219();
		System.out.println(t.containsNearbyDuplicate(nums,2));
	}

}
