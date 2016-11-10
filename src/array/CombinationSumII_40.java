package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSumII_40 {
	static Set<List<Integer>> result;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        result = new HashSet<>();
    	Arrays.sort(candidates);
        getCombinations(candidates, target, 0,new ArrayList<Integer>());
        return new ArrayList<>(result);
    }
    public void getCombinations(int[] candi,int target,int index,List<Integer> list){
    	List<Integer> t;
    	for(int i=index;i<candi.length;i++){
    		if(candi[i]>target){
    			return;
    		}
    		t=new ArrayList<>(list);
    		if(candi[i]==target){
    			t.add(candi[i]);
    			result.add(t);
    			return;
    		}
    		t.add(candi[i]);
    		getCombinations(candi, target-candi[i], i+1, t);
    		t.remove(t.size()-1);
    	}
    }
}
