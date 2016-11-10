package array;

public class PlusOne_66 {
	public int[] plusOne(int[] digits) {
		
        if (digits[digits.length-1]==9) {
        	int i;
			for (i = 1; i <=digits.length; i++) {
				if(digits[digits.length-i]!=9){
					break;
				}
			}
			int[] result=new int[i>0?digits.length:digits.length+1];
			for(int j=1;j<i;j++){
				result[result.length-j]=0;
			}
			for(int j=i;j<=digits.length;j++){
				result[result.length-j]=digits[digits.length-j];
			}
			if(result.length>digits.length){
				result[0]=1;
			}
			else{
				result[result.length-i]++;
			}
			return result;
		}
        else{
        	digits[digits.length-1]++;
        	return digits;
        }
    }
}
