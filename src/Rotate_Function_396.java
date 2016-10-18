import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Rotate_Function_396 {
	/**
	 * 教训,获取最大值时初值应为最小
	 * 考虑输入为空
	 * 
	 * f(i)=f(i-1)+sum-i*A[N-i]
	 * @param A
	 * @return
	 */
	public  int maxRotateFunction(int[] A) {
		if(A.length<1)
			return 0;
		int sum = 0,result=Integer.MIN_VALUE,f=0,length=A.length;
		//calc sum, calc f(0)
		for(int i=0;i<length;i++){
			sum+=A[i];
			f+=i*A[i];
		}
		//
		for(int i=0;i<length;i++){
			if(f>result)
				result=f;
			f=f+sum-length*A[length-1-i];
		}
		return result;
    }
	public static void main(String[] args){
		int[] A = {4, 3, 2, 6};
		Rotate_Function_396 s=new Rotate_Function_396();
		System.out.println(s.maxRotateFunction(A));

	}
}
