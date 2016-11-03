
public class Searcha2DMatrix_74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int left=0,right=matrix.length-1;
        int mid=(left+right)/2;
        while(left<right){
        	if(matrix[mid][0]<target){
        		left=mid;
        		if(matrix[mid+1][0]>target)
        			right--;
        		else
        			left++;
        	}
        	if(matrix[mid][0]>target)
        		right=mid-1;
        	if(matrix[mid][0]==target)
        		return true;
        	mid=(left+right)/2;
        }
        left=0;
        right=matrix[mid].length-1;
        int mid2=(left+right)/2;
        while(left<right){
        	if(matrix[mid][mid2]<target){
        		left=mid2+1;
        	}
        	if(matrix[mid][mid2]>target)
        		right=mid2-1;
        	if(matrix[mid][mid2]==target)
        		return true;
        	mid2=(left+right)/2;
        }
        if(matrix[mid][mid2]==target)
    		return true;
        return false;
    }
    public static void main(String[] args) {
		int[][] ma={{-8,-7,-5,-3,-3,-1,1},{2,2,2,3,3,5,7},{8,9,11,11,13,15,17},{18,18,18,20,20,20,21},{23,24,26,26,26,27,27},{28,29,29,30,32,32,34}};
		int target=-5;
		new Searcha2DMatrix_74().searchMatrix(ma, target);
    }
}
