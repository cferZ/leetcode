package array;
import java.util.concurrent.LinkedBlockingQueue;

public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	if(n<1)
    		return;
        LinkedBlockingQueue<Integer> que=new LinkedBlockingQueue<>();
        for(int i=m;i<m+n;i++){
        	nums1[i]=Integer.MAX_VALUE;
        }
        for(int i=0,nIndex=0;i<m+n;i++){
        	if(nIndex<n&&(nums1[i]<nums2[nIndex]||(!que.isEmpty()&&que.element()<nums2[nIndex]))||nIndex>=n){
        		if(!que.isEmpty()){
        			que.add(nums1[i]);
        			nums1[i]=que.poll();
        		}
        		
        	}
        	else{
        		
        		que.add(nums1[i]);
        		nums1[i]=nums2[nIndex];
        		nIndex++;
        	
        	}
        }
    
    }
    public static void main(String[] args){
    	int[] nums1={4,5,6,0,0,0};
    	int[] nums2={1,2,3};
    	int m=3,n=3;
    	MergeSortedArray_88 t=new MergeSortedArray_88();
    	t.merge(nums1, m, nums2, n);
    	for(int i=0;i<m+n;i++){
    		System.out.println(nums1[i]);
    	}
    }
}
