package array;
public class UniquePathsII_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	for(int i=0;i<obstacleGrid.length;i++){
    		if(obstacleGrid[i][0]!=1){
    			obstacleGrid[i][0]=-1;
    		}
    		else
    			break;
    	}
    	for(int i=0;i<obstacleGrid[0].length;i++){
    		if(obstacleGrid[0][i]!=1){
    			obstacleGrid[0][i]=-1;
    		}
    		else
    			break;
    	}
    	for(int i=1;i<obstacleGrid[0].length||i<obstacleGrid.length;i++){
    		for(int j=i;i<obstacleGrid.length&&j<obstacleGrid[0].length;j++){
    			if(obstacleGrid[i][j]==1)
    				continue;
    			obstacleGrid[i][j]=Math.min(0, obstacleGrid[i-1][j])+Math.min(0,obstacleGrid[i][j-1]);
        	}
        	for(int j=i+1;i<obstacleGrid[0].length&&j<obstacleGrid.length;j++){
        		if(obstacleGrid[j][i]==1)
    				continue;
        		obstacleGrid[j][i]=Math.min(0, obstacleGrid[j-1][i])+Math.min(0,obstacleGrid[j][i-1]);
        	}
    	}
    	return -obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
