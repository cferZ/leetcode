package array;
import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII_216 {
	static List<List<Integer>> finalResult;
    public List<List<Integer>> combinationSum3(int k, int n) {
    	
    	finalResult=new ArrayList<>();
    	ArrayList<Integer> result=new ArrayList<>();
    	
    	getArrayResult(0, n, k, result);
    			
    	return finalResult;
    }
    public boolean getArrayResult(int lastElement,int remain,int k,List<Integer> result){
    		if(k>1){
    			for(int i=lastElement+1;i<9;i++){
    				
    				System.out.println(k+" add "+i );
    				
    				if(i*k+k-1>remain){
    					return false;
    				}
    				result.add(i);
    				getArrayResult(i,remain-i,k-1,result);
    				result.remove(result.size()-1);
    			}
    			return true;
    		}
    		else{
    			if(remain>lastElement&&remain<=9){
    				System.out.println("final add"+remain);
    				result.add(remain);
    				for(int i:result){
    					System.out.println(i);
    				}
    				
    				finalResult.add(new ArrayList(result));
    				result.remove(result.size()-1);
    			}
    			return true;
    		}
    	
    }
    public static void main(String[] args){
    	CombinationSumIII_216 t=new CombinationSumIII_216();
    	List<List<Integer>> tt=t.combinationSum3(3, 9);
    	for(List<Integer> i:tt){
    		for(int j:i){
    			System.out.print(j+" ");
    		}
    		System.out.println();
    	}
    }
}
