
public class ProductofArrayExceptSelf_238 {

    public int[] productExceptSelf(int[] nums) {
    	int[] product_pre=new int[nums.length];
    	int[] product_pro=new int[nums.length];
        int product=1;

    	for(int i=0;i<nums.length;i++){
System.out.println(product);
    		int tem=nums[i];
        	product_pre[i]=product;
        	product*=tem;
        }
    	product=1;
    	for(int i=0;i<nums.length;i++){
    		System.out.println(product);
    		int tem=nums[nums.length-1-i];
        	product_pro[nums.length-1-i]=product;
        	product*=tem;
        }
    	for(int i=0;i<nums.length;i++){
    		product_pre[i]=product_pre[i]*product_pro[i];
    	}
 
    	return product_pre;
    }
    public static void main(String[] args){
    	int[] nums={1,2,3,4};
    	ProductofArrayExceptSelf_238 t=new ProductofArrayExceptSelf_238();
    	int[] result=t.productExceptSelf(nums);
    	for(int i:result){
    		System.out.println(i);
    	}
    }

}
