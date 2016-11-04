
public class RotateImage_48 {

    public void rotate(int[][] matrix) {
    	int[][] bak=new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
        	for(int j=0;j<matrix.length;j++){
        		bak[i][j]=matrix[i][j];
        	}
        }
        for(int i=0;i<matrix.length;i++){
        	for(int j=0;j<matrix.length;j++)
        		matrix[j][matrix.length-i-1]=bak[i][j];
        }
    }
    
    
    /*
     * clockwise rotate
     * first reverse up to down, then swap the symmetry 
     * 1 2 3     7 8 9     7 4 1
     * 4 5 6  => 4 5 6  => 8 5 2
     * 7 8 9     1 2 3     9 6 3
    */
    public void better_rotate(int[][] matrix) {
    	int tem=0;
    	for(int i=0;i<matrix.length/2;i++){
    		for(int j=0;j<matrix.length;j++){
    			tem=matrix[matrix.length-1-i][j];
    			matrix[matrix.length-1-i][j]=matrix[i][j];
    			matrix[i][j]=tem;
    		}
    	}
    	for(int i=0;i<matrix.length;i++){
    		for(int j=i+1;j<matrix.length;j++){
    			tem=matrix[i][j];
    			matrix[i][j]=matrix[j][i];
    			matrix[j][i]=tem;
    		}
    	}
    }
    
    /*
     * anticlockwise rotate
     * first reverse left to right, then swap the symmetry
     * 1 2 3     3 2 1     3 6 9
     * 4 5 6  => 6 5 4  => 2 5 8
     * 7 8 9     9 8 7     1 4 7
    */
}
