package array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SubsetsII_90 {
	public SubsetsII_90() {
		// TODO Auto-generated constructor stub
	}
	static List<List<Integer>> sresult=null;
	public List<List<Integer>> subsetsWithDup2(int[] nums) {
		sresult=new ArrayList<>();
		sresult.add(new ArrayList<>());
		Arrays.sort(nums);
		getSubSet(nums,0,new ArrayList<>());
		return sresult;
	}
	public void getSubSet(int[] nums,int index,List<Integer> t){
		for(int i=0;i+index<nums.length;i++){
			List<Integer> tt=new ArrayList<>(t);
			tt.add(nums[i+index]);
			sresult.add(new ArrayList<>(tt));
			getSubSet(nums, index+i+1, tt);
			tt.remove(tt.size()-1);
			while(i+index<nums.length-1&&nums[i+index]==nums[i+index+1])
				i++;
		}
	}
	
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        boolean[] sets=new boolean[nums.length+1];
        List<List<Integer>> result=new ArrayList<>();
        HashSet<List<Integer>> hset=new HashSet<>();
        List<Integer> subset=null;
        List<Integer> subset1=null;
        Arrays.sort(nums);
        for(int i=0;i<nums.length+1;i++){
        	sets[i]=false;
        }
        hset.add(new ArrayList<>());
        for(int j=0;j<Math.pow(2, nums.length-1);j++){
        	int i;
        	subset=new ArrayList<>();
        	subset1=new ArrayList<>();
        	for(i=0;i<nums.length;i++){
        		if(sets[i]){
        			subset.add(nums[i]);
        		}
        		else{
        			subset1.add(nums[i]);
        		}
        	}
        	hset.add(subset);
        	hset.add(subset1);
        	for(i=0;sets[i];i++){
        		sets[i]=false;
        	}
        	sets[i]=true;
        }
        result.addAll(hset);
        return result;
        
    }

}
