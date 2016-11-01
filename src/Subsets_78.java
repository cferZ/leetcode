import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {
	public static List<List<Integer>> result;
	public List<List<Integer>> subsets(int[] nums) {
        result=new ArrayList<>();
        result.add(new ArrayList<Integer>());
        getSubsets(nums,new ArrayList<Integer>(),0);
        
        return result;
    }
	public void getSubsets(int[] nums,List<Integer> set,int index){
		for(int i=index;i<nums.length;i++){
			List<Integer> t=set;
			t.add(nums[i]);
			result.add(new ArrayList<>(t));
			getSubsets(nums,t,i+1);
			t.remove(t.size()-1);
		}
	}
	public static void main(String[] args) {
		int[] nus={1,2,3};
		List<List<Integer>> t=new Subsets_78().subsets(nus);
		for(List<Integer>tt:t){
			for(int i:tt){
				System.out.println(i);
			}
		}
	}
}
