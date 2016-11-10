package array;
public class GameofLife_289 {
    public void gameOfLife(int[][] board) {
    	//0:dead,1:lived,2:live to live,-1 dead to live
        for(int i=0;i<board.length;i++){
        	for(int j=0;j<board[0].length;j++){
        			int neighbors=getNeighbors(board, i, j, board.length, board[0].length);
        			switch(neighbors){
        			case 2:
        				if (board[i][j]>0)
        					board[i][j]=2;						   					
        				break;
        			case 3:
        				if(board[i][j]>0)
        					board[i][j]=2;
        				else 
        					board[i][j]=-1;
        				break;
        			}
        	}
        }
        for(int i=0;i<board.length;i++){
        	for(int j=0;j<board[0].length;j++){
        		if(board[i][j]!=0){
        			board[i][j]=1;
        		}
        	}
        }
        
    }
    public int getNeighbors(int[][] board,int x,int y,int m,int n){
    	int result=0;
    	for(int i=-1;i<2;i++){
    		if(x+i<0||x+i>=m){
    			continue;
    		}
    		for(int j=-1;j<2;j++){
    			if(y+j<0||y+j>=n){
    				continue;
    			}
    			if(board[x+i][y+j]>=1){
    				result++;
    			}
    		}
    	}
    	return board[x][y]==0?result:result-1;
    }
}
