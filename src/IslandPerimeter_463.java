
public class IslandPerimeter_463 {
	static int result;
	 public int islandPerimeter(int[][] grid) {
	        result=0;
	        int i=0,j=0;
	        boolean isFind=false;
	        for(i=0;i<grid.length&&!isFind;i++)
	            for(j=0;j<grid[i].length&&!isFind;j++)
	                if(grid[i][j]==1)
	                	isFind=true;
	        
	        return result;
	}
}
